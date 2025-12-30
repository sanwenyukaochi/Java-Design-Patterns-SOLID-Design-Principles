package com.design.example_1;

import com.design.example_1.storage.MinIOStorage;
import com.design.example_1.storage.Storage;

public class MinIOStorageCreator extends StorageCreator{
    @Override
    protected Storage createStorage() {
        return new MinIOStorage();
    }
}
