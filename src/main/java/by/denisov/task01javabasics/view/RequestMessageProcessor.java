package by.denisov.task01javabasics.view;

/**
 * Class specified for processing user inputs
 */
public class RequestMessageProcessor {

    /**
     * Splits string in a set of values where first is a command, and all others are data inputs
     * specified for processing
     * @param initString initial request message
     * @return an array where first element is command name, and all others are data values
     */
    public String[] processRequest(String initString){
        return initString.split(" ");
    }

}
