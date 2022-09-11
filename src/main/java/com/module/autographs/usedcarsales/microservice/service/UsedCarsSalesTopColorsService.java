package com.module.autographs.usedcarsales.microservice.service;

import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesTopColorsDataModel;

import java.util.List;

public interface UsedCarsSalesTopColorsService {

    List<UsedCarsSalesTopColorsDataModel> findAll();

    List<UsedCarsSalesTopColorsDataModel> addUsedCarsSalesTopColorsData(List<UsedCarsSalesTopColorsDataModel> newUsedCarsSalesTopColorsDataModelList);

    List<UsedCarsSalesTopColorsDataModel> findAllUsedCarsSalesTopColorsDataByType(String type);
}