package by.denisov.task01javabasics.test.service;

import by.denisov.task01javabasics.service.FunctionsService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class FunctionsServiceTest {

    FunctionsService functionsOps = new FunctionsService();

    @DataProvider(name = "functionType1TestData")
    public Object[][] functionType1TestData(){
        return new Object[][]{
                {new Double[]{4.0,2.0,2.0},3.0},
                {new Double[]{3.0,1.0,2.0},2.0},
                {new Double[]{4.0,0.0,2.0},2.0},
                {new Double[]{3.0,1.0,2.0},2.0},
                {new Double[]{4.0,0.0,2.0},2.0},
                {new Double[]{0.0,2.0,3.0},0.0},
                {new Double[]{4.0,-1.0,2.0},1.5},
                {new Double[]{4.0,2.0,-2.0},-1.0},
                {new Double[]{0.0,1.0,2.0},0.5},
        };
    }

    @Test(description = "Function (a-3)*(b/2)+c test",
          dataProvider = "functionType1TestData")
    public void functionType1Test(Double[] inputValues, Double expected){
        double actual = functionsOps.functionType1(inputValues[0], inputValues[1], inputValues[2]);
        assertEquals(expected, actual);
    }

}
