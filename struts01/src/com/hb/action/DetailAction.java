package com.hb.action;

import com.hb.model.GuestDao;
import com.hb.model.GuestVo;
import com.opensymphony.xwork2.Action;

public class DetailAction implements Action {
    private int idx;
    private GuestVo bean;

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public GuestVo getBean() {
        return bean;
    }

    @Override
    public String execute() throws Exception {
        bean = new GuestDao().selectOne(idx);

        return SUCCESS;
    }
}
