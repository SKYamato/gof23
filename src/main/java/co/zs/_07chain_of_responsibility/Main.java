package co.zs._07chain_of_responsibility;

import co.zs._07chain_of_responsibility.dao.Msg;
import co.zs._07chain_of_responsibility.filter.impl.FilterChain;
import co.zs._07chain_of_responsibility.filter.impl.FaceFilter;
import co.zs._07chain_of_responsibility.filter.impl.HTMLFilter;
import co.zs._07chain_of_responsibility.filter.impl.SensitiveFilter;
import co.zs._07chain_of_responsibility.filter.impl.URLFilter;

/**
 * @author shuai
 * @date 2020/03/16 9:56
 */
public class Main {
    public static void main(String[] args) {

        Msg msg = new Msg();
        msg.setMsg("大家好;<script>,大家都是996,:),baidu.com");

        FilterChain fc = new FilterChain();
        fc.add(new HTMLFilter())
                .add(new SensitiveFilter());

        FilterChain fc2 = new FilterChain();
        fc2.add(new FaceFilter()).add(new URLFilter());
        fc.add(fc2);

        fc.doFilter(msg);

        System.out.println(msg.getMsg());
    }
}
