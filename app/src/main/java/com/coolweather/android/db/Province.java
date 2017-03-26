package com.coolweather.android.db;

//import javax.management.openmbean.CompositeDataSupport;

import org.litepal.crud.DataSupport;

/**
 * Created by asus on 2017-03-26.
 */

public class Province extends DataSupport {
    private int id;
    private String provinceName;//省名
    private int provinceCode;//省代号

    public int getProvinceCode() {
        return provinceCode;
    }

    public void setProvinceCode(int provinceCode) {
        this.provinceCode = provinceCode;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }
}
