package test;


import main.com.prototype.bean.Game;
import main.com.prototype.bean.GameModel;

public class CloneTest {

    public static void main(String[] args) {
        //新建游戏类
        Game game = new Game();
        game.setName("Civalization");
        game.setPrize(100);

        //新建游戏模型
        GameModel gameModel = new GameModel();
        gameModel.getGameList().add(game);
        gameModel.setTotalPrize(gameModel.getTotalPrize() + game.getPrize());

        //浅克隆
        try {
            GameModel sollowClone = gameModel.sollowClone();
            System.out.println("浅克隆结果对象："+ (gameModel==sollowClone));
            System.out.println("浅克隆结果属性："+ (gameModel.getGameList()==sollowClone.getGameList()));

        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }

        //深克隆
        GameModel deepClone = gameModel.deepClone();
        System.out.println("深克隆结果对象："+ (gameModel==deepClone));
        System.out.println("深克隆结果属性："+ (gameModel.getGameList()==deepClone.getGameList()));
    }
}
