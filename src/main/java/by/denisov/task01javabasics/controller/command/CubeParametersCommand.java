package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.GeometryService;
import by.denisov.task01javabasics.view.IOData;

public class CubeParametersCommand implements Command {

    private Data data;
    private GeometryService geometryOps = new GeometryService();
    private IOData ioData = new IOData();

    public CubeParametersCommand(Data newData){
        data = newData;
    }

    public void perform(){
         double[] result = geometryOps.cubeParameters(data.get(0).doubleValue());
        ioData.writeData("Result", " " + result[0] + ", " + result[1] + ", " + result[2]+ "\n");
    }
}
