package com.obito.Basic;

public enum Hints {

    /**
     * 空字符串
     */
    EMPTY(""),
    /**
     * 用户名为空的提示
     */
    ERROR_USERNAME("请输入用户名");

    private String name;

    private Hints(String name){
    this.name=name;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
    this.name=name;
    }
}


