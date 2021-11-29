package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.StringProcessService;

public class ConvertToArabicCommand implements Command {

    StringProcessService stringProcessOps = new StringProcessService();

    public Integer perform(Data data){
        return stringProcessOps.convertToArabic(data.getStringData());
    }

}
