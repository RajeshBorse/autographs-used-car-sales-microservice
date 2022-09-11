package com.module.autographs.usedcarsales.microservice.service;

import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesDataModel;

import java.util.List;

public interface UsedCarsSalesService {

    List<UsedCarsSalesDataModel> findAll();

    List<UsedCarsSalesDataModel> addUsedCarsSalesData(List<UsedCarsSalesDataModel> newUsedCarsSalesDataModelList);

    List<UsedCarsSalesDataModel> findAllUsedCarsSalesDataByType(String type);
}