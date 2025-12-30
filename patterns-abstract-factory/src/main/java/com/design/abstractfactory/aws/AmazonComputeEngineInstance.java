package com.design.abstractfactory.aws;

import com.design.abstractfactory.Instance;
import com.design.abstractfactory.Storage;

//Represents a concrete product in a family "Amazon Web services"
public class AmazonComputeEngineInstance implements Instance {

    public AmazonComputeEngineInstance(Capacity capacity) {
        //Map capacity to ec2 instance types. Use aws API to provision
        IO.println("Created Amazon Compute Engine instance");
    }

    @Override
    public void start() {
        IO.println("Amazon Compute engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        IO.println("Attached " + storage + " to Amazon Compute engine instance");
    }

    @Override
    public void stop() {
        IO.println("Amazon Compute engine instance stopped");
    }

    @Override
    public String toString() {
        return "AmazonComputeEngineInstance";
    }
}
