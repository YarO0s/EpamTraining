package by.denisov.task01javabasics.controller.command;

import by.denisov.task01javabasics.entity.Data;
import by.denisov.task01javabasics.service.PhysicsService;

public class ParallelResistanceChainCommand implements Command {

    PhysicsService physicsOps = new PhysicsService();

    public Double perform(Data d){
        return physicsOps.parallelChainResistance(d.remove(0).doubleValue(), d.remove(0).doubleValue(), d.remove(0).doubleValue());
    }

}
