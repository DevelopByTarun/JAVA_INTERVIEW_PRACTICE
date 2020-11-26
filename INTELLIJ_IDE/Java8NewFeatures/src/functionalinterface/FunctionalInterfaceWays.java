package functionalinterface;

@FunctionalInterface
interface IProducer {
    public void getProducer(String str) throws Exception;
}

@FunctionalInterface
interface IConsumer {
    public void getConsumer(String str) throws Exception;
}

interface ISupplier {
    public void getSupplier(String str) throws Exception;
}

@FunctionalInterface
interface IRetailer {
    public void getRetailer(String str) throws Exception;
}

public class FunctionalInterfaceWays implements IProducer, IConsumer {

    // default implementation
    @Override
    public void getProducer(String str) throws Exception {
        System.out.println(str+ " is started the production to make products");
    }

    // default implementation
    @Override
    public void getConsumer(String str) throws Exception {
        System.out.println(str+ " is started to consume the products");
    }

    public static void main(String[] args) throws Exception {

        // implementation like anonymous class
        ISupplier supplies = new ISupplier() {
            @Override
            public void getSupplier(String str) throws Exception {
                System.out.println(str+ " is started to supply the products");
            }
        };

        // implementation with lambda
        IRetailer retail = (str) -> {
            System.out.println(str+ " is started to selling the products");
        };

        FunctionalInterfaceWays ways = new FunctionalInterfaceWays();
        ways.getProducer("producer");
        ways.getConsumer("consumer");
        supplies.getSupplier("supplier");
        retail.getRetailer("retailer");
    }
}
