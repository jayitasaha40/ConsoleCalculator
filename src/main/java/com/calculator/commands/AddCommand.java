package main.java.com.calculator.commands;

import main.java.com.calculator.core.Calculator;

public class AddCommand implements Icommand
{
    Calculator calculator;

    public AddCommand(int operand1, int operand2){
        calculator = new Calculator(operand1,operand2);
    }
    @Override
    public void execute() {
        System.out.println("Adding the numbers...");
        calculator.addition();
        
    }
}
