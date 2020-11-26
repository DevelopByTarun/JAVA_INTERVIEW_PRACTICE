package functionalinterface;

@FunctionalInterface
interface A {
    public void getA();
}

// simple extends functional
interface B extends A {
    public void getB();
}

public class SimpleInterfaceExtendsFunctional implements B {

    public static void main(String[] args) {
        SimpleInterfaceExtendsFunctional calling = new SimpleInterfaceExtendsFunctional();
        calling.getA();
        calling.getB();
    }

    @Override
    public void getA() {
        System.out.println("calling getA() method");
        System.out.println("inside getA() method");
    }

    @Override
    public void getB() {
        System.out.println("calling getB() method");
        System.out.println("inside getB() method");
    }

}
