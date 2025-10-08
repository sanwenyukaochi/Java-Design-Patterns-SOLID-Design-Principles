package com.design.example;

import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@ToString
public class Point3D {

    private float x, y, z;

    public static final Point3D ZERO = new Point3D(0, 0, 0);

    public Point3D normalize() {
        float mag = magnitude();
        return new Point3D(x / mag, y / mag, z / mag);
    }

    private float magnitude() {
        return (float) Math.sqrt(x * x + y * y + z * z);
    }

    public Point3D multiply(float scale) {
        return new Point3D(x * scale, y * scale, z * scale);
    }

    public Point3D add(Point3D vector) {
        return new Point3D(x + vector.x, y + vector.y, z + vector.z);
    }

}
