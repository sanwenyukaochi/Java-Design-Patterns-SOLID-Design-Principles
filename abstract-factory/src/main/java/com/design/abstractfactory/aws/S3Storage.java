package com.design.abstractfactory.aws;


import com.design.abstractfactory.Storage;

//Represents a concrete product in a family "Amazon Web Services"
public class S3Storage implements Storage {

    public S3Storage(int capacityInMib) {
        //Use aws s3 api
        System.out.println("Allocated " + capacityInMib + " on S3");
    }

    @Override
    public String getId() {
        return "S3 Storage id 1";
    }

    @Override
    public String toString() {
        return "S3 Storage";
    }
}
