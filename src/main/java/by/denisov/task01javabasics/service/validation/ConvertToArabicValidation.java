package by.denisov.task01javabasics.service.validation;

import by.denisov.task01javabasics.entity.Data;

public class ConvertToArabicValidation implements Validation{

    public boolean validate(Data data, String[] initArray){
        boolean validity = true;

        if(initArray.length != 2){
            return false;
        }

        String initString = initArray[1];
        for(int i = 0; i < initString.length(); i++){
            String str = initString.substring(i, i+1);
            if(!str.equals("I") && !str.equals("V") && !str.equals("X")
                    && !str.equals("L") && !str.equals("C")
                    && !str.equals("D") && !str.equals("M")){
                validity = false;
            }
        }
        data.add(initString);


        return validity;
    }
}
