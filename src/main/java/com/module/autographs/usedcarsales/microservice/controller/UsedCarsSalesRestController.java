package com.module.autographs.usedcarsales.microservice.controller;

import com.module.autographs.usedcarsales.microservice.util.Constants;
import com.module.autographs.usedcarsales.microservice.dto.UsedCarsSalesDTO;
import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesDataModel;
import com.module.autographs.usedcarsales.microservice.repository.UsedCarsSalesRepository;
import com.module.autographs.usedcarsales.microservice.service.UsedCarsSalesService;
import com.module.autographs.usedcarsales.microservice.util.ObjectMapperUtils;
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
@Tag(name = "UsedCarSales")

public class UsedCarsSalesRestController {

    @Autowired
    private UsedCarsSalesService usedCarsSalesService;

    @Autowired
    private UsedCarsSalesRepository usedCarsSalesRepository;

    @GetMapping(value = Constants.USED_CARS_SALES_GET_API_PATH)
    @Operation(summary = Constants.USED_CARS_SALES_GET_SUMMARY, responses = {@ApiResponse(description = Constants.USED_CARS_SALES_SUCCESS, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content(mediaType = "application/json", schema = @Schema(implementation = UsedCarsSalesDTO.class))), @ApiResponse(description = Constants.USED_CARS_SALES_NO_DATA_FOUND, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<UsedCarsSalesDTO> getUsedCarsSalesData() {
        List<UsedCarsSalesDTO> usedCarsSalesDTOList = ObjectMapperUtils.mapAll(usedCarsSalesService.findAll(), UsedCarsSalesDTO.class);
        if (usedCarsSalesDTOList.size() > 0) {
            return ResponseEntity.ok(usedCarsSalesDTOList).getBody();
        } else {
            throw new ResponseStatusException(HttpStatus.OK, Constants.USED_CARS_SALES_NO_DATA_FOUND);
        }
    }

    @PostMapping(value = Constants.USED_CARS_SALES_POST_API_PATH)
    @Operation(summary = Constants.USED_CARS_SALES_POST_SUMMARY, responses = {@ApiResponse(description = Constants.USED_CARS_SALES_ADD_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = UsedCarsSalesDTO.class))), @ApiResponse(description = Constants.USED_CARS_SALES_ADD_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addUsedCarsSalesData(@RequestBody List<UsedCarsSalesDTO> UsedCarsSalesDTOList) {
        List<UsedCarsSalesDataModel> usedCarsSalesDataModelList = usedCarsSalesService.addUsedCarsSalesData(ObjectMapperUtils.mapAll(UsedCarsSalesDTOList, UsedCarsSalesDataModel.class));
        if (usedCarsSalesDataModelList.size() > 0) {
            return ResponseEntity.ok(Constants.USED_CARS_SALES_ADD_SUCCESS);
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, Constants.USED_CARS_SALES_ADD_FAILURE);
        }
    }

    @DeleteMapping(value = Constants.USED_CARS_SALES_DELETE_ALL_API_PATH)
    @Operation(summary = Constants.USED_CARS_SALES_DELETE_ALL_SUMMARY, responses = {@ApiResponse(description = Constants.USED_CARS_SALES_DELETE_ALL_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = UsedCarsSalesDTO.class))), @ApiResponse(description = Constants.USED_CARS_SALES_DELETE_ALL_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllUsedCarsSalesData() {
        usedCarsSalesRepository.deleteAll();
        return ResponseEntity.ok(Constants.USED_CARS_SALES_DELETE_ALL_SUCCESS);
    }

}
