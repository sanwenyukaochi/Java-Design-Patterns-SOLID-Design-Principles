package com.design.abstractfactory;

import com.design.abstractfactory.Instance.Capacity;
import com.design.abstractfactory.aws.AwsResourceFactory;
import com.design.abstractfactory.gcp.GoogleResourceFactory;

public class Client {

    private ResourceFactory factory;

    public Client(ResourceFactory factory) {
        this.factory = factory;
    }

    public Instance createServer(Capacity cap, int storageMib) {
        Instance instance = factory.createInstance(cap);
        Storage storage = factory.createStorage(storageMib);
        instance.attachStorage(storage);
        return instance;
    }

    public static void main(String[] args) {
        Client aws = new Client(new AwsResourceFactory());
        Instance i1 = aws.createServer(Capacity.micro, 20480);
        i1.start();
        i1.stop();

        System.out.println("***************************************");

        Client gcp = new Client(new GoogleResourceFactory());
        Instance i2 = gcp.createServer(Capacity.micro, 20480);
        i2.start();
        i2.stop();

    }


}
