package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;

public class IfSumIsPositive implements Command {

    ArithmeticService arithmeticOps = new ArithmeticService();

    public Boolean perform(Data data){
       return arithmeticOps.ifSumIsPositive(data.get(0).doubleValue(), data.get(1).doubleValue(), data.get(2).doubleValue());
    }
}
