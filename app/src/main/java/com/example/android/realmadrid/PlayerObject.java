package com.example.android.realmadrid;

import static android.R.attr.id;

/**
 * Created by mostafa on 9/10/17.
 */

public class PlayerObject {
    private String mName,mPosition,mAge,mPlaceOfBirth;
    private int mNumber,mImage;
    private double mWeight,mHeight;

    public PlayerObject(String name,String position,int number){
        this.mName=name;
        this.mPosition=position;
        this.mNumber=number;

    }
    public PlayerObject(String name,String position,int number,int Image){
        this.mName=name;
        this.mPosition=position;
        this.mNumber=number;
        this.mImage=Image;

    }

    public PlayerObject(String name,String position,int number,int Image,String Age,String PlaceOfBirth,double weight,double height){
        this.mName=name;
        this.mPosition=position;
        this.mNumber=number;
        this.mImage=Image;
        this.mAge=Age;
        this.mPlaceOfBirth=PlaceOfBirth;
        this.mWeight=weight;
        this.mHeight=height;
    }

    //to get name.
    public String getmName(){return this.mName;}
    //to get position
    public String getmPosition(){return this.mPosition;}
    //to get number
    public int getmNumber(){return this.mNumber;}
    //to get Image
    public int getmImage(){return this.mImage;}
    //to get age
    public String getmAge(){return this.mAge;}
    //to get place of birthday
    public String getmPlaceOfBirth() { return this.mPlaceOfBirth; }
    //to get weight
    public double getmWeight(){return this.mWeight;}
    //to get height
    public double getmHeight(){return this.mHeight;}

    @Override
    public String toString() {
        return "The name is "+getmName()+"\n"+"The position is "+getmPosition()+"\n"+"The Number is "+getmNumber();
    }


}
