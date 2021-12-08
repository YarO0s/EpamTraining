package by.denisov.task01javabasics.service.validation;

import by.denisov.task01javabasics.entity.Data;

public class StringValidationMethodValidation implements Validation{

    public boolean validate(Data data, String[] initArray){
        boolean validity = true;
        if(initArray.length != 2){
            return false;
        }

        try{
            data.add(initArray[1]);
        } catch(Exception e) {
            validity = false;
        }

        return validity;
    }
}
