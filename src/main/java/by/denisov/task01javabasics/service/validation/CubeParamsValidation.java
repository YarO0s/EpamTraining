package by.denisov.task01javabasics.service.validation;

import by.denisov.task01javabasics.entity.Data;

public class CubeParamsValidation implements Validation{

    public boolean validate(Data data, String[] initArray){
        boolean validity = true;
        try{
            for (int i = 1; i < initArray.length; i++){
                double val = Double.parseDouble(initArray[i]);
                if(val <= 0){
                    validity = false;
                }
                data.add(val);
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
