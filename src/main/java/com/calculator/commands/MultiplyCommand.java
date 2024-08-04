package main.java.com.calculator.commands;

import main.java.com.calculator.core.Calculator;

public class MultiplyCommand implements Icommand
{
    Calculator calculator;

    public MultiplyCommand(int operand1, int operand2){
        calculator = new Calculator(operand1,operand2);
    }
    @Override
    public void execute() {
        calculator.multiply();
    }
}
