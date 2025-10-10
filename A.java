class A {
    A getA() {
        return this;   // returns the current object
    }

    void message() {
        System.out.println("Hello Everyone...");
    }
}

class TestA {
    public static void main(String arg[]) {
        new A().getA().message();
    }
}
