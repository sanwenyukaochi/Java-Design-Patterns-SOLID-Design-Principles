package com.design.example;

import com.design.example.storage.OBSStorage;
import com.design.example.storage.Storage;

public class OBSStorageCreator extends StorageCreator {
    @Override
    protected Storage createStorage() {
        return new OBSStorage();
    }
}
