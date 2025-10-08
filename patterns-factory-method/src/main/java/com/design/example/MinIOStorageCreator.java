package com.design.example;

import com.design.example.storage.MinIOStorage;
import com.design.example.storage.Storage;

public class MinIOStorageCreator extends StorageCreator{
    @Override
    protected Storage createStorage() {
        return new MinIOStorage();
    }
}
