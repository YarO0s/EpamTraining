package by.denisov.task01javabasics.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class FunctionsService {

    Logger logger = LogManager.getLogger();


    /**
     * Determines the value of the function
     * @param a - first variable
     * @param b - second variable
     * @param c - third variable
     * @return the result value of the function
     */
    public double functionType1(double a, double b, double c){
        double result = 0;
            try {
                result = (a - 3) * (b / 2) + c;
            } catch (Exception e){
                logger.log(Level.ERROR, "Error in functionType1 function", e);
                e.printStackTrace();
            }
        return result;
    }

}
