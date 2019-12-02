package com.example.doandd;

public class Words {
    public String key = "";
    public String value = "";
    public String html ="";
    public String pronounce = "";
    public int id ;

    public Words()
    {

    }

    public Words(String key, String value, String html, String pronounce, int id)
    {
        this.key = key;
        this.value = value;
        this.html = html;
        this.pronounce = pronounce;
        this.id = id;
    }
}
