package by.denisov.task01javabasics.view;

import by.denisov.task01javabasics.controller.command.*;
import by.denisov.task01javabasics.entity.Data;

public class UserRequestMapping implements RequestResolver{

    public void mapRequest(){
        IOData ioData = new IOData();
        ioData.printLabel();
        Data dataInstance = new Data();
        Command command;

        do{
            String instruction = ioData.inputStringData();

            switch(instruction) {

                case "exit":
                    return;

                case "help":
                    ioData.printInstructions();
                    break;

                case "sum":
                    ioData.outputData("Input the first value");
                    dataInstance.add(ioData.inputIntData());
                    ioData.outputData("Input the second value");
                    dataInstance.add(ioData.inputIntData());
                    command = new SumCommand();
                    ioData.outputData("Result: " + command.perform(dataInstance));
                    break;

                case "function":
                    ioData.outputData("Available functions:\nFunction 1: z=((a-3)*b/2)+c");
                    ioData.outputData("Choose the function from the list below, specifying particular index");

                    int functionType = ioData.inputIntData();

                    switch(functionType){
                        case 1:
                            ioData.outputData("Input a:");
                            dataInstance.add(ioData.inputDoubleData());
                            ioData.outputData("Input b:");
                            dataInstance.add(ioData.inputDoubleData());
                            ioData.outputData("Input c:");
                            dataInstance.add(ioData.inputDoubleData());
                            command = new FuncType1Command();
                            ioData.outputData("z = " + command.perform(dataInstance));
                            break;

                        default:
                            ioData.outputData("Function of type " + functionType + " does not exist");
                    }
                    break;

                case "canscap":
                    ioData.outputData("Input amount of n:");
                    dataInstance.add(ioData.inputIntData());
                    ioData.outputData("Input amount of m:");
                    dataInstance.add(ioData.inputIntData());
                    ioData.outputData("Input n capacity:");
                    dataInstance.add(ioData.inputIntData());
                    ioData.outputData("Input capacity difference:");
                    dataInstance.add(ioData.inputIntData());
                    command = new CansCapCommand();
                    ioData.outputData("Result: " + command.perform(dataInstance));
                    break;

                case "cubeparams":
                    ioData.outputData("Input side length:");
                    dataInstance.add(ioData.inputDoubleData());
                    command = new CubeParametersCommand();
                    ioData.outputData("Cube volume, edge area and surface area: ");
                    ioData.printArrayInLines(command.perform(dataInstance));
                    dataInstance.clear();
                    break;

                case "resistance":
                    ioData.outputData("Input resistance value R1:");
                    dataInstance.add(ioData.inputDoubleData());
                    ioData.outputData("Input resistance value R2:");
                    dataInstance.add(ioData.inputDoubleData());
                    ioData.outputData("Input resistance value R3:");
                    dataInstance.add(ioData.inputDoubleData());
                    command = new ParallelResistanceChainCommand();
                    ioData.outputData("Result " + command.perform(dataInstance));
                    break;



                case "time":
                    ioData.outputData("Input hours");
                    dataInstance.add(ioData.inputIntData());
                    ioData.outputData("Input minutes");
                    dataInstance.add(ioData.inputIntData());
                    ioData.outputData("Input seconds");
                    dataInstance.add(ioData.inputIntData());
                    ioData.outputData("Hours change");
                    dataInstance.add(ioData.inputIntData());
                    ioData.outputData("Minutes change");
                    dataInstance.add(ioData.inputIntData());
                    ioData.outputData("Seconds change");
                    dataInstance.add(ioData.inputIntData());
                    command = new TimeChangeCommand();
                    ioData.outputData("Result: ");
                    ioData.printArrayInLines(command.perform(dataInstance));
                    dataInstance.clear();
                    break;


                case "evennums":
                    ioData.outputData("Input lower bound");
                    dataInstance.add(ioData.inputIntData());
                    ioData.outputData("Input higher bound");
                    dataInstance.add(ioData.inputIntData());
                    command = new PrintEvenNumsCommand();
                    ioData.outputData("Result: " + command.perform(dataInstance));
                    dataInstance.clear();
                    break;

                case "sumofnums":
                    ioData.outputData("Input number");
                    dataInstance.add(ioData.inputIntData());
                    command = new SumOfNumsCommand();
                    System.out.println("Result: " + command.perform(dataInstance));
                    dataInstance.clear();
                    break;

                case "numericsequence":
                    ioData.outputData("Input e value:");
                    Double d = ioData.inputDoubleData();
                    dataInstance.add(d);
                    ioData.outputData("Input amount of elements in sequence");
                    int amount = ioData.inputIntData();
                    for(int i = 0; i<amount; i++){
                        ioData.outputData("Input " + (i+1) + "element:");
                        dataInstance.add(ioData.inputDoubleData());
                    }
                    ioData.outputData("exec cont");
                    command = new NumericalSequenceCommand();
                    System.out.println("Result: " + command.perform(dataInstance));
                    break;

                case "checkvalidity":
                    ioData.outputData("Input initial string");
                    dataInstance.setStringData(ioData.inputStringData());
                    command = new StringValidationCommand();
                    ioData.outputData("String " + (command.perform(dataInstance) ? "is valid." : "is not valid."));
                    dataInstance.clearStringData();
                    break;

                case "compareintegers":
                    ioData.outputData("Input first value");
                    dataInstance.add(ioData.inputDoubleData());
                    ioData.outputData("Input second value");
                    dataInstance.add(ioData.inputDoubleData());
                    command = new DigitsComparisonCommand();
                    ioData.outputData("Values are " + (command.perform(dataInstance) ? "equal." : "different"));
                    dataInstance.clear();
                    break;

                case "maxvalue":
                    ioData.outputData("Input first value");
                    dataInstance.add(ioData.inputDoubleData());
                    ioData.outputData("Input second value");
                    dataInstance.add(ioData.inputDoubleData());
                    command = new MaxValueCommand();
                    ioData.outputData("Greatest value: " + command.perform(dataInstance));
                    dataInstance.clear();
                    break;

                case "amountofnegative":
                    ioData.outputData("Input first value");
                    dataInstance.add(ioData.inputDoubleData());
                    ioData.outputData("Input second value");
                    dataInstance.add(ioData.inputDoubleData());
                    ioData.outputData("Input third value");
                    dataInstance.add(ioData.inputDoubleData());
                    command = new AmountOfNegativeCommand();
                    ioData.outputData("There are " + command.perform(dataInstance) + " of them in the list");
                    dataInstance.clear();
                    break;

                case "doublevaluesincase":
                    ioData.outputData("Input replacement value:");
                    dataInstance.add(ioData.inputDoubleData());
                    ioData.outputData("Input amount of elements in list");
                    int iteration = ioData.inputIntData();
                    for(int i = 0; i < iteration; i++){
                        ioData.outputData("Input " + (i+1) + "element:");
                        dataInstance.add(ioData.inputDoubleData());
                    }
                    command = new DoubleValuesInCaseCommand();
                    ioData.outputData("Result:");
                    ioData.printArrayInLines(command.perform(dataInstance));
                    dataInstance.clear();
                    break;

                case "ifsumispositive":
                    ioData.outputData("Input first number");
                    dataInstance.add(ioData.inputDoubleData());
                    ioData.outputData("Input second number");
                    dataInstance.add(ioData.inputDoubleData());
                    ioData.outputData("Input second number");
                    dataInstance.add(ioData.inputDoubleData());
                    command = new IfSumIsPositive();
                    ioData.outputData("Positive addition result " + (command.perform(dataInstance) ? "exist." : "does not exist."));
                    dataInstance.clear();
                    break;

                case "converttoarabic":
                    ioData.outputData("Input in greece:");
                    dataInstance.setStringData(ioData.inputStringData());
                    command = new ConvertToArabicCommand();
                    ioData.outputData("Result:" + command.perform(dataInstance));
                    dataInstance.clear();
                    break;

                default:
                    ioData.outputData("Operation " + instruction + " does not exist.");
            }

        } while(true);
    }

}
