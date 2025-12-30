package com.design.abstractfactory.aws;


import com.design.abstractfactory.Storage;

//Represents a concrete product in a family "Amazon Web Services"
public class AmazonCloudStorage implements Storage {

    public AmazonCloudStorage(int capacityInMib) {
        //Use aws s3 api
        IO.println("Allocated " + capacityInMib + " on Amazon Cloud Storage");
    }

    @Override
    public String getId() {
        return "Amazon cloud storage id 1";
    }

    @Override
    public String toString() {
        return "Amazon cloud storage";
    }
}
