package com.module.autographs.usedcarsales.microservice.service;

import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesTopRegionsDataModel;

import java.util.List;

public interface UsedCarsSalesTopRegionsService {

    List<UsedCarsSalesTopRegionsDataModel> findAll();

    List<UsedCarsSalesTopRegionsDataModel> addUsedCarsSalesTopRegionsData(List<UsedCarsSalesTopRegionsDataModel> newUsedCarsSalesTopRegionsDataModelList);

    List<UsedCarsSalesTopRegionsDataModel> findAllUsedCarsSalesTopRegionsDataByType(String type);
}