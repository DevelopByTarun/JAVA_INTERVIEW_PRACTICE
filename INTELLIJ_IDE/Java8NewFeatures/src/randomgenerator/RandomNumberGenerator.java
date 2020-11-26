package randomgenerator;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;

public class RandomNumberGenerator {

    private static List<Integer> passwordGenerator = new ArrayList<>();
    private static int passwordLength = 8;

    static {
        IntStream.rangeClosed('0', '9')
                .forEach(RandomNumberGenerator.passwordGenerator::add);
        IntStream.rangeClosed('A', 'Z')
                .forEach(RandomNumberGenerator.passwordGenerator::add);
        IntStream.rangeClosed('#', '*')
                .forEach(RandomNumberGenerator.passwordGenerator::add);
        IntStream.rangeClosed(0, Integer.MIN_VALUE)
                .forEach(RandomNumberGenerator.passwordGenerator::add);
    }

    public static void main(String[] args) {

        System.out.println("======random======");
        System.out.println("passwordGeneratorByRandomInt is given below => ");
        RandomNumberGenerator.passwordGeneratorByRandomInt();
        System.out.println("");

        System.out.println("passwordGeneratorByRandomIntWithRange is given below => ");
        RandomNumberGenerator.passwordGeneratorByRandomIntWithRange();
        System.out.println("");

        System.out.println("passwordGeneratorByRandomDouble is given below => ");
        RandomNumberGenerator.passwordGeneratorByRandomDouble();
        System.out.println("");

        System.out.println("passwordGeneratorByRandomFloat is given below => ");
        RandomNumberGenerator.passwordGeneratorByRandomFloat();
        System.out.println("");

        System.out.println("passwordGeneratorByRandomBoolean is given below => ");
        RandomNumberGenerator.passwordGeneratorByRandomBoolean();
        System.out.println("");

        System.out.println("passwordGeneratorByRandomLong is given below => ");
        RandomNumberGenerator.passwordGeneratorByRandomLong();
        System.out.println("");

        System.out.println("passwordGeneratorByRandomIntStreamWithLambda is given below => ");
        RandomNumberGenerator.passwordGeneratorByRandomIntStreamWithLambda();

        System.out.println("");

        System.out.println("======secure random======");
        System.out.println("passwordGeneratorBySecureRandomInt is given below => ");
        RandomNumberGenerator.passwordGeneratorBySecureRandomInt();
        System.out.println("");

        System.out.println("passwordGeneratorBySecureRandomIntWithRange is given below => ");
        RandomNumberGenerator.passwordGeneratorBySecureRandomIntWithRange();
        System.out.println("");

        System.out.println("passwordGeneratorBySecureRandomFloat is given below => ");
        RandomNumberGenerator.passwordGeneratorBySecureRandomFloat();
        System.out.println("");

        System.out.println("passwordGeneratorBySecureRandomDouble is given below => ");
        RandomNumberGenerator.passwordGeneratorBySecureRandomDouble();
        System.out.println("");

        System.out.println("passwordGeneratorBySecureRandomBoolean is given below => ");
        RandomNumberGenerator.passwordGeneratorBySecureRandomBoolean();
        System.out.println("");

        System.out.println("passwordGeneratorBySecureRandomLong is given below => ");
        RandomNumberGenerator.passwordGeneratorBySecureRandomLong();
        System.out.println("");

        System.out.println("passwordGeneratorBySecureRandomIntStreamWithLambda is given below => ");
        RandomNumberGenerator.passwordGeneratorBySecureRandomIntStreamWithLambda();
    }

    private static void passwordGeneratorByRandomInt() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            int generate = random.nextInt();
            System.out.println(i + ". " + generate);
        }
    }

    private static void passwordGeneratorByRandomIntWithRange() {
        Random random = new Random();
        int range = 50;
        for (int i = 0; i < 10; i++) {
            int generate = random.nextInt(range);
            System.out.println(i + ". " + generate);
        }
    }

    private static void passwordGeneratorByRandomDouble() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double generate = random.nextDouble();
            System.out.println(i + ". " + generate);
        }
    }

    private static void passwordGeneratorByRandomFloat() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            float generate = random.nextFloat();
            System.out.println(i + ". " + generate);
        }
    }

    private static void passwordGeneratorByRandomLong() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            long generate = random.nextLong();
            System.out.println(i + ". " + generate);
        }
    }

    private static void passwordGeneratorByRandomBoolean() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            boolean generate = random.nextBoolean();
            System.out.println(i + ". " + generate);
        }
    }

    private static void passwordGeneratorBySecureRandomInt() {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 10; i++) {
            int generate = secureRandom.nextInt();
            System.out.println(i + ". " + generate);
        }
    }

    private static void passwordGeneratorBySecureRandomIntWithRange() {
        SecureRandom secureRandom = new SecureRandom();
        int range = 50;
        for (int i = 0; i < 10; i++) {
            int generate = secureRandom.nextInt(range);
            System.out.println(i + ". " + generate);
        }
    }

    private static void passwordGeneratorBySecureRandomDouble() {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 10; i++) {
            double generate = secureRandom.nextDouble();
            System.out.println(i + ". " + generate);
        }
    }

    private static void passwordGeneratorBySecureRandomFloat() {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 10; i++) {
            float generate = secureRandom.nextFloat();
            System.out.println(i + ". " + generate);
        }
    }

    private static void passwordGeneratorBySecureRandomLong() {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 10; i++) {
            long generate = secureRandom.nextLong();
            System.out.println(i + ". " + generate);
        }
    }

    private static void passwordGeneratorBySecureRandomBoolean() {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 10; i++) {
            boolean generate = secureRandom.nextBoolean();
            System.out.println(i + ". " + generate);
        }
    }

    private static void passwordGeneratorByRandomIntStreamWithLambda() {
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            random.ints(
                    RandomNumberGenerator.passwordLength,
                    0,
                    RandomNumberGenerator.passwordGenerator.size()
            ).map(RandomNumberGenerator.passwordGenerator::get)
                    .forEach(password -> System.out.print((char) password));
        }
    }

    private static void passwordGeneratorBySecureRandomIntStreamWithLambda() {
        SecureRandom secureRandom = new SecureRandom();
        for (int i = 0; i < 10; i++) {
            secureRandom.ints(
                    RandomNumberGenerator.passwordLength,
                    0,
                    RandomNumberGenerator.passwordGenerator.size()
            ).map(RandomNumberGenerator.passwordGenerator::get)
                    .forEach(password -> System.out.print((char) password));
        }
    }

}
