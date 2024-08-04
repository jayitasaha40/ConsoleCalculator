package main.java;

import java.util.Scanner;
import main.java.com.calculator.commands.Icommand;
import main.java.com.calculator.commands.AddCommand;
import main.java.com.calculator.commands.DivideCommand;
import main.java.com.calculator.commands.MultiplyCommand;
import main.java.com.calculator.commands.SubtractCommand;
import main.java.com.calculator.core.CommandInvoker;

public class ConsoleCalculator {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        printWelcomeMessage();

        while (true) {
            int operand1 = getUserInput("Please Enter the First Operand");
            int operand2 = getUserInput("Please Enter the Second Operand");
            showMenu();
            int actionNumber = getUserInput("Please choose any option from the above list");
            performAction(actionNumber, operand1, operand2);
        }

       // sc.close();

    }

    private static void printWelcomeMessage() {
        System.out.println("░██╗░░░░░░░██╗███████╗██╗░░░░░░█████╗░░█████╗░███╗░░░███╗███████╗");
        System.out.println("░██║░░██╗░░██║██╔════╝██║░░░░░██╔══██╗██╔══██╗████╗░████║██╔════╝");
        System.out.println("░╚██╗████╗██╔╝█████╗░░██║░░░░░██║░░╚═╝██║░░██║██╔████╔██║█████╗░░");
        System.out.println("░░████╔═████║░██╔══╝░░██║░░░░░██║░░██╗██║░░██║██║╚██╔╝██║██╔══╝░░");
        System.out.println("░░╚██╔╝░╚██╔╝░███████╗███████╗╚█████╔╝╚█████╔╝██║░╚═╝░██║███████╗");
        System.out.println("░░░╚═╝░░░╚═╝░░╚══════╝╚══════╝░╚════╝░░╚════╝░╚═╝░░░░░╚═╝╚══════╝");
    }

    private static void showMenu() {
        System.out.println("***********************MENU*********************************");
        System.err.println("1. Addition");
        System.err.println("2. Substraction");
        System.err.println("3. Multiplication");
        System.err.println("4. Division");
        System.err.println("0. Exit");
        System.out.println("************************************************************");
    }

    private static int getUserInput(String inputMessage) {
        System.out.println(inputMessage + " : ");
        int userInput = sc.nextInt();
        return userInput;
    }

    private static void performAction(int actionNumber, int operand1, int operand2) {
        Icommand command;
        CommandInvoker commandInvoker = new CommandInvoker();
        try
        {
        switch (actionNumber) {
            case 1:
                command = new AddCommand(operand1, operand2);
                commandInvoker.setCommand(command);
                commandInvoker.runCommand();
                break;

            case 2:
                command = new SubtractCommand(operand1, operand2);
                commandInvoker.setCommand(command);
                commandInvoker.runCommand();
                break;

            case 3:
                command = new MultiplyCommand(operand1, operand2);
                commandInvoker.setCommand(command);
                commandInvoker.runCommand();
                break;

            case 4:
                command = new DivideCommand(operand1, operand2);
                commandInvoker.setCommand(command);
                commandInvoker.runCommand();
                break;

            case 0:
                System.out.println("Exiting...");
                System.exit(200);

            default:
                System.out.println("Wrong option seleted");
                break;
        }
    }
    catch(ArithmeticException ex){
        System.err.println(ex.getMessage());
    }
    catch(Exception ex){
        System.err.println("Something went wrong!");
    }
    }
}
