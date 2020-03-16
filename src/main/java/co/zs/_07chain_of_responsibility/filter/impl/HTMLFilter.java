package co.zs._07chain_of_responsibility.filter.impl;

import co.zs._07chain_of_responsibility.filter.Filter;
import co.zs._07chain_of_responsibility.dao.Msg;

/**
 * @author shuai
 * @date 2020/03/16 10:03
 */
public class HTMLFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        //处理msg
        String r = msg.getMsg();
        r = r.replace("<","[");
        r = r.replace(">","]");
        msg.setMsg(r);
        return true;
    }
}
