package main.java.com.calculator.core;

import main.java.com.calculator.commands.Icommand;

public class CommandInvoker {
    Icommand command;

    public void setCommand(Icommand command){
        this.command = command;
    }

    public void runCommand(){
        command.execute();
    }
}
