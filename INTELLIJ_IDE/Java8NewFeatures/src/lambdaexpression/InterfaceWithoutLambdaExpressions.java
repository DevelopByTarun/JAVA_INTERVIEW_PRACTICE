package lambdaexpression;

import java.util.ArrayList;
import java.util.stream.Collectors;

interface ArrayListDemo {

    public void getSumAndTotalOfList();
}

public class InterfaceWithoutLambdaExpressions {

    private static ArrayList<Integer> sumAndTotalOfMyList = new ArrayList<Integer>();

    private static void addIntegerValuesInList() {
        if (InterfaceWithoutLambdaExpressions.sumAndTotalOfMyList.size() == 0) {
            for (int i = 99; i < 199; i++) {
                InterfaceWithoutLambdaExpressions.sumAndTotalOfMyList.add(i);
            }
        }
    }

    public InterfaceWithoutLambdaExpressions() {
        // add some values
        InterfaceWithoutLambdaExpressions.addIntegerValuesInList();
    }

    public static void main(String[] args) {

        new InterfaceWithoutLambdaExpressions();

        // implement interface method anonymous without lambda
        ArrayListDemo dummy = new ArrayListDemo() {

            @Override
            public void getSumAndTotalOfList() {
                // get all list data
                sumAndTotalOfMyList.forEach(System.out::println);
                System.out.println();
                // total no if item
                int sum = sumAndTotalOfMyList.stream().collect(Collectors.summingInt(Integer::intValue));
                System.out.println("sum of items in the list => " + sum);
                // count list items
                Long total = sumAndTotalOfMyList.stream().collect(Collectors.counting());
                System.out.println("total numbers of items in the list => " + total);
            }
        };
        // call interface method
        dummy.getSumAndTotalOfList();
    }

}
