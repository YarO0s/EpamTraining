package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;
import by.denisov.task01javabasics.view.IOData;

public class ReplaceValuesWithXORCommand implements Command{

    private IOData ioData = new IOData();
    private Data data;
    private ArithmeticService arithmeticOps = new ArithmeticService();

    public ReplaceValuesWithXORCommand(Data newData){
        data = newData;
    }

    public void perform(){
        int[] resultArr = arithmeticOps.replaceValuesWithXOR(data.get(0).intValue(), data.get(1).intValue());
        ioData.writeData("Variable 1 - " + resultArr[0], " variable 2 - " + resultArr[1]+ "\n");
    }
}