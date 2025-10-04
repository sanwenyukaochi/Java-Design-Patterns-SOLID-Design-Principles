package com.design.example.storage;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
public class OBSStorage extends Storage {

    @Override
    public String getType() {
        return "obs";
    }
}
