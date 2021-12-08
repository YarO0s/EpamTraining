package by.denisov.task01javabasics.service.validation;

import by.denisov.task01javabasics.entity.Data;

public class TimeChangeValidation implements Validation{

    public boolean validate(Data data, String[] initArray){
        boolean validity = true;

        if(initArray.length != 7){
            validity = false;
        }

        try{
            for (int i = 1; i < initArray.length; i++){
                int value = Integer.parseInt(initArray[i]);
                if(i==1&&(value<0||value>24)){
                    return false;
                }
                if((i==2 || i==3)&&(value<0||value>60)){
                    return false;
                }
                data.add(value);
            }
        } catch(Exception e) {
            validity = false;
        }

        return validity;
    }
}
