package com.hb.action;

import com.hb.model.GuestDao;
import com.opensymphony.xwork2.Action;

public class DelAction implements Action {
    private int idx;

    public void setIdx(int idx) {
        this.idx = idx;
    }

    @Override
    public String execute() throws Exception {
        new GuestDao().deleteOne(idx);

        return  SUCCESS;
    }
}
