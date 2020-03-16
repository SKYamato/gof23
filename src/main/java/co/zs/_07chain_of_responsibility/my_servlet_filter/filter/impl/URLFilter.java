package co.zs._07chain_of_responsibility.my_servlet_filter.filter.impl;

import co.zs._07chain_of_responsibility.my_servlet_filter.Request;
import co.zs._07chain_of_responsibility.my_servlet_filter.Response;
import co.zs._07chain_of_responsibility.my_servlet_filter.filter.Filter;

/**
 * @author shuai
 * @date 2020/03/16 10:54
 */
public class URLFilter implements Filter {

    @Override
    public void doFilter(Request req, Response resp, FilterChain fc) {
        //处理req
        req.setMsg(req.getMsg() + " URLFilter - req ");
        fc.doFilter(req,resp,fc);
        //处理resp
        resp.setMsg(resp.getMsg() + " URLFilter - resp ");
    }
}
