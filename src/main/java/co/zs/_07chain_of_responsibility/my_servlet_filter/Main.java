package co.zs._07chain_of_responsibility.my_servlet_filter;

import co.zs._07chain_of_responsibility.dao.Msg;
import co.zs._07chain_of_responsibility.my_servlet_filter.filter.impl.FilterChain;
import co.zs._07chain_of_responsibility.my_servlet_filter.filter.impl.HTMLFilter;
import co.zs._07chain_of_responsibility.my_servlet_filter.filter.impl.URLFilter;

/**
 * @author shuai
 * @date 2020/03/16 11:31
 */
public class Main {
    public static void main(String[] args) {
        Request req = new Request();
        req.setMsg("1");
        Response resp = new Response();
        resp.setMsg("2");

        FilterChain filterChain = new FilterChain();
        filterChain.add(new HTMLFilter()).add(new URLFilter());

        filterChain.doFilter(req,resp, filterChain);
        System.out.println(req.getMsg());
        System.out.println(resp.getMsg());
    }
}
