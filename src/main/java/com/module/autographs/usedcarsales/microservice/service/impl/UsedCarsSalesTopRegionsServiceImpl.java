package com.module.autographs.usedcarsales.microservice.service.impl;

import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesTopRegionsDataModel;
import com.module.autographs.usedcarsales.microservice.service.UsedCarsSalesTopRegionsService;
import com.module.autographs.usedcarsales.microservice.repository.UsedCarsSalesTopRegionsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsedCarsSalesTopRegionsServiceImpl implements UsedCarsSalesTopRegionsService {

    @Autowired
    UsedCarsSalesTopRegionsRepository usedCarsSalesTopRegionsRepository;

    @Override
    public List<UsedCarsSalesTopRegionsDataModel> findAll() {
        return usedCarsSalesTopRegionsRepository.findAll();
    }

    @Override
    public List<UsedCarsSalesTopRegionsDataModel> addUsedCarsSalesTopRegionsData(List<UsedCarsSalesTopRegionsDataModel> usedCarsSalesTopRegionsDataModelList) {
        return usedCarsSalesTopRegionsRepository.saveAll(usedCarsSalesTopRegionsDataModelList);
    }

    public List<UsedCarsSalesTopRegionsDataModel> findAllUsedCarsSalesTopRegionsDataByType(String type) {
        List<UsedCarsSalesTopRegionsDataModel> usedCarsSalesTopRegionsDataModelList = usedCarsSalesTopRegionsRepository.findAllUsedCarsSalesTopRegionsByType(type);
        return usedCarsSalesTopRegionsDataModelList;
    }

}
