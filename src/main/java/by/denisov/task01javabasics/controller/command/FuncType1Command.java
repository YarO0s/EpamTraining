package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.FunctionsService;

public class FuncType1Command implements Command {

    FunctionsService functionsOps = new FunctionsService();

    public Double perform(Data data){
        return functionsOps.functionType1(data.remove(0).doubleValue(), data.remove(0).doubleValue(), data.remove(0).doubleValue());
    }

}
