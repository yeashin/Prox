package com.example.steffan.prox;

/**
 * Created by yeashin on 2018-01-27.
 */

public class ListItem {

    private String header;
    private String description;

    public ListItem(String hd, String des){

        this.header = hd;
        this.description = des;
    }

    public String getHeader(){
        return header;
    }

    public String getDescription(){
        return description;
    }
}
