package by.denisov.task01javabasics.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class ComparisonService {

    Logger logger = LogManager.getLogger();

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

    public Double[] doubleValuesInCase(double e, Double... values){
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
