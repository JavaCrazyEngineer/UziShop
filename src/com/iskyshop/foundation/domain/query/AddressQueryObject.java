package com.iskyshop.foundation.domain.query;

import com.iskyshop.core.query.QueryObject;
import org.springframework.web.servlet.ModelAndView;

public class AddressQueryObject extends QueryObject {
    public AddressQueryObject(String currentPage, ModelAndView mv, String orderBy, String orderType) {
        super(currentPage, mv, orderBy, orderType);
    }

    public AddressQueryObject() {
    }
}