package by.denisov.task01javabasics.service.validation;

import by.denisov.task01javabasics.entity.Data;

public class NumericalSequenceValidation implements Validation{
    public boolean validate(Data data, String[] initArray){
        boolean validity = true;

        if(initArray.length < 3){
            validity = false;
        }

        try{
            for (int i = 1; i < initArray.length; i++){
                double value = Double.parseDouble(initArray[i]);
                data.add(value);
                if(i>1 && value == 0){
                    validity = false;
                }
            }
        } catch(Exception e) {
            validity = false;
        }
        return validity;
    }
}
