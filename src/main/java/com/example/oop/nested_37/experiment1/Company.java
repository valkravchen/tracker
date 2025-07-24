package com.example.oop.nested_37.experiment1;

public class Company {
    private String companyName = "ТехКорп";
    private static String industry = "IT-отрасль";

    static class Department {
        private String name;

        public Department(String name) {
            this.name = name;
        }

        public void showInfo() {
            System.out.println("Статический вложенный: " + name + " в " + industry);
        }
    }

    class Employee {
        private String employeeName;

        public Employee(String employeeName) {
            this.employeeName = employeeName;
        }

        public void introduce() {
            System.out.println("Внутренний класс: " + employeeName + " работает в " + companyName);
        }
    }

    public void processApplications() {
        String status = "Локальный статус";
        class Application {
            private String applicantName;

            public Application(String applicantName) {
                this.applicantName = applicantName;
            }

            public void process() {
                System.out.println("Локальный класс: заявка от " + applicantName + " со статусом " + status);
            }
        }

        Application application = new Application("Иван Петров");
        application.process();
    }

    public void createTask(String taskName) {
        interface Task {
            void execute();
        }

        Task task = new Task() {
            @Override
            public void execute() {
                System.out.println("Анонимный класс: выполняю " + taskName);
            }
        };

        task.execute();
    }

    public static void main(String[] args) {
        Company.Department department = new Department("Разработка");
        department.showInfo();
        Company company = new Company();
        Company.Employee employee = company.new Employee("Алексей");
        employee.introduce();
        company.processApplications();
        company.createTask("код-ревью");
    }
}
