package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.StringProcessService;
import by.denisov.task01javabasics.view.IOData;

public class ConvertToArabicCommand implements Command {

    private IOData ioData = new IOData();
    private Data data;
    private StringProcessService stringProcessOps = new StringProcessService();

    public ConvertToArabicCommand(Data newData){
        data = newData;
    }

    public void perform(){
        int result = stringProcessOps.convertToArabic(data.getStringData(0));
        ioData.writeData("Result", " " + result+ "\n");
    }

}
