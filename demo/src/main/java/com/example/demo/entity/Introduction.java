package com.example.demo.entity;

public class Introduction {
    private Integer id;

    private String wareTitle;

    private String newPrice;

    private String oldPrice;

    private String deliveryAddress;

    private Integer msalesVolume;

    private Integer ssalesVolume;

    private String taste;

    private String pack;

    private Integer number;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getWareTitle() {
        return wareTitle;
    }

    public void setWareTitle(String wareTitle) {
        this.wareTitle = wareTitle == null ? null : wareTitle.trim();
    }

    public String getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(String newPrice) {
        this.newPrice = newPrice == null ? null : newPrice.trim();
    }

    public String getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(String oldPrice) {
        this.oldPrice = oldPrice == null ? null : oldPrice.trim();
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress == null ? null : deliveryAddress.trim();
    }

    public Integer getMsalesVolume() {
        return msalesVolume;
    }

    public void setMsalesVolume(Integer msalesVolume) {
        this.msalesVolume = msalesVolume;
    }

    public Integer getSsalesVolume() {
        return ssalesVolume;
    }

    public void setSsalesVolume(Integer ssalesVolume) {
        this.ssalesVolume = ssalesVolume;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste == null ? null : taste.trim();
    }

    public String getPack() {
        return pack;
    }

    public void setPack(String pack) {
        this.pack = pack == null ? null : pack.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
}