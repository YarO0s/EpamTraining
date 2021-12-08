package by.denisov.task01javabasics.service.validation;

import by.denisov.task01javabasics.entity.Data;

public class SumOfNumsValidation implements Validation{

    public boolean validate(Data data, String[] initArray){
        boolean validity = true;
        try{
            for (int i = 1; i < initArray.length; i++){
                int value = Integer.parseInt(initArray[i]);
                if(value < 0){
                    return false;
                }
                data.add(value);
            }
        } catch(Exception e) {
            validity = false;
        }
        if(initArray.length != 2){
            validity = false;
        }
        return validity;
    }
}
