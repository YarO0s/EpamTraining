package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.service.ComparisonService;
import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.view.IOData;

public class DoubleValuesInCaseCommand implements Command{

    private IOData ioData = new IOData();
    private Data data;
    private ComparisonService comparisonOps = new ComparisonService();
    private boolean valid;

    public DoubleValuesInCaseCommand(Data newData, boolean newValid){
        data = newData;
        valid = newValid;
    }

    public void perform (){
        if(valid) {
            double[] result = comparisonOps.doubleValuesInCase(data.remove(0).doubleValue(), data.getAll());
            ioData.writeData("Result: ");
            for (double value : result) {
                ioData.writeData("\n" + value);
            }
        } else{
            ioData.writeData("Input data error");
        }
    }

}
