package learning.basics;

public class BankStatementParser {
    public static void main(String[] args) {
        String string = "Платеж;1500.75;Перевод Иванову";
        String[] result = string.split(";");
        double sum = Double.parseDouble(result[1]);
        if (sum > 1000) {
            System.out.println("Крупная операция: " + sum);
        } else {
            System.out.println("Обычная операция: " + sum);
        }
    }
}
