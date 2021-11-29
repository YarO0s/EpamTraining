package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ComparisonService;
public class MaxValueCommand implements Command{

    ComparisonService comparisonOps = new ComparisonService();

    public Double perform(Data data){
        return comparisonOps.maxValue(data.get(0).doubleValue(), data.get(1).doubleValue());
    }

}
