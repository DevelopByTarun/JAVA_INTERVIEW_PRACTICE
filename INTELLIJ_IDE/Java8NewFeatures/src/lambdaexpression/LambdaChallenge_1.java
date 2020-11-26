package lambdaexpression;


import java.util.function.Function;

public class LambdaChallenge_1 {

    public static void main(String[] args) {

        // write method with lambda expression
        Function<String, String> createMethod = convert -> {
            StringBuilder builder = new StringBuilder();
            for (int i = 0; i < convert.length(); i++) {
                if (i % 2 == 1) {
                    builder.append(convert.charAt(i));
                }
            }
            return builder.toString();
        };
        System.out.println(createMethod.apply("quick fox jumps over the little lazy dog"));
        
        // write anonymous class without lambda expressions
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println();
                System.out.println("anonymous class without lambda is given below => ");
                String line = "quick fox jumps over the little lazy dog";
                String[] lineParts = line.split(" ");
                for (String value : lineParts) {
                    System.out.println(value);
                }
            }
        };
        Thread t = new Thread(runnable);
        t.start();

        // write anonymous class with lambda expressions
        Runnable runnable1 = () -> {
            System.out.println();
            System.out.println("anonymous class with lambda is given below => ");
            String line = "quick fox jumps over the little lazy dog";
            String[] lineParts = line.split(" ");
            for (String value : lineParts) {
                System.out.println(value);
            }
        };
        Thread t1 = new Thread(runnable1);
        t1.start();
    }

}
