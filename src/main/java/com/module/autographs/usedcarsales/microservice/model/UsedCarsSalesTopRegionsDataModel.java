package com.module.autographs.usedcarsales.microservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UsedCarsTopRegionsSalesDataCollection")
public class UsedCarsSalesTopRegionsDataModel {

    @Id
    private String id;
    private String year;
    private String quarter;
    private String topRank;
    private String region;
    private String usedCarsQuarterlySalesTopRegionCount;
    private String percentage;
    private String quarterlyPercentage;


    public UsedCarsSalesTopRegionsDataModel() {
    }

    public UsedCarsSalesTopRegionsDataModel(String id, String year, String quarter, String topRank, String region, String usedCarsQuarterlySalesTopRegionCount, String percentage, String quarterlyPercentage) {
        this.id = id;
        this.year = year;
        this.quarter = quarter;
        this.topRank = topRank;
        this.region = region;
        this.usedCarsQuarterlySalesTopRegionCount = usedCarsQuarterlySalesTopRegionCount;
        this.percentage = percentage;
        this.quarterlyPercentage = quarterlyPercentage;
    }

    @Override
    public String toString() {
        return "UsedCarsSalesTopRegionsDataModel{" +
                "id='" + id + '\'' +
                ", year='" + year + '\'' +
                ", quarter='" + quarter + '\'' +
                ", topRank='" + topRank + '\'' +
                ", region='" + region + '\'' +
                ", usedCarsQuarterlySalesTopRegionCount='" + usedCarsQuarterlySalesTopRegionCount + '\'' +
                ", percentage='" + percentage + '\'' +
                ", quarterlyPercentage='" + quarterlyPercentage + '\'' +
                '}';
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

    public String getQuarter() {
        return quarter;
    }

    public void setQuarter(String quarter) {
        this.quarter = quarter;
    }

    public String getTopRank() {
        return topRank;
    }

    public void setTopRank(String topRank) {
        this.topRank = topRank;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getUsedCarsQuarterlySalesTopRegionCount() {
        return usedCarsQuarterlySalesTopRegionCount;
    }

    public void setUsedCarsQuarterlySalesTopRegionCount(String usedCarsQuarterlySalesTopRegionCount) {
        this.usedCarsQuarterlySalesTopRegionCount = usedCarsQuarterlySalesTopRegionCount;
    }

    public String getPercentage() {
        return percentage;
    }

    public void setPercentage(String percentage) {
        this.percentage = percentage;
    }

    public String getQuarterlyPercentage() {
        return quarterlyPercentage;
    }

    public void setQuarterlyPercentage(String quarterlyPercentage) {
        this.quarterlyPercentage = quarterlyPercentage;
    }
}