package com.design.example;

import com.design.example.storage.Storage;

public abstract class StorageCreator {
    public Storage getStorage() {
        Storage storage = createStorage();
        storage.accessKey();
        storage.secretKey();
        storage.endpoint();
        storage.bucket();
        return storage;
    }

    protected abstract Storage createStorage();
}
