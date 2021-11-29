package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;

public class SumCommand implements Command {

    ArithmeticService arithmeticOps = new ArithmeticService();

    public Integer perform(Data inst){
        int result = arithmeticOps.sum( (int) inst.remove(0), (int) inst.remove(0));
        inst.clear();
        return result;
    }

}
