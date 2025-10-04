package com.design.example.storage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MinIOStorage extends Storage {

    @Override
    public String getType() {
        return "minio";
    }
}
