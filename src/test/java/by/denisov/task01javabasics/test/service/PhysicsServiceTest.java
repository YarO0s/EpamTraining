package by.denisov.task01javabasics.test.service;

import by.denisov.task01javabasics.service.PhysicsService;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class PhysicsServiceTest {

    PhysicsService physicsOps = new PhysicsService();

    @DataProvider(name = "parallelChainResistanceDataTest")
        public Object[][] parallelChainResistanceDataTest(){
        return new Object[][] {
                {new double[]{1,1,1}, 0.333},
                {new double[]{0.5,0.5,0.5}, 0.167}
        };
    }

    @Test(description="Parallel resistance data test",
          dataProvider="parallelChainResistanceDataTest")
    public void parallelChainResistanceTest(double[] inputValues, double expected){
        double actual = physicsOps.parallelChainResistance(inputValues[0], inputValues[1], inputValues[2]);
        assertEquals(expected,(double)Math.round(actual*1000)/1000);
    }

}
