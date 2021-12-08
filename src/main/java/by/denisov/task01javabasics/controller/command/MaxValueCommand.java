package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ComparisonService;
import by.denisov.task01javabasics.view.IOData;

public class MaxValueCommand implements Command{

    private IOData ioData = new IOData();
    private Data data;
    private ComparisonService comparisonOps = new ComparisonService();
    private boolean valid;

    public MaxValueCommand(Data newData, boolean newValid){
        data = newData;
        valid = newValid;
    }

    public void perform(){
        if(valid){
            double result = comparisonOps.maxValue(data.get(0).doubleValue(), data.get(1).doubleValue());
            ioData.writeData("Result:", " " + result+ "\n");
        } else {
            System.out.println("Input data error");
        }
    }

}
