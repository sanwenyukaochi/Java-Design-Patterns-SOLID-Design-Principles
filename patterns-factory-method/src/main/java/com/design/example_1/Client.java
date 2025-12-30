package com.design.example_1;

import com.design.example_1.storage.Storage;

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
