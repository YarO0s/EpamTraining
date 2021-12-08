package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.GeometryService;
import by.denisov.task01javabasics.view.IOData;

public class CubeParametersCommand implements Command {

    private Data data;
    private GeometryService geometryOps = new GeometryService();
    private IOData ioData = new IOData();
    private boolean valid;

    public CubeParametersCommand(Data newData, boolean newValid){
        data = newData;
        valid = newValid;
    }

    public void perform(){
        if(valid) {
            double[] result = geometryOps.cubeParameters(data.get(0).doubleValue());
            ioData.writeData("Result", " " + result[0] + ", " + result[1] + ", " + result[2] + "\n");
        } else {
            ioData.writeData("Wrong data input\n");
        }
    }
}
