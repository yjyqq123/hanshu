package design_pattern.factorymethodpattern;
//乘法类
public class OperationMul extends Operation {
    @Override
    public double getResult() {
        double result=0;
        result = getNumberA()*getNumberB();
        return result;
    }
}