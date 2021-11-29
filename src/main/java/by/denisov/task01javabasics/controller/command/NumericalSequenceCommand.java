package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;

public class NumericalSequenceCommand implements Command {

    ArithmeticService arithmeticOps = new ArithmeticService();

    public Double perform(Data data){
        return arithmeticOps.numericalSequence(data.remove(0).doubleValue(), data.getAll());
    }

}
