package ru.pojo;

import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setSurname("Ботаник");
        student.setName("Александр");
        student.setPatronymic("Александрович");
        student.setGroup("ЭВМ");
        student.setDateOfAdmission(new Date());

        System.out.println("Студент " + student.getSurname() + " "
                + student.getName() + " " + student.getPatronymic() +
                " зачислен в группу " + student.getGroup());
    }
}
