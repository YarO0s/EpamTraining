package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.controller.command.Command;
import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.ArithmeticService;

public class TimeChangeCommand implements Command{

    ArithmeticService arithmeticOps = new ArithmeticService();

    public Integer[] perform(Data data){
        Integer[] array = {data.get(0).intValue(),data.get(1).intValue(),data.get(2).intValue(),
                        data.get(3).intValue(),data.get(4).intValue(),data.get(5).intValue()};

        return arithmeticOps.timeChange(array);
    }

}
