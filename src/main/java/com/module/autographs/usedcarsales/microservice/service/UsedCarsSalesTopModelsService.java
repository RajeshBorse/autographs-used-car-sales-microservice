package com.module.autographs.usedcarsales.microservice.service;

import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesTopModelsDataModel;

import java.util.List;

public interface UsedCarsSalesTopModelsService {

    List<UsedCarsSalesTopModelsDataModel> findAll();

    List<UsedCarsSalesTopModelsDataModel> addUsedCarsSalesTopModelsData(List<UsedCarsSalesTopModelsDataModel> newUsedCarsSalesTopModelsDataModelList);

    List<UsedCarsSalesTopModelsDataModel> findAllUsedCarsSalesTopModelsDataByType(String type);
}