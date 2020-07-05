package com.example.android.tourguideappudacity;

import android.util.Log;

public class location {

    private String name;
    private String description;
    private String address;
    private String phone;
    private String schedule;
    private String price;
    private String email;
    private int imageresourceicon=NO_IMAGE_PROVIDED;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;


    public location(String name, String description, String address, String phone, String schedule,
                    String price, int imageResourceId,int imageicon,String Email) {
        this.name = name;
        this.description = description;
        this.address = address;
        this.phone = phone;
        this.schedule = schedule;
        this.price = price;
        this.imageResourceId = imageResourceId;
        this.imageresourceicon=imageicon;
        this.email=Email;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public String getAddress() {
        return address;
    }

    public String getPhone() {
        return phone;
    }

    public String getSchedule() {
        return schedule;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }
    public int getImageresourceicon(){
        return imageresourceicon;
    }
    public String getEmail(){
        return email;
    }


    public boolean hasImage(){
        Log.v("hasImage", "word has image: "+ (imageResourceId != NO_IMAGE_PROVIDED));
        return imageResourceId != NO_IMAGE_PROVIDED;
    }


    public boolean hasPrice(){
        return getPrice() != null;
    }

    public boolean hasPhone(){
        return getPhone() != null;
    }

    public boolean hasAddress(){
        return getAddress() != null;
    }

    public boolean hasSchedule(){
        return getSchedule() != null;
    }

    public boolean hasEmail(){return getEmail()!=null;}

    @Override
    public String toString() {
        String output = getName() + "\n" +
                getDescription() + "\n" +
                getAddress() + "\n" +
                getPhone() + "\n" +
                getPrice() + "\n" +
                getEmail()+"\n"+
                getImageresourceicon()+"\n"+
                getSchedule() + "\n" +
                getImageResourceId()
                ;

        return output;
    }
}
