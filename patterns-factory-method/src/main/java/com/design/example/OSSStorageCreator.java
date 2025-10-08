package com.design.example;

import com.design.example.storage.OSSStorage;
import com.design.example.storage.Storage;

public class OSSStorageCreator extends StorageCreator{
    @Override
    protected Storage createStorage() {
        return new OSSStorage();
    }
}
