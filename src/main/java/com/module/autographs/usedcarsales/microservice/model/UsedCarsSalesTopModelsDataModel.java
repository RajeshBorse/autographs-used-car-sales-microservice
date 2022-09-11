package com.module.autographs.usedcarsales.microservice.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "UsedCarsTopModelsSalesDataCollection")
public class UsedCarsSalesTopModelsDataModel {

    @Id
    private String id;
    private String year;
    private String quarter;
    private String topRank;
    private String model;
    private String usedCarsQuarterlySalesTopModelCount;
    private String percentage;
    private String quarterlyPercentage;

    public UsedCarsSalesTopModelsDataModel() {
    }


    public UsedCarsSalesTopModelsDataModel(String id, String year, String quarter, String topRank, String model, String usedCarsQuarterlySalesTopModelCount, String percentage, String quarterlyPercentage) {
        this.id = id;
        this.year = year;
        this.quarter = quarter;
        this.topRank = topRank;
        this.model = model;
        this.usedCarsQuarterlySalesTopModelCount = usedCarsQuarterlySalesTopModelCount;
        this.percentage = percentage;
        this.quarterlyPercentage = quarterlyPercentage;
    }

    @Override
    public String toString() {
        return "UsedCarsSalesTopModelsDataModel{" +
                "id='" + id + '\'' +
                ", year='" + year + '\'' +
                ", quarter='" + quarter + '\'' +
                ", topRank='" + topRank + '\'' +
                ", model='" + model + '\'' +
                ", usedCarsQuarterlySalesTopModelCount='" + usedCarsQuarterlySalesTopModelCount + '\'' +
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getUsedCarsQuarterlySalesTopModelCount() {
        return usedCarsQuarterlySalesTopModelCount;
    }

    public void setUsedCarsQuarterlySalesTopModelCount(String usedCarsQuarterlySalesTopModelCount) {
        this.usedCarsQuarterlySalesTopModelCount = usedCarsQuarterlySalesTopModelCount;
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
