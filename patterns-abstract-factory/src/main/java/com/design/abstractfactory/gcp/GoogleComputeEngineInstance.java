package com.design.abstractfactory.gcp;

import com.design.abstractfactory.Instance;
import com.design.abstractfactory.Storage;

//Represents a concrete product in a family "Google Cloud Platform"
public class GoogleComputeEngineInstance implements Instance {

    public GoogleComputeEngineInstance(Capacity capacity) {
        //Map capacity to GCP compute instance types. Use GCP API to provision
        IO.println("Created Google Compute Engine instance");
    }

    @Override
    public void start() {
        IO.println("Google Compute engine instance started");
    }

    @Override
    public void attachStorage(Storage storage) {
        IO.println("Attached " + storage + " to Google Compute engine instance");
    }

    @Override
    public void stop() {
        IO.println("Google Compute engine instance stopped");
    }

    @Override
    public String toString() {
        return "GoogleComputeEngineInstance";
    }
}
