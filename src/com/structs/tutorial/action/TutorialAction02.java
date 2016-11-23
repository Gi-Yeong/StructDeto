package com.structs.tutorial.action;

public class TutorialAction02 {
    private String msg;
    private String msg2;

    public String getMsg() {
        return msg;
    }

    public String getMsg2() {
        return msg2;
    }

    public String execute() {
        msg = "tutorial msg";
        msg2 = "메세지 전달";
        return "success";
    }
}
