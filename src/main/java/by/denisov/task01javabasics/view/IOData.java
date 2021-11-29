package by.denisov.task01javabasics.view;


import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

// TODO: input errors handling

public class IOData {

    public void outputData(String message){
        System.out.println(message);
    }

    public void outputData(int resultValue){
        System.out.println(resultValue);
    }

    public void outputData(String message, int resultValue){
        System.out.println(message + resultValue);
    }


    public void printArrayInLines(Number[] array){
        for(Number i : array)
            System.out.print(i+" ");
    }

    public String inputStringData(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().trim();
    }

    public int inputIntData(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public double inputDoubleData(){
        Scanner scan = new Scanner(System.in);
        Double d = scan.nextDouble();
        return d;
    }

    public void printLabel(){
        System.out.println("To print the set of instructions use <help>, to exit use <exit>;\n");
    }

    public void printInstructions(){
        System.out.println("Command: sum; <integer>, <integer> as parameters " +
                           "evaluates the sum of inputs");
        System.out.println("Command: function; <integer>,  as parameters that defines " +
                            "function from list");
        System.out.println("Command: canscap; <integer>, <integer>, <integer>, <integer> " +
                           "amount of n, amount of m, n capacity, capacity difference");
        System.out.println("Command: cubeparams; <double> as parameters " +
                           "the length of a side");
        System.out.println("Command: resistance; <double>, <double>, <double> as parameters " +
                           "evaluates resistance of parallel chain");
        System.out.println("Command: time;  <integer>, <integer>, <integer>, <integer>, " +
                           "<integer>, <integer> as params; current h,m,s and addition h,m,s");
    }

}
