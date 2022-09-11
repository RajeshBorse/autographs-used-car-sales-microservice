package com.module.autographs.usedcarsales.microservice.repository;

import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesTopModelsDataModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UsedCarsSalesTopModelsRepository extends MongoRepository<UsedCarsSalesTopModelsDataModel, String> {

    @Query("{type:'?0'}")
    List<UsedCarsSalesTopModelsDataModel> findAllUsedCarsSalesTopModelsByType(String type);
}
