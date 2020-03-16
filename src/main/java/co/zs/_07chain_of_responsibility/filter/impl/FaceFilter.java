package co.zs._07chain_of_responsibility.filter.impl;

import co.zs._07chain_of_responsibility.dao.Msg;
import co.zs._07chain_of_responsibility.filter.Filter;

/**
 * @author shuai
 * @date 2020/03/16 10:03
 */
public class FaceFilter implements Filter {
    @Override
    public boolean doFilter(Msg msg) {
        //处理msg
        String r = msg.getMsg();
        r = r.replace(":)","^V^");
        msg.setMsg(r);
        return false;
    }
}
