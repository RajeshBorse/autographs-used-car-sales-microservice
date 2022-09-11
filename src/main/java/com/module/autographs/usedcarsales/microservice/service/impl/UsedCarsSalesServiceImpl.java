package com.module.autographs.usedcarsales.microservice.service.impl;

import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesDataModel;
import com.module.autographs.usedcarsales.microservice.service.UsedCarsSalesService;
import com.module.autographs.usedcarsales.microservice.repository.UsedCarsSalesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsedCarsSalesServiceImpl implements UsedCarsSalesService {

    @Autowired
    UsedCarsSalesRepository usedCarsSalesRepository;

    @Override
    public List<UsedCarsSalesDataModel> findAll() {
        return usedCarsSalesRepository.findAll();
    }

    @Override
    public List<UsedCarsSalesDataModel> addUsedCarsSalesData(List<UsedCarsSalesDataModel> usedCarsSalesDataModelList) {
        return usedCarsSalesRepository.saveAll(usedCarsSalesDataModelList);
    }

    public List<UsedCarsSalesDataModel> findAllUsedCarsSalesDataByType(String type) {
        List<UsedCarsSalesDataModel> usedCarsSalesDataModelList = usedCarsSalesRepository.findUsedCarsSalesDataByType(type);
        return usedCarsSalesDataModelList;
    }

}