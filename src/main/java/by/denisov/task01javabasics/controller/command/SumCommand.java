package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;
import by.denisov.task01javabasics.service.validation.Validation;
import by.denisov.task01javabasics.view.IOData;

public class SumCommand implements Command {

    private IOData ioData = new IOData();
    private Data data;
    private ArithmeticService arithmeticOps = new ArithmeticService();
    private boolean isValid;

    public SumCommand (Data newData, boolean newIsValid){
        data = newData;
        isValid = newIsValid;
    }

    public void perform(){
        if(isValid) {
            int result = arithmeticOps.sum(data.get(0).intValue(), data.get(1).intValue());
            ioData.writeData("Result", " " + result + "\n");
        } else {
            ioData.writeData("Input data error\n");
        }
    }

}
