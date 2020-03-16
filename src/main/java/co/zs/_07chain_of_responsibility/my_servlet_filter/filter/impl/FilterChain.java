package co.zs._07chain_of_responsibility.my_servlet_filter.filter.impl;

import co.zs._07chain_of_responsibility.my_servlet_filter.Request;
import co.zs._07chain_of_responsibility.my_servlet_filter.Response;
import co.zs._07chain_of_responsibility.my_servlet_filter.filter.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuai
 * @date 2020/03/16 10:48
 */
public class FilterChain implements Filter {
    /**
     * 传入的过滤器
     */
    private List<Filter> filters = new ArrayList<>();
    /**
     * 指针
     */
    private Integer index = 0;

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    @Override
    public void doFilter(Request req, Response resp, FilterChain fc) {
        if (index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index);
        index++;
        filter.doFilter(req, resp, fc);
    }
}
