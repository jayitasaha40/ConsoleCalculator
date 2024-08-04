package main.java.com.calculator.core;

public class Calculator {
    int operand1;
    int operand2;

    public Calculator(int operand1,int operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    public void addition(){
        System.out.println(operand1 + operand2);
    }

    public void substract(){
        System.out.println(operand1 - operand2);
    }

    public void multiply(){
        System.out.println(operand1 * operand2);
    }

    public void divide(){
        if (operand2 == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        System.out.println(operand1/operand2);
    }
}
