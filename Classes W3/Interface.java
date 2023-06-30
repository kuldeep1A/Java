interface FirstInterface {
    void myMethod(); // interface method and interface method by default public or abstract

    default void myMethode() {
        System.out.println("hello Interface");
    }
}

interface SecondInterface {
    void myOtherMethod(); // interface method and interface method by default public or abstract
}

// DemoClass "implements" FirstInterface and SecondInterface
class DemoClass implements FirstInterface, SecondInterface {
    public void myMethod() {
        System.out.println("Some text..");
    }

    public void myOtherMethod() {
        System.out.println("Some other text...");
    }
}

class Interface {
    public static void main(String[] args) {
        DemoClass myObj = new DemoClass();
        myObj.myMethod();
        myObj.myOtherMethod();
        myObj.myMethode();
    }
}
