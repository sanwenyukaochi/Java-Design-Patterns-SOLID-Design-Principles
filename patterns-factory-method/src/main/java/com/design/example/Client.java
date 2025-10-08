package com.design.example;

import com.design.example.storage.Storage;

public class Client {
    static void main() {
        Storage MinIOStorage = new MinIOStorageCreator().getStorage();
        Storage OBSStorage = new OBSStorageCreator().getStorage();
        Storage OSSStorage = new OSSStorageCreator().getStorage();
        IO.println(MinIOStorage.getType());
        IO.println(OBSStorage.getType());
        IO.println(OSSStorage.getType());
    }
}
