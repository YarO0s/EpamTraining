package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.StringProcessService;
import by.denisov.task01javabasics.view.IOData;

public class StringValidationCommand implements Command{

    private IOData ioData = new IOData();
    private Data data;
    private StringProcessService StringProcessService = new StringProcessService();
    private boolean valid;

    public StringValidationCommand(Data newData, boolean newValid){
        data = newData;
        valid = newValid;
    }

    public void perform(){
        if(valid) {
            boolean result = StringProcessService.ifStringValid(data.getStringData(0));
            ioData.writeData("String is ", result ? "valid\n" : "not valid\n");
        } else {
            ioData.writeData("Input data error\n");
        }

    }

}
