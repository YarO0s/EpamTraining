package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;
import by.denisov.task01javabasics.view.IOData;

public class IfSumIsPositiveCommand implements Command {

    private IOData ioData = new IOData();
    private Data data;
    private ArithmeticService arithmeticOps = new ArithmeticService();

    public IfSumIsPositiveCommand(Data newData){
        data = newData;
    }

    public void perform(){
       boolean result = arithmeticOps.ifSumIsPositive(data.get(0).doubleValue(), data.get(1).doubleValue(), data.get(2).doubleValue());
        ioData.writeData("Result", " " + result+ "\n");
    }
}
