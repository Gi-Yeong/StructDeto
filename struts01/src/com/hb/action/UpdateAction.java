package com.hb.action;

import com.hb.model.GuestDao;
import com.hb.model.GuestVo;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

public class UpdateAction extends ActionSupport implements ModelDriven<GuestVo> {
    private GuestVo bean = new GuestVo();

    public GuestVo getBean() {
        return bean;
    }

    public void setBean(GuestVo bean) {
        this.bean = bean;
    }

    @Override
    public String execute() throws Exception {
        new GuestDao().UpdateOne(bean);
        return SUCCESS;
    }

    @Override
    public GuestVo getModel() {
        return bean;
    }
}
