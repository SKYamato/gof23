package co.zs._07chain_of_responsibility.my_servlet_filter.filter.impl;

import co.zs._07chain_of_responsibility.my_servlet_filter.Request;
import co.zs._07chain_of_responsibility.my_servlet_filter.Response;
import co.zs._07chain_of_responsibility.my_servlet_filter.filter.Filter;

import java.util.List;

/**
 * @author shuai
 * @date 2020/03/16 10:49
 */
public class HTMLFilter implements Filter {
    @Override
    public void doFilter(Request req, Response resp, FilterChain fc) {
        //处理req
        req.setMsg(req.getMsg() + " HTMLFilter - req ");
        fc.doFilter(req,resp);
        //处理resp
        resp.setMsg(resp.getMsg() + " HTMLFilter - resp ");
    }
}
