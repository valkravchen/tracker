package com.collection.step1.task1;

public class DynamicStudentArray {
    private Student[] students;
    private int size;
    private int copyOperations;

    public DynamicStudentArray() {
        students = new Student[5];
        size = 0;
        copyOperations = 0;
    }

    public void add(Student student) {
        if (size >= students.length) {
            copyOperations++;
            Student[] newArray = new Student[students.length + 3];
            System.out.println("Массив переполнен! Создаем новый размером: " + newArray.length);
            System.out.println("    Копируем " + students.length + " элементов...");
            System.arraycopy(students, 0, newArray, 0, students.length);
            students = newArray;
        }
        students[size++] = student;
    }

    public void removeById(int id) {
        // Сначала находим индекс студента с нужным id
        int indexToRemove = -1;
        for (int i = 0; i < size; i++) {
            if (students[i].getId() == id) {
                indexToRemove = i;
                break;
            }
        }

        // Если студент не найден
        if (indexToRemove == -1) {
            System.out.println("Студент с id=" + id + " не найден");
            return;
        }

        System.out.println("Удаляем студента " + students[indexToRemove].getName() + " (id=" + id + ") на позиции " + indexToRemove);

        // Сдвигаем элементы влево
        for (int i = indexToRemove; i < size - 1; i++) {
            students[i] = students[i + 1];
            System.out.println("  Сдвигаем: " + students[i].getName() + " <- позиция " + (i + 1) + " на позицию " + i);
        }
        students[--size] = null;
    }

    public int findByName(String name) {
        for (int i = 0; i < size; i++) {
            if (students[i] != null && students[i].getName().equals(name)) {
                return i;
            }
        }
        return -1;
    }

    public int getCopyOperations() {
        return copyOperations;
    }

    public void printAll() {
        System.out.println("\nСписок студентов (всего: " + size + "):");
        for (int i = 0; i < size; i++) {
            System.out.println("  Позиция " + i + ": [id=" + students[i].getId() + "] " +
                    students[i].getName() + " (GPA: " + students[i].getGpa() + ")");
        }
    }

    public static void main(String[] args) {
        System.out.println("=== Тестирование DynamicStudentArray ===\n");

        DynamicStudentArray array = new DynamicStudentArray();

        // Добавляем 6 студентов
        System.out.println("Добавляем студентов:");
        array.add(new Student(1, "Alice Johnson", 3.8));
        array.add(new Student(2, "Bob Smith", 3.5));
        array.add(new Student(3, "Charlie Brown", 3.9));
        array.add(new Student(4, "Diana Davis", 3.7));
        array.add(new Student(5, "Eve Wilson", 3.6));
        array.add(new Student(6, "Frank Miller", 3.4)); // вызовет расширение массива

        // Выводим всех студентов
        array.printAll();
        System.out.println("Текущий размер: " + array.size);

        // Удаляем студента с id=3 (Charlie Brown)
        System.out.println("\n--- Удаление студента с id=3 ---");
        array.removeById(3);

        // Снова выводим всех
        array.printAll();

        // Ищем Eve Wilson
        System.out.println("\n--- Поиск студентов ---");
        int eveIndex = array.findByName("Eve Wilson");
        System.out.println("Индекс 'Eve Wilson': " + eveIndex + " (ожидается 3 после удаления Charlie)");

        // Ищем несуществующего студента
        int johnIndex = array.findByName("John Doe");
        System.out.println("Индекс 'John Doe': " + johnIndex + " (ожидается -1)");

        // Выводим количество операций копирования
        System.out.println("\nКоличество операций копирования массива: " + array.getCopyOperations() + " (ожидается 1)");
    }
}


