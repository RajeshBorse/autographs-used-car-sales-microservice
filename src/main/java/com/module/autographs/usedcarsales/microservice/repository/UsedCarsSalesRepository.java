package com.module.autographs.usedcarsales.microservice.repository;

import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesDataModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface UsedCarsSalesRepository extends MongoRepository<UsedCarsSalesDataModel, String> {

    @Query("{type:'?0'}")
    List<UsedCarsSalesDataModel> findUsedCarsSalesDataByType(String type);
}