package com.singlecell.carousel.model;


import java.io.Serializable;

public class Slide implements Serializable{

    private String imageUrl;
    private int imageCorner;

    public Slide(String imageUrl,int imageCorner) {
        this.imageUrl = imageUrl;
        this.imageCorner = imageCorner;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public int getImageCorner() {
        return imageCorner;
    }

    public void setImageCorner(int imageCorner) {
        this.imageCorner = imageCorner;
    }
}
