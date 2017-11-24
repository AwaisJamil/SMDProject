package com.example.awais.test;

import android.support.annotation.DrawableRes;



public class Contact {
    String name;
    int image;
    String number;

    public String  getNumber(){
        return number;
    }
    public void setnumber( String num){
        this.number = num;
    }

    public int getImage(){
        return image;
    }
    public void setImage(@DrawableRes int img){
        image = img;
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
