package co.zs._07chain_of_responsibility.my_servlet_filter.filter;

import co.zs._07chain_of_responsibility.my_servlet_filter.Request;
import co.zs._07chain_of_responsibility.my_servlet_filter.Response;
import co.zs._07chain_of_responsibility.my_servlet_filter.filter.impl.FilterChain;

/**
 * @author shuai
 * @date 2020/03/16 10:46
 */
public interface Filter {
    void doFilter(Request req, Response resp, FilterChain fc);
}
