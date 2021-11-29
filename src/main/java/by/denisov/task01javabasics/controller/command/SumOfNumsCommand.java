package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;

public class SumOfNumsCommand implements Command{

    ArithmeticService arithmeticOps = new ArithmeticService();

    public Integer perform(Data data){
        return arithmeticOps.sumOfNumbers(data.get(0).intValue());
    }

}
