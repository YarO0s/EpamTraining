package by.denisov.task01javabasics.view;


import java.io.IOException;
import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

/**
 * Input - output manager responsible for reading user input and printing specified messages
 */
public class IOData {

    public void writeData(String... message){

        for(String str : message){
            System.out.print(str);
        }
    }

    public String readStringData(){
        Scanner scan = new Scanner(System.in);
        return scan.nextLine().trim();
    }

    public int readIntData(){
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public double readDoubleData(){
        Scanner scan = new Scanner(System.in);
        Double d = scan.nextDouble();
        return d;
    }

    public void printLabel(){
        System.out.println("To print the set of instructions use <help>, to exit use <exit>;\n");
    }

    public void printInstructions(){
    }

}
