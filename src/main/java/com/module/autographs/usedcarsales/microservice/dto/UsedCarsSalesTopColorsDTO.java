package com.module.autographs.usedcarsales.microservice.dto;

import org.springframework.data.annotation.Id;

/**
 * rsb34
 */

public class UsedCarsSalesTopColorsDTO {

    @Id
    private String id;
    private String year;
    private String quarter;
    private String topRank;
    private String color;
    private String usedCarsQuarterlySalesTopColorCount;
    private String percentage;

    private String quarterlyPercentage;


    public UsedCarsSalesTopColorsDTO() {
    }

    public UsedCarsSalesTopColorsDTO(String id, String year, String quarter, String topRank, String color, String usedCarsQuarterlySalesTopColorCount, String percentage, String quarterlyPercentage) {
        this.id = id;
        this.year = year;
        this.quarter = quarter;
        this.topRank = topRank;
        this.color = color;
        this.usedCarsQuarterlySalesTopColorCount = usedCarsQuarterlySalesTopColorCount;
        this.percentage = percentage;
        this.quarterlyPercentage = quarterlyPercentage;
    }

    @Override
    public String toString() {
        return "UsedCarsSalesTopColorsDTO{" +
                "id='" + id + '\'' +
                ", year='" + year + '\'' +
                ", quarter='" + quarter + '\'' +
                ", topRank='" + topRank + '\'' +
                ", color='" + color + '\'' +
                ", usedCarsQuarterlySalesTopColorCount='" + usedCarsQuarterlySalesTopColorCount + '\'' +
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUsedCarsQuarterlySalesTopColorCount() {
        return usedCarsQuarterlySalesTopColorCount;
    }

    public void setUsedCarsQuarterlySalesTopColorCount(String usedCarsQuarterlySalesTopColorCount) {
        this.usedCarsQuarterlySalesTopColorCount = usedCarsQuarterlySalesTopColorCount;
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