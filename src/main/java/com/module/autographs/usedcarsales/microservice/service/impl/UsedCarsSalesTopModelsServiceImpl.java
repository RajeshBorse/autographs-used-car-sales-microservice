package com.module.autographs.usedcarsales.microservice.service.impl;

import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesTopModelsDataModel;
import com.module.autographs.usedcarsales.microservice.service.UsedCarsSalesTopModelsService;
import com.module.autographs.usedcarsales.microservice.repository.UsedCarsSalesTopModelsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsedCarsSalesTopModelsServiceImpl implements UsedCarsSalesTopModelsService {

    @Autowired
    UsedCarsSalesTopModelsRepository usedCarsSalesTopModelsRepository;

    @Override
    public List<UsedCarsSalesTopModelsDataModel> findAll() {
        return usedCarsSalesTopModelsRepository.findAll();
    }

    @Override
    public List<UsedCarsSalesTopModelsDataModel> addUsedCarsSalesTopModelsData(List<UsedCarsSalesTopModelsDataModel> usedCarsSalesTopModelsDataModelList) {
        return usedCarsSalesTopModelsRepository.saveAll(usedCarsSalesTopModelsDataModelList);
    }

    public List<UsedCarsSalesTopModelsDataModel> findAllUsedCarsSalesTopModelsDataByType(String type) {
        List<UsedCarsSalesTopModelsDataModel> usedCarsSalesTopModelsDataModelList = usedCarsSalesTopModelsRepository.findAllUsedCarsSalesTopModelsByType(type);
        return usedCarsSalesTopModelsDataModelList;
    }

}