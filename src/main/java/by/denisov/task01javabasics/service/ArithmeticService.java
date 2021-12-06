package by.denisov.task01javabasics.service;

import by.denisov.task01javabasics.entity.Data;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Service class for different arithmetic operations
 */

public class ArithmeticService {


    //logger class
    private Logger logger = LogManager.getLogger();


    /**
     * Addition of two integers
     * @param firstVal - first integer operand
     * @param secondVal - second integer operand
     * @return result of aforementioned operands addition
     */
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


    /**
     * Evaluation of large cans total capacity
     * @param n - amount of small cans
     * @param m - amount of large cans
     * @param nCapacity - total capacity of small cans
     * @param difference - difference between small and large cans capacity
     * @return large cans total capacity
     */
    public double cansCapacity(double n, double m, double nCapacity, double difference){
         double result = 0;
         try {
            result = (nCapacity / n + difference) * m;
         } catch (Exception e) {
             logger.log(Level.ERROR, "Error in cansCapacity function", e);
             e.printStackTrace();
         }
         return result;
    }


    /**
     * Defines the time obtained by adding specified number of hours
     * minutes and seconds to the specified current time
     * @param array input values (initial: hours,minutes,seconds; additional h,m,s).
     * @return the result of addition
     */
    public int[] timeChange(int... array){

        for(int i : array){
            System.out.println(i);
        }

        int[] resultArray = null;
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
            resultArray = new int[]{array[0], array[1], array[2]};
        } catch (Exception e){
            logger.log(Level.ERROR, "Error in timeChange function", e);
            e.printStackTrace();
        }
        for(int i = 0; i< 3; i ++){
            System.out.println(i);
        }
        return resultArray;
    }


    /**
     * Prints all even number in specified borders
     * @param lowerBound - defines lower bound
     * @param upperBound - defines upper bound
     * @return the string that contains all even numbers in bounds.
     */
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

    /**
     * Evaluates the sum of all digits from 1 to specified number;
     * @param num - bound value
     * @return the sum of digits from 1 to bound value
     */
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


    /**
     * Evaluates the sum of terms in a series whose modulus is greater or equals specified e value
     * @param e - value that defines lower bound for meeting the requirements
     * @param inputSequence - series of values
     * @return the sum of terms in a series whose modulus is greater or equals specified e value
     */
    public double numericalSequence(double e, double[] inputSequence) {
        double result = 0;
        try {
            for (double el : inputSequence) {
                double sequenceElement = ((el - 1) % 2) == 0 ? 1 / el : -1 / el;
                if (Math.abs(sequenceElement) >= e)
                    result += sequenceElement;
            }
        } catch (Exception exception){
            logger.log(Level.ERROR, "Error in numericalSequence function", e);
            exception.printStackTrace();
        }
        return result;
    }


    /**
     * Evaluates amount of negative elements in a list
     * @param initNums - initial values
     * @return the amount of negative elements in a list
     */
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


    /**
     * Swaps the values two variables using additional variable
     * @param val1 - first value
     * @param val2 - second value
     * @return variables that store swapped values
     */
    public double[] replaceValuesWithVariable(double val1, double val2){
        double val3 = val1;
        val1 = val2;
        val2 = val3;
        return new double[] {val1, val2};
    }


    /**
     * Swaps the values two variables using addition and subtraction operations
     * @param var1 - first value
     * @param var2 - second value
     * @return variables that store swapped values
     */
    public double[] replaceValuesWithAddition(double var1, double var2){
        var1 += var2;
        var2 = var1 - var2;
        var1 -= var2;
        return new double[]{var1, var2};
    }


    /**
     * Swaps the values two variables using XOR operation
     * @param var1 - first value
     * @param var2 - second value
     * @return variables that store swapped values
     */
    public int[] replaceValuesWithXOR(int var1, int var2){
        var1 = var1 ^ var2;
        var2 ^= var1;
        var1 ^= var2;
        return new int[]{var1, var2};
    }


}
