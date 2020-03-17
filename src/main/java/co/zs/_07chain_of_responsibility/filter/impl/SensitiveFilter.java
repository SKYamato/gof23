package co.zs._07chain_of_responsibility.filter.impl;

import co.zs._07chain_of_responsibility.filter.Filter;
import co.zs._07chain_of_responsibility.filter.dao.Msg;

/**
 * @author shuai
 * @date 2020/03/16 10:04
 */
public class SensitiveFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        //处理msg
        String r = msg.getMsg();
        r = r.replace("996","955");
        msg.setMsg(r);
        return true;
    }
}
