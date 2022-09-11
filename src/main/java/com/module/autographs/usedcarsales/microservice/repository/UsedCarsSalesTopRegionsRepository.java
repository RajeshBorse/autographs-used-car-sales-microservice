package com.module.autographs.usedcarsales.microservice.repository;

import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesTopRegionsDataModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UsedCarsSalesTopRegionsRepository extends MongoRepository<UsedCarsSalesTopRegionsDataModel, String> {

    @Query("{type:'?0'}")
    List<UsedCarsSalesTopRegionsDataModel> findAllUsedCarsSalesTopRegionsByType(String type);
}
