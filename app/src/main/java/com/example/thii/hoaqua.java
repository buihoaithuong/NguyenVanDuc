package com.example.thii;

import android.content.Intent;

public class hoaqua {
    private int img;
    private String tieude;
    private String mota;

    public hoaqua(int img, String tieude, String mota) {
        this.img = img;
        this.tieude = tieude;
        this.mota = mota;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTieude() {
        return tieude;
    }

    public void setTieude(String tieude) {
        this.tieude = tieude;
    }

    public String getMota() {
        return mota;
    }

    public void setMota(String mota) {
        this.mota = mota;
    }
}
