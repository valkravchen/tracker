package learning.basics;

public class A {
    static { System.out.print("1"); }
    { System.out.print("2"); }

    A() { System.out.print("3"); }

    public static void main(String[] args) {
        new A();
        new A();
    }
}
