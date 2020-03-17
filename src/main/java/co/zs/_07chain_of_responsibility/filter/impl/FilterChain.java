package co.zs._07chain_of_responsibility.filter.impl;

import co.zs._07chain_of_responsibility.filter.dao.Msg;
import co.zs._07chain_of_responsibility.filter.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author shuai
 * @date 2020/03/16 10:10
 */
public class FilterChain implements Filter {
    List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter f) {
        filters.add(f);
        return this;
    }

    @Override
    public boolean doFilter(Msg m) {
        for (Filter filter : filters) {
            if (!filter.doFilter(m)) {
                return false;
            }
        }
        return true;
    }
}
