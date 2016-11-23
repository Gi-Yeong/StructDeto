package com.hb.action;

import com.hb.model.GuestDao;
import com.opensymphony.xwork2.Action;

import java.util.List;

public class ListAll implements Action {
    private List list;

    public List getList() {
        return list;
    }

//    public void setList(List list) {
//        this.list = list;
//    }

    @Override
    public String execute() throws Exception {
        list = new GuestDao().selectAll();

        return SUCCESS;
    }
}
