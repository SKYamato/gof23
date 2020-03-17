package co.zs._07chain_of_responsibility.filter.impl;

import co.zs._07chain_of_responsibility.filter.dao.Msg;
import co.zs._07chain_of_responsibility.filter.Filter;

/**
 * @author shuai
 * @date 2020/03/16 10:03
 */
public class URLFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        //处理msg
        String r = msg.getMsg();
        r = r.replace("baidu.com","https://www.baidu.com");
        msg.setMsg(r);
        return true;
    }
}
