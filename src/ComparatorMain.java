package functionalinterface;

import java.util.Comparator;

/**
 * @author CRQ
 */
public class ComparatorMain {
    public static void main(String[] args) {
        Comparator comparator = (o1, o2) -> 100;
        int i = (int)comparator.compare(10,10);
        System.out.println(i);
    }
}
