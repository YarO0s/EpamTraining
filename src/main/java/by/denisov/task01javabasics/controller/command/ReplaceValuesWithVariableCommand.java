package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;
import by.denisov.task01javabasics.view.IOData;

public class ReplaceValuesWithVariableCommand implements Command {

    private IOData ioData = new IOData();
    private Data data;
    private ArithmeticService arithmeticOps = new ArithmeticService();

    public ReplaceValuesWithVariableCommand(Data newData){
        data = newData;
    }

    public void perform(){
        double[] resultArr = arithmeticOps.replaceValuesWithVariable(data.get(0).doubleValue(), data.get(1).doubleValue());
        ioData.writeData("Variable 1 - " + resultArr[0], " variable 2 - " + resultArr[1]+ "\n");
    }
}
