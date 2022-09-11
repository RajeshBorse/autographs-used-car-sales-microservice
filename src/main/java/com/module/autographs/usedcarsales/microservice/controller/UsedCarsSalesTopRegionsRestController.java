package com.module.autographs.usedcarsales.microservice.controller;

import com.module.autographs.usedcarsales.microservice.dto.UsedCarsSalesTopRegionsDTO;
import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesTopRegionsDataModel;
import com.module.autographs.usedcarsales.microservice.service.UsedCarsSalesTopRegionsService;
import com.module.autographs.usedcarsales.microservice.util.Constants;
import com.module.autographs.usedcarsales.microservice.util.ObjectMapperUtils;
import com.module.autographs.usedcarsales.microservice.repository.UsedCarsSalesTopRegionsRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("/api/v1/usedCarSales")
@Tag(name = "UsedCarTopRegionsSales")

public class UsedCarsSalesTopRegionsRestController {

    @Autowired
    private UsedCarsSalesTopRegionsService usedCarsSalesTopRegionsService;

    @Autowired
    private UsedCarsSalesTopRegionsRepository usedCarsSalesTopRegionsRepository;

    @GetMapping(value = Constants.USED_CARS_TOP_REGIONS_SALES_GET_API_PATH)
    @Operation(summary = Constants.USED_CARS_TOP_REGIONS_SALES_GET_SUMMARY, responses = {@ApiResponse(description = Constants.USED_CARS_TOP_REGIONS_SALES_SUCCESS, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content(mediaType = "application/json", schema = @Schema(implementation = UsedCarsSalesTopRegionsDTO.class))), @ApiResponse(description = Constants.USED_CARS_TOP_REGIONS_SALES_NO_DATA_FOUND, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<UsedCarsSalesTopRegionsDTO> getUsedCarsSalesTopRegionsData() {
        List<UsedCarsSalesTopRegionsDTO> usedCarsSalesTopRegionsDTOList = ObjectMapperUtils.mapAll(usedCarsSalesTopRegionsService.findAll(), UsedCarsSalesTopRegionsDTO.class);
        if (usedCarsSalesTopRegionsDTOList.size() > 0) {
            return ResponseEntity.ok(usedCarsSalesTopRegionsDTOList).getBody();
        } else {
            throw new ResponseStatusException(HttpStatus.OK, Constants.USED_CARS_TOP_REGIONS_SALES_NO_DATA_FOUND);
        }
    }

    @PostMapping(value = Constants.USED_CARS_TOP_REGIONS_SALES_POST_API_PATH)
    @Operation(summary = Constants.USED_CARS_TOP_REGIONS_SALES_POST_SUMMARY, responses = {@ApiResponse(description = Constants.USED_CARS_TOP_REGIONS_SALES_ADD_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = UsedCarsSalesTopRegionsDTO.class))), @ApiResponse(description = Constants.USED_CARS_TOP_REGIONS_SALES_ADD_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addUsedCarsSalesTopRegionsData(@RequestBody List<UsedCarsSalesTopRegionsDTO> usedCarsSalesTopRegionsDTOList) {
        List<UsedCarsSalesTopRegionsDataModel> usedCarsSalesTopRegionsDataModelList = usedCarsSalesTopRegionsService.addUsedCarsSalesTopRegionsData(ObjectMapperUtils.mapAll(usedCarsSalesTopRegionsDTOList, UsedCarsSalesTopRegionsDataModel.class));
        if (usedCarsSalesTopRegionsDataModelList.size() > 0) {
            return ResponseEntity.ok(Constants.USED_CARS_TOP_REGIONS_SALES_ADD_SUCCESS);
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, Constants.USED_CARS_TOP_REGIONS_SALES_ADD_FAILURE);
        }
    }

    @DeleteMapping(value = Constants.USED_CARS_TOP_REGIONS_SALES_DELETE_ALL_API_PATH)
    @Operation(summary = Constants.USED_CARS_TOP_REGIONS_SALES_DELETE_ALL_SUMMARY, responses = {@ApiResponse(description = Constants.USED_CARS_TOP_REGIONS_SALES_DELETE_ALL_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = UsedCarsSalesTopRegionsDTO.class))), @ApiResponse(description = Constants.USED_CARS_TOP_REGIONS_SALES_DELETE_ALL_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllUsedCarsSalesData() {
        usedCarsSalesTopRegionsRepository.deleteAll();
        return ResponseEntity.ok(Constants.USED_CARS_TOP_REGIONS_SALES_DELETE_ALL_SUCCESS);
    }

}