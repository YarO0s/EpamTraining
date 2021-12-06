package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;
import by.denisov.task01javabasics.view.IOData;

public class NumericalSequenceCommand implements Command {

    private IOData ioData = new IOData();
    private Data data;
    private ArithmeticService arithmeticOps = new ArithmeticService();

    public NumericalSequenceCommand(Data newData){
        data = newData;
    }

    public void perform(){
        double result = arithmeticOps.numericalSequence(data.remove(0).doubleValue(), data.getAll());
        ioData.writeData("Result", " " + result+ "\n");
    }

}
