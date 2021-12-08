package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;
import by.denisov.task01javabasics.view.IOData;

public class ReplaceValuesWithVariableCommand implements Command {

    private IOData ioData = new IOData();
    private Data data;
    private ArithmeticService arithmeticOps = new ArithmeticService();
    private boolean valid;
    public ReplaceValuesWithVariableCommand(Data newData, boolean newValid){
        data = newData;
        valid = newValid;
    }

    public void perform(){
        if(valid) {
            int[] resultArr = arithmeticOps.replaceValuesWithVariable(data.get(0).intValue(), data.get(1).intValue());
            ioData.writeData("Variable 1 - " + resultArr[0], " variable 2 - " + resultArr[1] + "\n");
        } else {
            ioData.writeData("Input data error\n");
        }
    }
}
