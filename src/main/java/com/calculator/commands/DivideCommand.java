package main.java.com.calculator.commands;

import main.java.com.calculator.core.Calculator;

public class DivideCommand implements Icommand
{
    Calculator calculator;
    
    public DivideCommand(int operand1, int operand2){
        calculator = new Calculator(operand1,operand2);
    }
   @Override
   public void execute() {
       calculator.divide();
   } 
}
