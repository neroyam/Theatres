package com.example.kirovtheaters.model;

import java.io.Serializable;

public class Theatre implements Serializable {

    private int imageId;
    private String name;
    private String address;
    private String site;
    private String troupe;
    private String vk;
    private String phone;

    public int getImageId() {
        return imageId;
    }
    public void setImageId(int imageId) { this.imageId = imageId; }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }

    public String getSite() { return site; }
    public void setSite(String site) {
        this.site = site;
    }

    public String getVk() { return vk; }
    public void setVk(String vk) {
        this.vk = vk;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTroupe() {
        return troupe;
    }
    public void setTroupe(String troupe) {
        this.troupe = troupe;
    }
}
