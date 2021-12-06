package by.denisov.task01javabasics.service;

import by.denisov.task01javabasics.entity.Data;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringProcessService {

    Logger logger = LogManager.getLogger();


    /**
     * Checks if the specified string meets list of requirements:
     * As the first character only a letter or underlines sign is appropriate
     * Others may be represented as letters, numbers or underline signs
     * @param initString - the initial string
     * @return true if specified string is valid, false if not
     */
    public boolean ifStringValid(String initString){
        char[] array = initString.toCharArray();
        try {
            for (int i = 0; i < array.length; i++) {
                if (i == 0) {
                    if (array[i] == 95 || array[i] >= 97 && array[i] <= 122 || array[i] >= 65 && array[i] <= 90)
                        continue;
                    else
                        return false;
                }

                if (array[i] == 95 || array[i] >= 97 && array[i] <= 122 || array[i] >= 65 && array[i] <= 90 || array[i] >= 48 && array[i] <= 57)
                    continue;

                return false;

            }
        } catch(Exception e){
            logger.log(Level.ERROR, "Error in timeChange function", e);
            e.printStackTrace();
        }
        return true;
    }


    /**
     * Converts the string represented as a number in Roman into Arab number
     * @param initString - initial number
     * @return the equivalent Arab number
     */
    public int convertToArabic(String initString){
        char[] array = initString.toCharArray();
        int result = 0;
        try {
            for (int i = 0; i < array.length; i++) {
                int value = getValue(array[i]);

                if (i < array.length - 1 && (value == 1 || Math.log10(value) % 1 == 0)) {
                    if (getValue(array[i + 1]) > value) {
                        result -= value;
                        continue;
                    }
                }

                result += value;
            }
        } catch (Exception e){
            logger.log(Level.ERROR, "Error in convertToArab function", e);
            e.printStackTrace();
        }
        return result;
    }

    /**
     * Private service method, created for defining equivalent arabic digit for a greek one
     * @param element
     * @return
     */
    private int getValue(char element){
        int result = 0;
        switch (element){
            case 'I':
                result = 1;
                break;
            case 'V':
                result = 5;
                break;
            case 'X':
                result = 10;
                break;
            case 'L':
                result = 50;
                break;
            case 'C':
                result = 100;
                break;
            case 'D':
                result = 500;
                break;
            case 'M':
                result = 1000;
                break;
            default:
                result = 0;
        }
        return result;
    }

}
