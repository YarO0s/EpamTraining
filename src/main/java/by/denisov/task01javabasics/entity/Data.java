package by.denisov.task01javabasics.entity;


import java.util.*;

public class Data {

    private List<Number> data= new LinkedList<Number>();

    private String str = "";

    public void add(Number value){
        data.add(value);
    }

    public void addAll(Number... values){
        Collections.addAll(data, values);
    }

    public Number remove(int index){
        return data.remove(index);
    }

    public Number get(int index){
        return data.get(index);
    }

    public void clear(){data.clear();}

    public Double[] getAll(){
        Double[] arr = new Double[data.size()];
        for(int i = 0; i<data.size(); i++){
            arr[i] = data.get(i).doubleValue();
        }
        return arr;
    }

    public void setStringData(String initString){
        str = initString;
    }

    public String getStringData(){
        return str;
    }

    public void clearStringData(){
        str = "";
    }
}
