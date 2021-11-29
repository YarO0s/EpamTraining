package by.denisov.task01javabasics.test.service;

import by.denisov.task01javabasics.service.ComparisonService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class ComparisonServiceTest {

    ComparisonService comparisonOps = new ComparisonService();

    @DataProvider(name = "compareDigitsTestData")
    public Object[][] compareDigitsTestData(){
        return new Object[][]{
                {new double[]{1, 1}, true},
                {new double[]{-1,-1}, true},
                {new double[]{0,0}, true},
                {new double[]{-1,1}, false},
                {new double[]{3,0}, false},
        };
    }

    @Test(description = "Digits comparison test", dataProvider = "compareDigitsTestData")
    public void compareDigitsTest(double[] inputValues, boolean expected){
        boolean actual = comparisonOps.compareDigits(inputValues[0], inputValues[1]);
        assertEquals(expected, actual);
    }

    @DataProvider(name = "maxValuesTestData")
    public Object[][] maxValueTest(){
        return new Object[][]{
                {new double[]{-1, 1}, 1},
                {new double[]{1, -1}, 1},
                {new double[]{5, 5}, 5},
                {new double[]{-1, -1}, -1},
                {new double[]{-5, 0}, 0},
                {new double[]{0, 5}, 5},
        };
    }

    @Test(description = "Max value", dataProvider = "maxValuesTestData")
    public void maxValueTest(double[] inputValues, double expected){
        double actual =comparisonOps.maxValue(inputValues[0], inputValues[1]);
        assertEquals(expected, actual);
    }


    @DataProvider(name = "doubleValuesInCaseTestData")
    public Object[][] doubleValuesInCaseTestData(){
        return new Object[][]{
                {new Double[]{3.0,2.0,1.0}, 1, new Double[]{6.0,4.0,2.0}},
                {new Double[]{1.0,2.0,3.0,0.0}, 1, new Double[]{1.0,1.0,1.0,1.0}},
                {new Double[]{-1.0,-2.0,-3.0}, 1, new Double[]{-2.0,-4.0,-6.0}},
                {new Double[]{0.0,0.0,0.0}, 1, new Double[]{1.0,1.0,1.0}},
        };
    }

    @Test(description = "double values in particular case or replace them with constant value", dataProvider = "doubleValuesInCaseTestData")
    public void doubleValuesInCaseTest(Double[] initialValues, double constantValue, Double[] expectedValues){
        Double[] actualValues = comparisonOps.doubleValuesInCase(constantValue, initialValues);

        //test values from an array one by one
        for(int i = 0; i<initialValues.length;i++){
            assertEquals(expectedValues[i],actualValues[i]);
        }
    }
}
