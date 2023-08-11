package functional;

import java.util.function.Consumer;

//Consumer Functional Interfaces
class ConsumerImpl implements Consumer<String> {


    @Override
    public void accept(String input) {
        System.out.println(input);
    }
}

public class ConsumerDemo {
    public static void main(String[] args) {
//        Consumer<String> consumer = new ConsumerImpl();
//        consumer.accept("Hello Chandrakant!");

        Consumer<String> consumer = (input) -> System.out.println(input);
        consumer.accept("Hello Chandrakant!");
    }
}
