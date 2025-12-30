package com.design.example_1;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OSS extends Storage {
    private String bucket;
    private String endpoint;
    private String accessKey;
    private String secretKey;
}
