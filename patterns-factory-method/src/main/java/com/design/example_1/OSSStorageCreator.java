package com.design.example_1;

import com.design.example_1.storage.OSSStorage;
import com.design.example_1.storage.Storage;

public class OSSStorageCreator extends StorageCreator{
    @Override
    protected Storage createStorage() {
        return new OSSStorage();
    }
}
