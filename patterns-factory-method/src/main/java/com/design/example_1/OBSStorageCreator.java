package com.design.example_1;

import com.design.example_1.storage.OBSStorage;
import com.design.example_1.storage.Storage;

public class OBSStorageCreator extends StorageCreator {
    @Override
    protected Storage createStorage() {
        return new OBSStorage();
    }
}
