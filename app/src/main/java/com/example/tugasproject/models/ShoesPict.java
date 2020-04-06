package com.example.tugasproject.models;

public class ShoesPict {
    String pict;
    String name;

    public ShoesPict(String pict, String name) {
        this.pict = pict;
        this.name = name;
    }

    public String getLogo() {
        return pict;
    }

    public void setLogo(String pict) {
        this.pict = pict;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
