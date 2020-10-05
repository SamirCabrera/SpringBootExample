package com.example.demo.Model;

public class UserV2 extends User {
    public UserV2() { }

    public UserV2(int _id, String _name, String _lang) { 
        super(_id, _name);
        this.lang = _lang;
    }
    
    private String lang;
    public String getLang() { return lang; }
    public void setLang(String lang) { this.lang = lang; }
}
