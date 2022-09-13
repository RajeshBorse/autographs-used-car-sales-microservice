package com.module.autographs.usedcarsales.microservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "usedCarsSalesCollection")
public class UsedCarsSalesDataModel {

    @Id
    private String id;
    private String year;
    private String month;
    private String usedCarsSalesYearwiseCount;

    public UsedCarsSalesDataModel() {
    }

    public UsedCarsSalesDataModel(String id, String year, String month, String usedCarsSalesYearwiseCount) {
        this.id = id;
        this.year = year;
        this.month = month;
        this.usedCarsSalesYearwiseCount = usedCarsSalesYearwiseCount;
    }


    @Override
    public String toString() {
        return "UsedCarsSalesDTO{" + "id='" + id + '\'' + ", year='" + year + '\'' + ", month='" + month + '\'' + ", usedCarsSalesYearwiseCount='" + usedCarsSalesYearwiseCount + '\'' + '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getUsedCarsSalesYearwiseCount() {
        return usedCarsSalesYearwiseCount;
    }

    public void setUsedCarsSalesYearwiseCount(String usedCarsSalesYearwiseCount) {
        this.usedCarsSalesYearwiseCount = usedCarsSalesYearwiseCount;
    }
}