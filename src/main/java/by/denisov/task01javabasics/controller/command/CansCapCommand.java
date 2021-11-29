package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;

public class CansCapCommand implements Command {

    ArithmeticService arithmeticOps = new ArithmeticService();

    public Double perform(Data d){
        return arithmeticOps.cansCapacity( d.remove(0).intValue(), d.remove(0).intValue(), d.remove(0).intValue(), d.remove(0).intValue());
    }

}
