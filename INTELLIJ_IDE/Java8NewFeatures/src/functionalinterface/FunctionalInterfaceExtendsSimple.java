package functionalinterface;

interface C {
    // we won't extends until we have an abstract method
//    public void getC();
    default void getC() {
        System.out.println("calling getC() method");
        System.out.println("inside getC() method");
    }
}

// functional extends simple
@FunctionalInterface
interface D extends C {
    public void getD();
}

public class FunctionalInterfaceExtendsSimple implements D {

    public static void main(String[] args) {
        FunctionalInterfaceExtendsSimple calling = new FunctionalInterfaceExtendsSimple();
        calling.getC();
        calling.getD();
    }

    @Override
    public void getD() {
        System.out.println("calling getD() method");
        System.out.println("inside getD() method");
    }
}
