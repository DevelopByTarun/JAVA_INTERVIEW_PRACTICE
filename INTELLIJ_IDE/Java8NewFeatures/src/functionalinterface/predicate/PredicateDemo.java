package functionalinterface.predicate;

import java.util.function.Predicate;

class PredicateWay_1 implements Predicate<Person> {

    @Override
    public boolean test(Person person) {
        return person.getName().length() >= 1 && person.getAge() < 25;
    }
}

class PredicateWay_2 {

    public static void checkAge() {
        Predicate<Person> way_2 = new Predicate<Person>() {
            @Override
            public boolean test(Person person) {
                return person.getAge() >= 18 && person.getAge() <= 21;
            }
        };
    }
}

class PredicateWay_3 {

    public static void checkName() {
        Predicate<Person> way_3 = (person) -> {
            return person.getName().startsWith("t") && person.getName().endsWith("n");
        };
    }
}

public class PredicateDemo {
}
