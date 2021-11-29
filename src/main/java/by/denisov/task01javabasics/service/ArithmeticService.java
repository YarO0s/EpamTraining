package by.denisov.task01javabasics.service;

import by.denisov.task01javabasics.entity.Data;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import by.denisov.task01javabasics.view.IOData;

public class ArithmeticService {

    IOData ioData = new IOData();
    private Logger logger = LogManager.getLogger();

    public int sum(int firstVal, int secondVal){
        int result = 0;
            try {
                result = firstVal + secondVal;
            } catch (Exception e) {
                logger.log(Level.ERROR, "Error in sum function", e);
                e.printStackTrace();
            }
        return result;
        }



    public double cansCapacity(int n, int m, double nCapacity, double difference){
         double result = 0;
         try {
            result = (nCapacity / n + difference) * m;
         } catch (Exception e) {
             logger.log(Level.ERROR, "Error in cansCapacity function", e);
             e.printStackTrace();
         }
         return result;
    }



    public Integer[] timeChange(Integer[] array){

        Integer[] resultArray = null;
        try {
            array[0] += array[3];
            array[1] += array[4];
            array[2] += array[5];

            while (array[2] >= 60) {
                array[2] -= 60;
                array[1] += 1;
            }

            while (array[1] >= 60) {
                array[1] -= 60;
                array[0] += 1;
            }

            while (array[0] >= 24) {
                array[0] -= 24;
            }
            resultArray = new Integer[]{array[0], array[1], array[2]};
        } catch (Exception e){
            logger.log(Level.ERROR, "Error in timeChange function", e);
            e.printStackTrace();
        }
        return resultArray;
    }



    public String printEvenNums(int lowerBound, int upperBound){
        String result = "";
        try {
            int currentPoint = lowerBound % 2 == 0 ? lowerBound : lowerBound + 1;
            while (currentPoint <= upperBound) {
                result += currentPoint + " ";
                currentPoint += 2;
            }
        } catch (Exception e) {
            logger.log(Level.ERROR, "Error in printEvenNums function", e);
            e.printStackTrace();
        }
        return result.trim();
    }



    public int sumOfNumbers(int num){
        int result = 0;
        try {
            for (int i = 1; i <= num; i++) {
                result += i;
            }
        } catch(Exception e){
            logger.log(Level.ERROR, "Error in sumOfNumbers function", e);
            e.printStackTrace();
        }
        return result;
    }



    public double numericalSequence(double e, Double[] inputSequence) {
        double result = 0;
        try {
            for (double el : inputSequence) {
                double sequenceElement = ((el - 1) % 2) == 0 ? 1 / el : -1 / el;
                System.out.println(sequenceElement);
                if (Math.abs(sequenceElement) >= e)
                    result += sequenceElement;
            }
        } catch (Exception exception){
            logger.log(Level.ERROR, "Error in numericalSequence function", e);
            exception.printStackTrace();
        }
        return result;
    }

    public int amountOfNegative(double... initNums){
        int result = 0;
        try {
            for (int i = 0; i < initNums.length; i++) {
                if (initNums[i] < 0)
                    result++;
            }
        } catch(Exception e) {
            logger.log(Level.ERROR, "Error in amountOfNegative function", e);
            e.printStackTrace();
        }
        return result;
    }

    public boolean ifSumIsPositive(double... inputValues){
        try {
            for (int i = 0; i < inputValues.length - 1; i++) {
                for (int i2 = i + 1; i2 < inputValues.length; i2++) {
                    if (inputValues[i] + inputValues[i2] >= 0)
                        return true;
                }
            }
        } catch (Exception e){
            logger.log(Level.ERROR, "Error in ifSumIsPositive function", e);
            e.printStackTrace();
        }
        return false;
    }



}
