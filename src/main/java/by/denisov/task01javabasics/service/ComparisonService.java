package by.denisov.task01javabasics.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ComparisonService {

    Logger logger = LogManager.getLogger();


    /**
     * Defines whether specified values are equal
     * @param initNum1 - first values
     * @param initNum2 - second values
     * @return true if equals, false if different
     */
    public boolean compareDigits(double initNum1, double initNum2){
        boolean result = false;
        try {
            if (initNum1 == initNum2)
                result = true;
        } catch(Exception e){
            logger.log(Level.ERROR, "Error in compareDigits function", e);
            e.printStackTrace();
        }
        return result;
    }


    /**
     * Defines the greatest value from two specified
     * @param initNum1 - first value
     * @param initNum2 - second value
     * @return the greatest one
     */
    public double maxValue(double initNum1, double initNum2){
        double result = 0;
        try {
            if (initNum1 >= initNum2)
                result = initNum1;
            else
                result = initNum2;
        } catch(Exception e){
            logger.log(Level.ERROR, "Error in maxValue function", e);
            e.printStackTrace();
        }
        return result;
    }


    /**
     * Doubles values if the next one is bigger than previous in the whole list,
     * if not - replaces values with constant e value
     * @param e constant value, that is used to replace values in a list
     * @param values the list of values
     * @return the processed list of values
     */
    public double[] doubleValuesInCase(double e, double... values){
        try {
            for (int i = 0; i < values.length - 1; i++) {

                if (values[i] > values[i + 1])
                    continue;

                else {
                    for (int i2 = 0; i2 < values.length; i2++) {
                        values[i2] = e;
                    }
                    return values;
                }
            }
            for (int i = 0; i < values.length; i++) {
                values[i] *= 2;
            }
    } catch (Exception exception){
            logger.log(Level.ERROR, "Error in doubleValuesInCase function", e);
            exception.printStackTrace();
        }
        return values;
    }

}
