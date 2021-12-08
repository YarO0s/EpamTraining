package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.PhysicsService;
import by.denisov.task01javabasics.view.IOData;

public class ParallelResistanceChainCommand implements Command {

    private IOData ioData = new IOData();
    private Data data;
    private PhysicsService physicsOps = new PhysicsService();
    private boolean valid;
    public ParallelResistanceChainCommand(Data newData, boolean newValid){
        data = newData;
        valid = newValid;
    }

    public void perform(){
        if(valid) {
            double result = physicsOps.parallelChainResistance(data.remove(0).doubleValue(), data.remove(0).doubleValue(), data.remove(0).doubleValue());
            ioData.writeData("Result", " " + result + "\n");
        } else {
            ioData.writeData("Input data error\n");
        }
    }

}
