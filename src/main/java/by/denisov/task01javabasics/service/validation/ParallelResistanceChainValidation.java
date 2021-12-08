package by.denisov.task01javabasics.service.validation;

import by.denisov.task01javabasics.entity.Data;

public class ParallelResistanceChainValidation implements Validation{

    public boolean validate(Data data, String[] initArray){
        boolean validity = true;

        try{
            for (int i = 1; i < initArray.length; i++){
                double value = Double.parseDouble(initArray[i]);
                if(value<0){
                    return false;
                }
                data.add(value);
            }
        } catch(Exception e) {
            validity = false;
        }
        if(initArray.length != 4){
            validity = false;
        }
        return validity;
    }
}
