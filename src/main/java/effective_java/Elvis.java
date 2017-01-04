package effective_java;

import java.util.Random;

/**
 * Created by ct on 2017/1/4.
 *
 * 使用枚举类型实现单例模式
 */
public class Elvis {
    private  int id;

    public int getId() {
        return id;
    }

    private Elvis() {
        Random random = new Random();
        this.id = random.nextInt(101);
    }

    public enum enumElvis {
        INSTANCE;
        private Elvis elvis;
        enumElvis() {
            elvis = new Elvis();
        }

        public Elvis getInstance() {
            return elvis;
        }
    }

    public static void main(String[] args) {
        for (int i=0;i<10;i++){
            System.out.println(enumElvis.INSTANCE.getInstance().getId());
        }
    }
}
