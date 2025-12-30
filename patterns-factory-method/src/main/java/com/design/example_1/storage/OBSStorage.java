package com.design.example_1.storage;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class OBSStorage extends Storage {

    @Override
    public String getType() {
        return "obs";
    }
}
