package by.denisov.task01javabasics.controller;

import by.denisov.task01javabasics.controller.command.*;
import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.validation.*;
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
                commandInstance = new SumCommand(data, validator.validate(data, commandData));
                break;

            case "f1":
                validator = new FuncType1Validation();
                commandInstance = new FuncType1Command(data, validator.validate(data, commandData));
                break;

            case "canscap":
                validator = new CansCapValidation();
                commandInstance = new CansCapCommand(data, validator.validate(data, commandData));
                break;

            case "cubeparams":
                validator = new CubeParamsValidation();
                commandInstance = new CubeParametersCommand(data, validator.validate(data, commandData));
                break;

            case "resistance":
                validator = new ParallelResistanceChainValidation();
                commandInstance = new ParallelResistanceChainCommand(data, validator.validate(data, commandData));
                break;

            case "time":
                validator = new TimeChangeValidation();
                commandInstance = new TimeChangeCommand(data, validator.validate(data, commandData));
                break;

            case "evennums":
                validator = new PrintEvenNumsValidation();
                commandInstance = new PrintEvenNumsCommand(data, validator.validate(data, commandData));
                break;

            case "sumofnums":
                validator = new SumOfNumsValidation();
                commandInstance = new SumOfNumsCommand(data, validator.validate(data, commandData));
                break;

            case "numericsequence":
                validator = new NumericalSequenceValidation();
                commandInstance = new NumericalSequenceCommand(data, validator.validate(data, commandData));
                break;

            case "checkvalidity":
                validator = new StringValidationMethodValidation();
                commandInstance = new StringValidationCommand(data, validator.validate(data, commandData));
                break;

            case "compareintegers":
                validator = new DigitsComparisonValidation();
                commandInstance = new DigitsComparisonCommand(data, validator.validate(data, commandData));
                break;

            case "maxvalue":
                validator = new MaxValueValidation();
                commandInstance = new MaxValueCommand(data, validator.validate(data, commandData));
                break;

            case "amountofnegative":
                validator = new AmountOfNegativeValidation();
                commandInstance = new AmountOfNegativeCommand(data, validator.validate(data, commandData));
                break;

            case "doublevaluesincase":
                validator = new DoubleValuesInCaseValidation();
                commandInstance = new DoubleValuesInCaseCommand(data, validator.validate(data, commandData));
                break;

            case "ifsumispositive":
                validator = new IfSumIsPositiveValidation();
                commandInstance = new IfSumIsPositiveCommand(data, validator.validate(data, commandData));
                break;

            case "converttoarabic":
                validator = new ConvertToArabicValidation();
                commandInstance = new ConvertToArabicCommand(data, validator.validate(data, commandData));
                break;

            case "replacevalsxor":
                validator = new ReplaceValuesValidation();
                commandInstance = new ReplaceValuesWithXORCommand(data, validator.validate(data, commandData));
                break;

            case "replacevalsvar":
                validator = new ReplaceValuesValidation();
                commandInstance = new ReplaceValuesWithVariableCommand(data, validator.validate(data, commandData));
                break;

            case "replacevalsaddsubstr":
                validator = new ReplaceValuesValidation();
                commandInstance = new ReplaceValuesWithAdditionCommand(data, validator.validate(data, commandData));
                break;

            default:
                commandInstance = null;
        }
        return commandInstance;
    }
}
