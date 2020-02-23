package FunctionalInterance;

import java.util.function.BinaryOperator;
import java.util.function.Consumer;

public class TestDemo {
    public static void main(String[] args) {
        FunctionInterface functionInterfaceTest= message -> {
            System.out.println( message);
        };
        functionInterfaceTest.inform("获得一条通知信息");

        //BinaryOperator description:  接受两个T对象，返回T对象
        BinaryOperator<Integer>add = (o, o2) -> o+o2;
        System.out.println(add.apply(3,5));

        Consumer consumer= o -> {
            String str= (String) o;
            //把所有单词按照空格分隔成一个数组
            String [] arr=str.split(" ");
            //把单词按照长度排序
            for (int j = 0; j <arr.length-1 ; j++) {
                for (int k = 0; k < arr.length-1; k++) {
                    if (arr[k].length()<arr[k+1].length()){
                        String temp=arr[k+1];
                        arr[k+1]=arr[k];
                        arr[k]=temp;
                    }
                }
            }
            for (int j = 0; j <arr.length ; j++) {
                System.out.print(arr[j] + "/n");
                if (j==4){
                    break;
                }
            }
        };
        consumer.accept("a bc def ghi jklm nopqr stuvwx y z");
    }
}
