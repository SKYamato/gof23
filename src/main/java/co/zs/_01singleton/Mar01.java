package co.zs._01singleton;

/**
 * 饿汉式单例
 *
 * @author shuai
 * @date 2020/03/11 16:33
 */
public class Mar01 {
    public static final Mar01 INSTANCE = new Mar01();

    private Mar01() {
    }

    public static Mar01 getInstance() {
        return Mar01.INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()->{
                System.out.println(Mar01.getInstance().hashCode());
            }).start();
        }
    }
}
