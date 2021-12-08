package by.denisov.task01javabasics.service.validation;

import by.denisov.task01javabasics.entity.Data;

public class ReplaceValuesValidation implements Validation{
    public boolean validate(Data data, String[] initArray){
        boolean validity = true;

        if(initArray.length != 3){
            return false;
        }

        try{
            for (int i = 1; i < initArray.length; i++){
                data.add(Integer.parseInt(initArray[i]));
            }
        } catch(Exception e) {
            validity = false;
        }

        return validity;
    }
}
