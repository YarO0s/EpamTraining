package by.denisov.task01javabasics.test.service;

import by.denisov.task01javabasics.service.GeometryService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class GeometryServiceTest {

    GeometryService geometryOps = new GeometryService();

    //TODO decompose cubeParamsTest on different methods responsible for every type of result

    @DataProvider(name = "cubeParamsDataTest")
    public Object[][] cubeParamsDataTest(){
        return new Object[][]{
                {2.0, new Double[] {4.0, 24.0, 8.0}},
                {0.5, new Double[] {0.25, 1.5, 0.125}}
        };
    }
    @Test(description = "Cube parameters test", dataProvider = "cubeParamsDataTest")
    public void cubeParamsTest(Double inputValue, Double[] expectedValues){

        Double[] actualValues = geometryOps.cubeParameters(inputValue);

        //Cube side area
        assertEquals(expectedValues[0], actualValues[0]);

        //Cube surface area
        assertEquals(expectedValues[1], actualValues[1]);

        //Cube volume
        assertEquals(expectedValues[2], actualValues[2]);
    }
}
