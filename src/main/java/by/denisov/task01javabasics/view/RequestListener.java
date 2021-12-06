package by.denisov.task01javabasics.view;

import by.denisov.task01javabasics.controller.command.*;
import by.denisov.task01javabasics.entity.Data;


/**
 * Class responsible for providing console interface, listening to user requests and defining
 * whether the request is a command
 */
public class RequestListener implements RequestResolver{

    IOData ioData = new IOData();
    String requestMessage = "";
    RequestMessageProcessor requestMessageProcessor = new RequestMessageProcessor();


    /**
     * Default constructor that prints welcome message for users when the application executes
     */
    public RequestListener(){
        System.out.println("To print the set of instructions use <help>, to exit use <exit>;");
    }


    /**
     * Responsible for reading user input and defining commands
     * @return
     */
    public String[] mapRequest(){

        while(true) {
            requestMessage = ioData.readStringData();
            String[] requestData = requestMessageProcessor.processRequest(requestMessage);
            switch (requestData[0]) {

                case "exit":
                    return null;

                case "help":
                    //TODO: input help command content
                    break;

                case "sum":

                case "canscap":

                case "cubeparams":

                case "resistance":

                case "time":

                case "evennums":

                case "sumofnums":

                case "numericsequence":

                case "checkvalidity":

                case "compareintegers":

                case "maxvalue":

                case "amountofnegative":

                case "doublevaluesincase":

                case "ifsumispositive":

                case "converttoarabic":

                case "replacevalsxor":

                case "replacevalsvar":

                case "replacevalsaddsubstr":

                    return requestData;

                case "function":

                    ioData.writeData("Available functions:\n 'f1': z=((a-3)*b/2)+c");
                    ioData.writeData("\nChoose the function from the list below and provide" +
                            " required arguments (for example f1 3 4 5)\n");
                    requestMessage = ioData.readStringData();
                    requestData = requestMessageProcessor.processRequest(requestMessage);

                    return requestData;

                default:
                    ioData.writeData("Operation " + requestData[0] + " does not exist.\n");
                    continue;
            }

        }
    }

}
