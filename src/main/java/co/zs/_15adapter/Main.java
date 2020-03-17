package co.zs._15adapter;

import lombok.SneakyThrows;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/**
 * 适配器模式
 * 常见的类中含有Adapter，但其不是适配器模式
 * 其大多作为抽象类，为接口的空实现。实际使用继承该类，可以只重写我们关注的方法。
 *
 * @author shuai
 * @date 2020/03/17 14:14
 */
public class Main {
    @SneakyThrows
    public static void main(String[] args) {
        FileInputStream fis = new FileInputStream("c:/test.text");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        String line = br.readLine();
        while (line != null && !line.equals("")) {
            System.out.println(line);
        }
        br.close();
    }
}
