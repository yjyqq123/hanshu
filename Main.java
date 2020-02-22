package functionalinterface;

import java.security.PrivilegedAction;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
        Consumer consumer= o -> System.out.println("接收Object对象但不返回值");
        consumer.accept(consumer);

        Predicate predicate= o -> true;
        boolean flag=predicate.test(predicate);
        System.out.println(flag==true?true:false);

        PrivilegedAction privilegedAction= () -> 100;
        int i = (int) privilegedAction.run();
        System.out.println(i);

    }
}
