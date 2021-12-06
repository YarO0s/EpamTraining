package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.service.ComparisonService;
import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.view.IOData;

public class DoubleValuesInCaseCommand implements Command{

    private IOData ioData = new IOData();
    private Data data;
    private ComparisonService comparisonOps = new ComparisonService();

    public DoubleValuesInCaseCommand(Data newData){
        data = newData;
    }

    public void perform (){
        double[] result = comparisonOps.doubleValuesInCase(data.remove(0).doubleValue(), data.getAll());
        ioData.writeData("Result: ");
        for(double value : result){
            ioData.writeData("\n" + value);
        }
    }

}
