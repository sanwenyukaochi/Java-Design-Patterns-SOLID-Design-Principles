package com.design.prototype1;

import lombok.Setter;
import lombok.ToString;

@Setter
@ToString
public class Sheep implements Cloneable {
    private String name;
    public Sheep clone() throws CloneNotSupportedException{
        return (Sheep) super.clone(); // 浅拷贝
    }
}
