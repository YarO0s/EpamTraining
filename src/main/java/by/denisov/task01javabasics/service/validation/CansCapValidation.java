package by.denisov.task01javabasics.service.validation;

import by.denisov.task01javabasics.entity.Data;

public class CansCapValidation implements Validation{

    public boolean validate(Data data, String[] initArray){
        boolean validity = true;
        try{
            for (int i = 1; i < initArray.length; i++){
                data.add(Double.parseDouble(initArray[i]));
            }
            if(data.get(0).doubleValue() < 1 || data.get(1).doubleValue() < 0 ||
                    data.get(2).doubleValue() < 0 ||data.get(3).doubleValue() < 0){
                validity = false;
            }
        } catch(Exception e) {
            validity = false;
        }

        if(initArray.length != 5){
            validity = false;
        }
        return validity;
    }
}
