package co.zs._01singleton;

/**
 * 枚举单例
 *
 * @author shuai
 * @date 2020/03/11 16:43
 */
public enum Mar03 {
    INSTANCE;

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(() -> System.out.println(Mar03.INSTANCE.hashCode())).start();
        }
    }
}
