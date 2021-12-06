package by.denisov.task01javabasics.test.service;

import by.denisov.task01javabasics.service.ArithmeticService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.testng.AssertJUnit.*;


@Test
public class ArithmeticServiceTest {

    ArithmeticService arithmeticOps = new ArithmeticService();

    private Logger logger = LogManager.getLogger();

    @DataProvider(name = "sumTestData")
    public Object[][] sumTestData(){
        return new Object[][] {
            {new int[]{5, 5}, 10},
            {new int[]{5, 0}, 5},
            {new int[]{0, 5}, 5},
            {new int[]{-5, 5}, 0},
            {new int[]{5, -5}, 0},
        };
    }

    @Test(description = "Sum test", dataProvider = "sumTestData")
    public void sumTest(int[] arr, int expected){
        int actual= arithmeticOps.sum(arr[0],arr[1]);
        assertEquals(expected, actual);
    }

    @DataProvider(name = "cansCapacityTestData")
    public Object[][] cansCapacityTestData(){
        return new Object[][] {
                {new Integer[]{1, 1}, new Double[]{1.0, 1.0}, 2.0},
                {new Integer[]{1, 2}, new Double[]{1.0, 1.0}, 4.0},
                {new Integer[]{2, 1}, new Double[]{1.0, 1.0}, 1.5},
                {new Integer[]{1, 0}, new Double[]{1.0, 1.0}, 0.0},
                {new Integer[]{1, 1}, new Double[]{1.0, 0.0}, 1.0},
        };
    }

    @Test(description = "Cans capacity test", dataProvider = "cansCapacityTestData")
    public void cansCapacityTest(Integer[] initIntData, Double[] initDoubleData, Double expected){
            double actual = arithmeticOps.cansCapacity(initIntData[0], initIntData[1], initDoubleData[0], initDoubleData[1]);
            assertEquals(expected, actual);
    }

    @DataProvider(name = "timeChangeTestData")
    public Object[][] timeChangeTestData(){
        return new Object[][] {
                {new int[]{0,0,0,1,1,1}, new int[]{1,1,1}},
                {new int[]{23,59,59,1,1,1}, new int[]{1,1,0}},
                {new int[]{24,0,0,0,0,0}, new int[]{0,0,0}},
                {new int[]{0,0,0,0,0,180}, new int[]{0,3,0}},
                {new int[]{0,0,0,0,180,0}, new int[]{3,0,0}},
                {new int[]{0,0,0,50,0,0}, new int[]{2,0,0}},
        };
    }

    @Test(description = "Time change test", dataProvider = "timeChangeTestData")
    public void timeChangeTest(int[] initialValues, int[] expected){
        int[] actual = arithmeticOps.timeChange(initialValues);
        assertEquals(actual[0], expected[0]);
        assertEquals(actual[1], expected[1]);
        assertEquals(actual[2], expected[2]);
    }

    @DataProvider(name = "printEvenNumsDataTest")
    public Object[][] printEvenNumsDataTest(){
        return new Object[][]{
                {new int[]{2,2}, "2"},
                {new int[]{3,3}, ""},
                {new int[]{2,4}, "2 4"},
                {new int[]{2,3}, "2"},
                {new int[]{3,4}, "4"},
                {new int[]{0,2}, "0 2"},
                {new int[]{-2,0}, "-2 0"},
        };
    }

    @Test(description = "Even numbers printer test", dataProvider = "printEvenNumsDataTest")
    public void printEvenNumsTest(int[] initValues, String expected){
        String actual = arithmeticOps.printEvenNums(initValues[0], initValues[1]);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "sumOfNumsDataTest")
    public Object[][] sumOfNumsDataTest(){
        return new Object[][]{
                {1, 1},
                {2, 3},
                {3, 6},
                {0, 0},
                {100, 5050}
        };
    }

    @Test(description = "Sum of numbers test", dataProvider = "sumOfNumsDataTest")
    public void sumOfNumsTest(int initValue, int expected){
        int actual = arithmeticOps.sumOfNumbers(initValue);
        assertEquals(actual, expected);
    }

    @DataProvider(name = "numericalSequenceTestData")
    public Object[][] numericalSequenceTestData(){
        return new Object[][]{
                {new double[]{0.5}, 1, -2},
                {new double[]{1.0, 2.0, 3.0}, 0, 0.83},
                {new double[]{-2.0}, 0, 0.5},
                {new double[]{-1.0, 1.0}, 0, 0},
        };
    }

    @Test(description = "Numerical sequence test", dataProvider = "numericalSequenceTestData")
    public void numericalSequenceTest(double[] initialValues, double e ,double expected){
        double actual = arithmeticOps.numericalSequence(e, initialValues);
        assertEquals(expected, Math.round(actual*100.0)/100.0);
    }

    @DataProvider(name = "amountOfNegative")
    public Object[][] amountOfNegativeTestData(){
        return new Object[][]{
                {new double[]{-1,0,1}, 1},
                {new double[]{1,2,3}, 0},
                {new double[]{-3,-2,-1}, 3},
                {new double[]{0,0,0}, 0},
        };
    }

    @Test(description = "Amount of negative in list of numbers", dataProvider = "amountOfNegative")
    public void amountOfNegativeTest(double[] inputValues, int expected) {
        int actual = arithmeticOps.amountOfNegative(inputValues);
        assertEquals(expected, actual);
    }

    @DataProvider(name = "ifSumIsPositiveTestData")
    public Object[][] ifSumIsPositiveTestData(){
        return new Object[][]{
                {new double[]{-1,0,1}, true},
                {new double[]{-1,-2,-3}, false},
                {new double[]{0,0,0}, true},
                {new double[]{1,-2,-3,1}, true},
                {new double[]{-1,1}, true},
        };
    }

    @Test(description = "If positive result of sum of some numbers in the list exist", dataProvider = "ifSumIsPositiveTestData")
    public void ifSumIsPositiveTest(double[] inputValues, boolean expected){
        boolean actual = arithmeticOps.ifSumIsPositive(inputValues);
        assertEquals(expected, actual);
    }

    @DataProvider(name = "ReplaceValuesWithXORTestData")
    public Object[][] replaceValuesWithXORTestData(){
        return new Object[][] {
                {new int[]{5, 5}, new int[]{5, 5}},
                {new int[]{0, 1}, new int[]{1, 0}},
                {new int[]{1, 0}, new int[]{0, 1}},
                {new int[]{-5, 5}, new int[]{5, -5}},
                {new int[]{5, -5}, new int[]{-5, 5}},
        };
    }

    @Test(description = "ReplaceValuesWithXOR test function", dataProvider = "ReplaceValuesWithXORTestData")
    public void ReplaceValuesWithXORTest(int[] initValues, int[] expectedValues){
        int[] actual= arithmeticOps.replaceValuesWithXOR(initValues[0], initValues[1]);
        assertEquals(expectedValues[0], actual[0]);
        assertEquals(expectedValues[1], actual[1]);
    }

    @DataProvider(name = "ReplaceValuesWithAdditionTestData")
    public Object[][] replaceValuesWithAdditionTestData(){
        return new Object[][] {
                {new double[]{5, 5}, new double[]{5, 5}},
                {new double[]{0, 1}, new double[]{1, 0}},
                {new double[]{1, 0}, new double[]{0, 1}},
                {new double[]{-5, 5}, new double[]{5, -5}},
                {new double[]{5, -5}, new double[]{-5, 5}},
        };
    }

    @Test(description = "ReplaceValuesWithAddition test function", dataProvider = "ReplaceValuesWithAdditionTestData")
    public void ReplaceValuesWithAdditionTest(double[] initValues, double[] expectedValues){
        double[] actual= arithmeticOps.replaceValuesWithAddition(initValues[0], initValues[1]);
        assertEquals(expectedValues[0], actual[0]);
        assertEquals(expectedValues[1], actual[1]);
    }

    @DataProvider(name = "ReplaceValuesWithVariableTestData")
    public Object[][] replaceValuesWithVariableTestData(){
        return new Object[][] {
                {new double[]{5, 5}, new double[]{5, 5}},
                {new double[]{0, 1}, new double[]{1, 0}},
                {new double[]{1, 0}, new double[]{0, 1}},
                {new double[]{-5, 5}, new double[]{5, -5}},
                {new double[]{5, -5}, new double[]{-5, 5}},
        };
    }

    @Test(description = "ReplaceValuesWithVariable test function", dataProvider = "ReplaceValuesWithVariableTestData")
    public void ReplaceValuesWithVariableTest(double[] initValues, double[] expectedValues){
        double[] actual= arithmeticOps.replaceValuesWithVariable(initValues[0], initValues[1]);
        assertEquals(expectedValues[0], actual[0]);
        assertEquals(expectedValues[1], actual[1]);
    }


}
