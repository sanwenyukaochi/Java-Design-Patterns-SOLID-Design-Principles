package com.design.example;

public class Client {

    static void main() {
        StorageFactory factory = new StorageFactory();
        OBS obs = (OBS) factory.createStorage("obs");
        OSS oss = (OSS) factory.createStorage("oss");
        MinIO minio = (MinIO) factory.createStorage("minio");
    }

}
