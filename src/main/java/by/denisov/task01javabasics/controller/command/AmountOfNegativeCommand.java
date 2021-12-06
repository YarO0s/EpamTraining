package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.service.ArithmeticService;
import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.view.IOData;

public class AmountOfNegativeCommand implements Command{

    private Data data;
    private IOData ioData = new IOData();
    private ArithmeticService arithmeticOps = new ArithmeticService();

    public AmountOfNegativeCommand(Data newData){
        data = newData;
    }

    public void perform(){
        int result = arithmeticOps.amountOfNegative(data.get(0).doubleValue(), data.get(1).doubleValue(), data.get(2).doubleValue());
        ioData.writeData("Result", " "+result + "\n");
    }

}
