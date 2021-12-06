package by.denisov.task01javabasics.entity;

import java.util.*;

/**
 * Model class that stores lists of numbers and strings
 * and defines different accessors
 */

public class Data {

    private List<Number> data= new LinkedList<Number>();
    private List<String> stringsData = new LinkedList<String>();

    public void add(Number value){
        data.add(value);
    }

    public void addAll(Number... values){
        Collections.addAll(data, values);
    }

    public Number get(int index){
        return data.get(index);
    }

    public double[] getAll(){
        double[] arr = new double[data.size()];
        for(int i = 0; i<data.size(); i++){
            arr[i] = data.get(i).doubleValue();
        }
        return arr;
    }

    public void add(String initString){
        stringsData.add(initString);
    }

    public String getStringData(int index){
        return stringsData.get(index);
    }

    public Number remove(int index){
        return data.remove(index);
    }

    public int size(){
        return data.size();
    }

    public void clear(){
        data.clear();
        stringsData.clear();
    }
}
