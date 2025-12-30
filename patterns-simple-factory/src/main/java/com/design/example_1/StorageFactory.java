package com.design.example_1;

public class StorageFactory {
    public Storage createStorage(String type) {
        return switch (type) {
            case "obs" -> new OBS();
            case "oss" -> new OSS();
            case "minio" -> new MinIO();
            default -> throw new IllegalArgumentException("Storage type does not exist");
        };
    }
}
