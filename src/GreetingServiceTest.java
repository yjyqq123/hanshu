package functionalinterface;

import java.util.Comparator;

/**
 * @author CRQ
 */
public class GreetingServiceTest {
    public static void main(String[] args) {
        GreetingService greetingService = message -> {
            System.out.println(message);
            System.out.println(message.substring(3));

        };
        greetingService.sayMessage("好想吃火锅麻辣小龙虾烤肉魔芋爽牛蛙六食堂麻辣烫山药脆片");

        Runnable runnable= ()-> {
            System.out.println("run");
        };
        runnable.run();
        Comparator comparator = (o1, o2) -> 100;
        int i = (int)comparator.compare(10,10);
        System.out.println(i);
    }
}
