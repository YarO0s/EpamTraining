package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ComparisonService;
import by.denisov.task01javabasics.view.IOData;

public class DigitsComparisonCommand implements Command{

    private Data data;
    private ComparisonService comparisonOps = new ComparisonService();
    private IOData ioData = new IOData();
    private boolean valid;

    public DigitsComparisonCommand(Data newData, boolean newValid){
        data = newData;
        valid = newValid;
    }

    public void perform(){
        if(valid) {
            boolean result = comparisonOps.compareDigits(data.get(0).doubleValue(), data.get(1).doubleValue());
            ioData.writeData("Numbers ", result ? "are equal\n" : "are different\n");
        } else {
            ioData.writeData("Input data error\n");
        }
    }

}
