package com.example.oop.nestedClasses;

public class MyList {
    private final String[] items;

    public MyList(String[] items) {
        this.items = validateItems(items);
    }

    public class Iterator {
        private int index = 0;

        public boolean hasNext() {
            return index < items.length;
        }

        public String next() {
            if (!hasNext()) {
                throw new IllegalStateException("Нет элементов");
            }
            return items[index++];
        }
    }

    public Iterator iterator() {
        return new Iterator();
    }

    private String[] validateItems(String[] items) {
        if (items == null) {
            throw new IllegalArgumentException("Массив не может быть null");
        }
        return items;
    }

    public static void main(String[] args) {
        MyList myList = new MyList(new String[] {"Item1", "Item2"});
        MyList.Iterator iterator = myList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
