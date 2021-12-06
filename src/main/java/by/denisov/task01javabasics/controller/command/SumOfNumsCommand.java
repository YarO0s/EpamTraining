package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;
import by.denisov.task01javabasics.view.IOData;

public class SumOfNumsCommand implements Command{

    private IOData ioData = new IOData();
    private Data data;
    private ArithmeticService arithmeticOps = new ArithmeticService();

    public SumOfNumsCommand(Data newData){
        data = newData;
    }

    public void perform(){
        int result = arithmeticOps.sumOfNumbers(data.get(0).intValue());
        ioData.writeData("Result", " " + result+ "\n");
    }

}
