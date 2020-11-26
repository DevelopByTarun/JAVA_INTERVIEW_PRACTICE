package lambdaexpression;

import java.util.LinkedHashSet;

public class LambdaExpressionWithNestedClassAndFilter {

    LinkedHashSet<Product> productsList = new LinkedHashSet<Product>();

    public static void main(String[] args) {
        
        LambdaExpressionWithNestedClassAndFilter demo = new LambdaExpressionWithNestedClassAndFilter();
        /*
            1st way to create inner class object
         */
        LambdaExpressionWithNestedClassAndFilter.Product product1 = demo.new Product(101, "mobile", 1505.49f);
        LambdaExpressionWithNestedClassAndFilter.Product product2 = demo.new Product(102, "car", 7857.02f);
        LambdaExpressionWithNestedClassAndFilter.Product product3 = demo.new Product(103, "bike", 8908.78f);
        /*
            2nd way to create inner class object
         */
        Product product4 = demo.new Product(104, "laptop", 12999.11f);
        Product product5 = demo.new Product(105, "xbox", 4500.61f);
        
        Runnable createThread = () -> {
            product1.addProduct(product1);
            product2.addProduct(product2);
            product3.addProduct(product3);
            product4.addProduct(product4);
            product5.addProduct(product5);

            System.out.println("");
            System.out.println("products added successfully");
            System.out.println("");

            product5.getAllProducts();
            System.out.println("");

            product5.getProductsByPrice();
        };
        Thread t = new Thread(createThread);
        t.start();
    }

    public class Product {

        int id;
        String name;
        float price;

        public Product(int id, String name, float price) {
            super();
            this.id = id;
            this.name = name;
            this.price = price;
        }

        private void addProduct(Product prod) {
            LambdaExpressionWithNestedClassAndFilter.this.productsList.add(prod);
        }

        private void getAllProducts() {
            LinkedHashSet<Product> allProducts = LambdaExpressionWithNestedClassAndFilter.this.productsList;
            allProducts.stream().forEach(System.out::println);
        }

        private void getProductsByPrice() {
            LinkedHashSet<Product> filterProducts = LambdaExpressionWithNestedClassAndFilter.this.productsList;
            filterProducts
                    .stream()
                    .filter(f -> f.price >= 2000.21f && f.price <= 10000.56f)
                    .map(m -> m.id + ", " + m.name + ", " + Math.round(m.price))
                    .forEach(System.out::println);
        }

        @Override
        public String toString() {
            return "Product{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

    }
}
