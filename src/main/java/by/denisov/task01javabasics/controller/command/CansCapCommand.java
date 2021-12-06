package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;
import by.denisov.task01javabasics.view.IOData;

public class CansCapCommand implements Command {

    private IOData ioData = new IOData();
    private Data data;
    private ArithmeticService arithmeticOps = new ArithmeticService();

    public CansCapCommand(Data newData){
        data = newData;
    }

    public void perform(){
        double result = arithmeticOps.cansCapacity(data.get(0).doubleValue(), data.get(1).doubleValue(), data.get(2).doubleValue(), data.get(3).doubleValue());
        ioData.writeData("Result", " " + result+ "\n");
    }

}
