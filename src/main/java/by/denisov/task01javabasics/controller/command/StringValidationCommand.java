package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.StringProcessService;

public class StringValidationCommand implements Command{

    StringProcessService StringProcessService = new StringProcessService();

    public Boolean perform(Data data){
        return StringProcessService.ifStringValid(data.getStringData());
    }

}
