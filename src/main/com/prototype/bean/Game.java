package main.com.prototype.bean;

import java.io.Serializable;

/**
 * 游戏
 */
public class Game implements Cloneable, Serializable {
    /**
     * 名称
     */
    private String Name;

    /**
     * 金额
     */
    private double prize;

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
