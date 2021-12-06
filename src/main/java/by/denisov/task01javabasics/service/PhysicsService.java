package by.denisov.task01javabasics.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class PhysicsService {

    Logger logger = LogManager.getLogger();


    /**
     * Evalueates the total resistance of a chain with resistors linked in a parallel way
     * @param r - resistors resistance values
     * @return the total resistance of a chain
     */
    public double parallelChainResistance(double... r){
        double result = 0;
        try {
            for (double i : r) {
                result += 1 / i;
            }
        } catch(Exception e){
            logger.log(Level.ERROR, "Error in parallelChainResistance function", e);
            e.printStackTrace();
        }
        return 1/result;
    }

}
