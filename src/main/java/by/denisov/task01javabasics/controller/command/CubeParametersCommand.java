package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.GeometryService;

public class CubeParametersCommand implements Command {

    GeometryService geometryOps = new GeometryService();
    public Double[] perform(Data d){
        return geometryOps.cubeParameters(d.get(0).doubleValue());
    }
}
