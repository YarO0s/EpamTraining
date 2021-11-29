package by.denisov.task01javabasics.service;

import by.denisov.task01javabasics.entity.Data;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class StringProcessService {

    Logger logger = LogManager.getLogger();

    public boolean ifStringValid(String initString){
        char[] array = initString.toCharArray();
        try {
            for (int i = 0; i < array.length; i++) {
                System.out.println((int) array[i]);
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

    public Integer convertToArabic(String initString){
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
            logger.log(Level.ERROR, "Error in convertToArabic function", e);
            e.printStackTrace();
        }
        return result;
    }

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
