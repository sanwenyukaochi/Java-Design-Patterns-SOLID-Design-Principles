package com.design.abstractfactory.gcp;


import com.design.abstractfactory.Storage;

//Represents a concrete product in a family "Google Cloud Platform"
public class GoogleCloudStorage implements Storage {

    public GoogleCloudStorage(int capacityInMib) {
        //Use gcp api
        System.out.println("Allocated " + capacityInMib + " on Google Cloud Storage");
    }

    @Override
    public String getId() {
        return "Google cloud storage id 1";
    }

    @Override
    public String toString() {
        return "Google cloud storage";
    }
}
