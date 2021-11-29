package by.denisov.task01javabasics.controller;



import by.denisov.task01javabasics.controller.command.DoubleValuesInCaseCommand;
import by.denisov.task01javabasics.service.ArithmeticService;
import by.denisov.task01javabasics.view.IOData;
import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.controller.command.*;
import by.denisov.task01javabasics.view.RequestResolver;
import by.denisov.task01javabasics.view.UserRequestMapping;


public class Runner {

    public static void main(String... args) {

        RequestResolver userRequestMapping = new UserRequestMapping();
        userRequestMapping.mapRequest();
    }

}
