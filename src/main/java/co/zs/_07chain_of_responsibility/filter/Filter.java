package co.zs._07chain_of_responsibility.filter;

import co.zs._07chain_of_responsibility.filter.dao.Msg;

/**
 * @author shuai
 * @date 2020/03/16 10:02
 */
public interface Filter {
    boolean doFilter(Msg m);
}
