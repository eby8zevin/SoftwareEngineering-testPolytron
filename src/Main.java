public class Main { // Class

    static void method1() {
        System.out.println("Hi, Polytron!"); // Statement
    }

    static void method2() {
        System.out.println("My Name is Ahmad Abu Hasan"); // Statement
    }

    public static void main(String[] args) {
        method1();
        method2();

        ExampleClass exampleClass = new ExampleClass();
        exampleClass.run();
    } // from { to } this is Statement
}

class ExampleClass { // Class
    void run() {
        System.out.println("Good luck.");
    }
}
