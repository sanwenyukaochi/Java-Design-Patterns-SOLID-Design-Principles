package com.design.example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MinIO extends Storage {
    private String bucket;
    private String endpoint;
    private String accessKey;
    private String secretKey;
}
