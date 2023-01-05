package strategy;

import java.util.Objects;
import java.util.Scanner;

public class ExampleApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int firstNumber = input.nextInt();
        String action = input.next();
        int secondNumber = input.nextInt();

        Context context = new Context();


        if (Objects.equals(action, "+")) {
            context.setStrategy(new ConcreteStrategyAdd());
        }
        if (Objects.equals(action, "-")) {
            context.setStrategy(new ConcreteStrategySubtract());
        }
        if (Objects.equals(action, "*")) {
            context.setStrategy(new ConcreteStrategyMultiphy());
        }


        int result = context.executeStrategy(firstNumber, secondNumber);
        System.out.println("= " + result);

    }
}
