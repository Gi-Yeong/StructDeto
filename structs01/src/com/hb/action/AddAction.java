package com.hb.action;

import com.hb.model.GuestDao;
import com.opensymphony.xwork2.ActionSupport;

public class AddAction extends ActionSupport {
    private int sabun;
    private String name;
    private int pay;

    public void setSabun(int sabun) {
        this.sabun = sabun;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPay(int pay) {
        this.pay = pay;
    }

    @Override
    public String execute() throws Exception {
        new GuestDao().insertOne(sabun, name, pay);

        return SUCCESS;
    }

    @Override
    public void validate() {
        if ("".equals(sabun) || sabun == 0){
            addFieldError("sabun", "입력해 주세요");
        } else if (sabun > 9999){
            addFieldError("sabun", "4자리 입니다");
        }
    }
}
