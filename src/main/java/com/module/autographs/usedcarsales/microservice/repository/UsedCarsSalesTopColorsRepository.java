package com.module.autographs.usedcarsales.microservice.repository;

import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesTopColorsDataModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UsedCarsSalesTopColorsRepository extends MongoRepository<UsedCarsSalesTopColorsDataModel, String> {

    @Query("{type:'?0'}")
    List<UsedCarsSalesTopColorsDataModel> findAllUsedCarsSalesTopColorsByType(String type);
}