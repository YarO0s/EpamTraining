package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;

public class PrintEvenNumsCommand implements Command {

    ArithmeticService arithmeticOps = new ArithmeticService();

    public String perform(Data data){
        return arithmeticOps.printEvenNums(data.get(0).intValue(), data.get(1).intValue());
    }
}
