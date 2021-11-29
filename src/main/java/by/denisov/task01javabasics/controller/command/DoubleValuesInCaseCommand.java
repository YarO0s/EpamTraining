package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.service.ComparisonService;
import by.denisov.task01javabasics.entity.Data;

public class DoubleValuesInCaseCommand implements Command{

    ComparisonService comparisonOps = new ComparisonService();

    public Number[] perform (Data data){
        return comparisonOps.doubleValuesInCase(data.remove(0).doubleValue(), data.getAll());
    }

}
