package by.denisov.task01javabasics.service.validation;

import by.denisov.task01javabasics.entity.Data;

public class DigitsComparisonValidation implements Validation{

    public boolean validate(Data data, String[] initArray){
        boolean validity = true;
        try{
            for (int i = 1; i < initArray.length; i++){
                data.add(Double.parseDouble(initArray[i]));
            }
        } catch(Exception e) {
            validity = false;
        }
        if(initArray.length != 3){
            validity = false;
        }
        return validity;
    }
}
