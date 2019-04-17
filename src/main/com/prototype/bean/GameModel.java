package main.com.prototype.bean;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GameModel implements Cloneable, Serializable {

    /**
     * 游戏
     */
    private List<Game> gameList = new ArrayList<Game>();

    /**
     * 总金额
     */
    private double totalPrize;

    public List<Game> getGameList() {
        return gameList;
    }

    public void setGameList(List<Game> gameList) {
        this.gameList = gameList;
    }

    public double getTotalPrize() {
        return totalPrize;
    }

    public void setTotalPrize(double totalPrize) {
        this.totalPrize = totalPrize;
    }

    /**
     * 浅克隆
     * @return
     * @throws CloneNotSupportedException
     */
    public GameModel sollowClone() throws CloneNotSupportedException {
        return (GameModel)super.clone();
    }

    public GameModel deepClone() {
        ObjectOutputStream oops = null;
        ObjectInputStream ois = null;
        GameModel clone = null;
        try {
            oops = new ObjectOutputStream(new FileOutputStream("E://object.txt"));
            oops.writeObject(this);
            ois = new ObjectInputStream(new FileInputStream("E://object.txt"));
            clone = (GameModel)ois.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if(oops != null){
                try {
                    oops.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if(ois != null){
                try {
                    ois.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return clone;
    }

}
