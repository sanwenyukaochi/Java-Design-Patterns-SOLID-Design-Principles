package com.design.example;


import lombok.Getter;

/**
 * This class represents an abstract prototype & defines the clone method
 * 这是一个抽象基类，所有可被克隆的游戏单位都继承它。
 */
@Getter
public abstract class GameUnit implements Cloneable {

    private Point3D position;

    public GameUnit() {
        position = Point3D.ZERO;
    }

    @Override
    public GameUnit clone() throws CloneNotSupportedException {
        GameUnit unit = (GameUnit) super.clone();   // 浅拷贝
        unit.initialize();                          // 重新初始化位置和状态
        return unit;
    }

    protected void initialize() {
        this.position = Point3D.ZERO;
        reset();
    }

    protected abstract void reset();

    public GameUnit(float x, float y, float z) {
        position = new Point3D(x, y, z);
    }

    public void move(Point3D direction, float distance) {
        Point3D finalMove = direction.normalize();
        finalMove = finalMove.multiply(distance);
        position = position.add(finalMove);
    }

}
