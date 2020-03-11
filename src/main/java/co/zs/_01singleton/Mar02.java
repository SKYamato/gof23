package co.zs._01singleton;

/**
 * 饿汉式双重检测锁
 *
 * @author shuai
 * @date 2020/03/11 16:37
 */
public class Mar02 {
    public static volatile Mar02 INSTANCE;

    private Mar02() {
    }

    public static Mar02 getInstance() {
        if (INSTANCE == null) {
            synchronized (Mar02.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Mar02();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            new Thread(()-> System.out.println(Mar02.getInstance().hashCode())).start();
        }
    }
}
