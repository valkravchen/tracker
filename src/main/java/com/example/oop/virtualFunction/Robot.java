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
        Machine machine = new Machine("Tesla", 2020);
        Robot robot1 = new Robot("Boston Dynamics", 2022, "Atlas");
        Machine machine1 = new Robot("Honda", 2021, "Asimo");
    }
}
