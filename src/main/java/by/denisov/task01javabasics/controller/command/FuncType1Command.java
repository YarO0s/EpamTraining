package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.FunctionsService;
import by.denisov.task01javabasics.view.IOData;

public class FuncType1Command implements Command {

    private IOData ioData = new IOData();
    private Data data;
    private FunctionsService functionsOps = new FunctionsService();

    public FuncType1Command(Data newData){
        data = newData;
    }

    public void perform(){
        double result = functionsOps.functionType1(data.remove(0).doubleValue(), data.remove(0).doubleValue(), data.remove(0).doubleValue());
        ioData.writeData("Result" + result+ "\n");
    }

}
