package com.coolweather.android.coolweather.db;

import org.litepal.crud.DataSupport;

public class County extends DataSupport {
    private int id;
    private String countryNmae;
    private String weatherId;
    private int cityId;

    public int getCityId() {
        return cityId;
    }

    public int getId() {
        return id;
    }

    public String getCountryNmae() {
        return countryNmae;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setCityId(int cityId) {
        this.cityId = cityId;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCountryNmae(String countryNmae) {
        this.countryNmae = countryNmae;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }
}
