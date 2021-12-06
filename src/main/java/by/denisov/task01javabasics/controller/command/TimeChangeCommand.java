package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.controller.command.Command;
import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;
import by.denisov.task01javabasics.view.IOData;

public class TimeChangeCommand implements Command{

    IOData ioData = new IOData();
    private Data data;
    private ArithmeticService arithmeticOps = new ArithmeticService();

    public TimeChangeCommand(Data newData){
        data = newData;
    }

    public void perform(){
        int[] result = arithmeticOps.timeChange(data.get(0).intValue(),data.get(1).intValue(),data.get(2).intValue(),
                data.get(3).intValue(),data.get(4).intValue(),data.get(5).intValue());

        ioData.writeData("Result: ", "H " + result[0], "M " + result[1], "S " +result[2] + "\n");
    }

}
