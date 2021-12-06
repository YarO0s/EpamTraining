package by.denisov.task01javabasics.service;

import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GeometryService {

    Logger logger = LogManager.getLogger();

    /**
     * Evaluates the surface area, volume and side area of a cube
     * @param length - edge of the cube
     * @return the aforementioned parameters of a cube
     */
    public double[] cubeParameters(double length){
        double[] result = new double[3];
        try {
            result[0] = length * length;
            result[1] = (length * length) * 6;
            result[2] = length * length * length;
        } catch(Exception e){
            logger.log(Level.ERROR, "Error in cubeParameters function", e);
            e.printStackTrace();
        }
        return result;
    }

}
