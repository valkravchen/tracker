package com.example.oop.virtualFunction;

public class Robot extends Machine {
    private String model;
    private String parentOperateResult;

    public Robot(String brand, int year, String model) {
        super(brand, year);
        this.parentOperateResult = super.operate();
        this.model = validateModel(model);
    }

    private String validateModel(String model) {
        if (model == null || model.trim().isEmpty()) {
            throw new IllegalArgumentException("Модель не может быть null или пустой строкой");
        }
        return model;
    }

    @Override
    public String operate() {
        return "Робот выполняет задачу: " + super.operate();
    }

    public static String getType() {
        return "Робот";
    }

    public String getParentOperate() {
        return super.operate();
    }

    public String tryOverrideFinal() {
        return "Невозможно переопределить final метод getDescription()";
    }

    public String getModel() {
        return model;
    }

    public String getParentOperateResult() {
        return parentOperateResult;
    }

    public static void main(String[] args) {
        Machine machine1 = new Machine("Tesla", 2020);
        Robot robot = new Robot("Boston Dynamics", 2022, "Atlas");
        Machine machine2 = new Robot("Honda", 2021, "Asimo");
        System.out.println(Machine.getType());
        System.out.println(machine1.getType());
        System.out.println(machine1.operate());
        System.out.println(machine1.getDescription());
        System.out.println();
        System.out.println(Robot.getType());
        System.out.println(robot.getType());
        System.out.println(robot.operate());
        System.out.println(robot.getDescription());
        System.out.println(robot.getParentOperate());
        System.out.println(robot.getParentOperateResult());
        System.out.println();
        System.out.println(machine2.getType());
        System.out.println(machine2.operate());
        System.out.println(machine2.getDescription());
    }
}
