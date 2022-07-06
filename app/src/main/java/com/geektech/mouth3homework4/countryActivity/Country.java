package com.geektech.mouth3homework4.countryActivity;

public class Country {
    private int  imageCountry;
    private String tvCountry, tvCapital;

    public int getImageCountry() {
        return imageCountry;
    }

    public void setImageCountry(int imageCountry) {
        this.imageCountry = imageCountry;
    }

    public String getTvCountry() {
        return tvCountry;
    }

    public void setTvCountry(String tvCountry) {
        this.tvCountry = tvCountry;
    }

    public String getTvCapital() {
        return tvCapital;
    }

    public void setTvCapital(String tvCapital) {
        this.tvCapital = tvCapital;
    }

    public Country(int  imageCountry, String tvCountry, String tvCapital) {
        this.imageCountry = imageCountry;
        this.tvCountry = tvCountry;
        this.tvCapital = tvCapital;
    }
}
