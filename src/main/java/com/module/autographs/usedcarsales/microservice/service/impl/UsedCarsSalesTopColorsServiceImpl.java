package com.module.autographs.usedcarsales.microservice.service.impl;

import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesTopColorsDataModel;
import com.module.autographs.usedcarsales.microservice.repository.UsedCarsSalesTopColorsRepository;
import com.module.autographs.usedcarsales.microservice.service.UsedCarsSalesTopColorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsedCarsSalesTopColorsServiceImpl implements UsedCarsSalesTopColorsService {

    @Autowired
    UsedCarsSalesTopColorsRepository usedCarsSalesTopColorsRepository;

    @Override
    public List<UsedCarsSalesTopColorsDataModel> findAll() {
        return usedCarsSalesTopColorsRepository.findAll();
    }

    @Override
    public List<UsedCarsSalesTopColorsDataModel> addUsedCarsSalesTopColorsData(List<UsedCarsSalesTopColorsDataModel> usedCarsSalesTopColorsDataModelList) {
        return usedCarsSalesTopColorsRepository.saveAll(usedCarsSalesTopColorsDataModelList);
    }

    public List<UsedCarsSalesTopColorsDataModel> findAllUsedCarsSalesTopColorsDataByType(String type) {
        List<UsedCarsSalesTopColorsDataModel> usedCarsSalesTopColorsDataModelList = usedCarsSalesTopColorsRepository.findAllUsedCarsSalesTopColorsByType(type);
        return usedCarsSalesTopColorsDataModelList;
    }

}
