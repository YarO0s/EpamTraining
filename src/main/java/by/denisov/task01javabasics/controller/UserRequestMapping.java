package by.denisov.task01javabasics.controller;

import by.denisov.task01javabasics.controller.command.*;
import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.validation.SumValidation;
import by.denisov.task01javabasics.service.validation.Validation;
import by.denisov.task01javabasics.view.RequestListener;
import by.denisov.task01javabasics.view.RequestResolver;


/**
 * Responsible for mapping and executing commands
 */
public class UserRequestMapping {

    RequestResolver requestListener = new RequestListener();
    Data data = new Data();


    /**
     * Infinite cycle, executing until user will input 'exit' request and
     * null will be returned from RequestListener(
     * @see RequestListener).
     */
    public void run() {

        String requestData[];

        do{

        // get new user request
        requestData = requestListener.mapRequest();

        // map and execute command if request is not null
        if(requestData != null) {
            Command commandToExecute = requestMapping(requestData);
            commandToExecute.perform();
            data.clear();
        }
        else return;
        } while (requestData != null);
    }

    /**
     * Maps the command, validates data and provides the command with it.
     * @param commandData Array with command as a first element and others as data.
     * @return the defined command object
     */
    private Command requestMapping(String... commandData){

        Command commandInstance;
        Validation validator;

        switch (commandData[0]) {

            case "sum":
                validator = new SumValidation();
                commandInstance = new SumCommand(data, validator.Validate(data, commandData));
                break;

            case "f1":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Double.parseDouble(commandData[i]));
                }
                commandInstance = new FuncType1Command(data);
                break;

            case "canscap":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Double.parseDouble(commandData[i]));
                }
                commandInstance = new CansCapCommand(data);
                break;

            case "cubeparams":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Double.parseDouble(commandData[i]));
                }
                commandInstance = new CubeParametersCommand(data);
                break;

            case "resistance":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Double.parseDouble(commandData[i]));
                }
                commandInstance = new ParallelResistanceChainCommand(data);
                break;

            case "time":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Integer.parseInt(commandData[i]));
                }
                commandInstance = new TimeChangeCommand(data);
                break;

            case "evennums":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Integer.parseInt(commandData[i]));
                }
                commandInstance = new PrintEvenNumsCommand(data);
                break;

            case "sumofnums":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Integer.parseInt(commandData[i]));
                }
                commandInstance = new SumOfNumsCommand(data);
                break;

            case "numericsequence":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Double.parseDouble(commandData[i]));
                }
                commandInstance = new NumericalSequenceCommand(data);
                break;

            case "checkvalidity":
                for(int i = 1; i < commandData.length; i++){
                    data.add(commandData[1]);
                }
                commandInstance = new StringValidationCommand(data);
                break;

            case "compareintegers":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Integer.parseInt(commandData[i]));
                }
                commandInstance = new DigitsComparisonCommand(data);
                break;

            case "maxvalue":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Double.parseDouble(commandData[i]));
                }
                commandInstance = new MaxValueCommand(data);
                break;

            case "amountofnegative":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Integer.parseInt(commandData[i]));
                }
                commandInstance = new AmountOfNegativeCommand(data);
                break;

            case "doublevaluesincase":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Double.parseDouble(commandData[i]));
                }
                commandInstance = new DoubleValuesInCaseCommand(data);
                break;

            case "ifsumispositive":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Double.parseDouble(commandData[i]));
                }
                commandInstance = new IfSumIsPositiveCommand(data);
                break;

            case "converttoarabic":
                for(int i = 1; i < commandData.length; i++){
                    data.add(commandData[1]);
                }
                commandInstance = new ConvertToArabicCommand(data);
                break;

            case "replacevalsxor":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Integer.parseInt(commandData[i]));
                }
                commandInstance = new ReplaceValuesWithXORCommand(data);
                break;

            case "replacevalsvar":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Double.parseDouble(commandData[i]));
                }
                commandInstance = new ReplaceValuesWithVariableCommand(data);
                break;

            case "replacevalsaddsubstr":
                for(int i = 1; i < commandData.length; i++){
                    data.add(Double.parseDouble(commandData[i]));
                }
                commandInstance = new ReplaceValuesWithAdditionCommand(data);
                break;

            default:
                commandInstance = null;
        }
        return commandInstance;
    }
}
