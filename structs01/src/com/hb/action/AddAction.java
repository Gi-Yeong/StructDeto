package com.hb.action;

import com.hb.model.GuestDao;
import com.opensymphony.xwork2.ActionSupport;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

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
        Map<String, List<String>> map = getFieldErrors();   // 리스트를 통해서 메시지를 직접 뽑을 수 있다
        Set<String> key = map.keySet();
        Iterator<String> ite = key.iterator();
        while (ite.hasNext()) {
            String mapkey = ite.next();
            List<String> mapVal = map.get(mapkey);
            System.out.print(mapkey);
            System.out.println(":" + mapVal.get(0));
            mapVal.set(0, "문자는 안됩니다");
            if (mapkey.equals("pay")) {
                mapVal.add(1, "원기호 또는 콤마를 빼세요");
            } else {
                mapVal.add(1, "숫자를 입력해 주세요");
            }
        }
        if ("".equals(sabun) || sabun == 0) {
            addFieldError("sabun", "입력 확인");
        } else if (sabun > 9999) {
            addFieldError("sabun", "4자리 입니다");
        }
    }
}
