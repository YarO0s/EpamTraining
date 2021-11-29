package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ComparisonService;

public class DigitsComparisonCommand implements Command{

    ComparisonService comparisonOps = new ComparisonService();

    public Boolean perform(Data data){
        return comparisonOps.compareDigits(data.get(0).doubleValue(), data.get(1).doubleValue());
    }

}
