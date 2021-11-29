package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.service.ArithmeticService;
import by.denisov.task01javabasics.entity.Data;

public class AmountOfNegativeCommand implements Command{

    ArithmeticService arithmeticOps = new ArithmeticService();

    public Integer perform(Data data){
        return arithmeticOps.amountOfNegative(data.get(0).doubleValue(), data.get(1).doubleValue(), data.get(2).doubleValue());
    }

}
