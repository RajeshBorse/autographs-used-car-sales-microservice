package com.module.autographs.usedcarsales.microservice.controller;

import com.module.autographs.usedcarsales.microservice.dto.UsedCarsSalesTopColorsDTO;
import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesTopColorsDataModel;
import com.module.autographs.usedcarsales.microservice.repository.UsedCarsSalesTopColorsRepository;
import com.module.autographs.usedcarsales.microservice.service.UsedCarsSalesTopColorsService;
import com.module.autographs.usedcarsales.microservice.util.Constants;
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
@Tag(name = "UsedCarTopColorsSales")

public class UsedCarsSalesTopColorsRestController {

    @Autowired
    private UsedCarsSalesTopColorsService usedCarsSalesTopColorsService;

    @Autowired
    private UsedCarsSalesTopColorsRepository usedCarsSalesTopColorsRepository;

    @GetMapping(value = Constants.USED_CARS_TOP_COLORS_SALES_GET_API_PATH)
    @Operation(summary = Constants.USED_CARS_TOP_COLORS_SALES_GET_SUMMARY, responses = {@ApiResponse(description = Constants.USED_CARS_TOP_COLORS_SALES_SUCCESS, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content(mediaType = "application/json", schema = @Schema(implementation = UsedCarsSalesTopColorsDTO.class))), @ApiResponse(description = Constants.USED_CARS_TOP_COLORS_SALES_NO_DATA_FOUND, responseCode = Constants.HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<UsedCarsSalesTopColorsDTO> getUsedCarsSalesTopColorsData() {
        List<UsedCarsSalesTopColorsDTO> usedCarsSalesTopColorsDTOList = ObjectMapperUtils.mapAll(usedCarsSalesTopColorsService.findAll(), UsedCarsSalesTopColorsDTO.class);
        if (usedCarsSalesTopColorsDTOList.size() > 0) {
            return ResponseEntity.ok(usedCarsSalesTopColorsDTOList).getBody();
        } else {
            throw new ResponseStatusException(HttpStatus.OK, Constants.USED_CARS_TOP_COLORS_SALES_NO_DATA_FOUND);
        }
    }

    @PostMapping(value = Constants.USED_CARS_TOP_COLORS_SALES_POST_API_PATH)
    @Operation(summary = Constants.USED_CARS_TOP_COLORS_SALES_POST_SUMMARY, responses = {@ApiResponse(description = Constants.USED_CARS_TOP_COLORS_SALES_ADD_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = UsedCarsSalesTopColorsDTO.class))), @ApiResponse(description = Constants.USED_CARS_TOP_COLORS_SALES_ADD_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addUsedCarsSalesTopColorsData(@RequestBody List<UsedCarsSalesTopColorsDTO> usedCarsSalesTopColorsDTOList) {
        List<UsedCarsSalesTopColorsDataModel> usedCarsSalesTopColorsDataModelList = usedCarsSalesTopColorsService.addUsedCarsSalesTopColorsData(ObjectMapperUtils.mapAll(usedCarsSalesTopColorsDTOList, UsedCarsSalesTopColorsDataModel.class));
        if (usedCarsSalesTopColorsDataModelList.size() > 0) {
            return ResponseEntity.ok(Constants.USED_CARS_TOP_COLORS_SALES_ADD_SUCCESS);
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, Constants.USED_CARS_TOP_COLORS_SALES_ADD_FAILURE);
        }
    }

    @DeleteMapping(value = Constants.USED_CARS_TOP_COLORS_SALES_DELETE_ALL_API_PATH)
    @Operation(summary = Constants.USED_CARS_TOP_COLORS_SALES_DELETE_ALL_SUMMARY, responses = {@ApiResponse(description = Constants.USED_CARS_TOP_COLORS_SALES_DELETE_ALL_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = UsedCarsSalesTopColorsDTO.class))), @ApiResponse(description = Constants.USED_CARS_TOP_COLORS_SALES_DELETE_ALL_FAILURE, responseCode = Constants.HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllUsedCarsSalesData() {
        usedCarsSalesTopColorsRepository.deleteAll();
        return ResponseEntity.ok(Constants.USED_CARS_TOP_COLORS_SALES_DELETE_ALL_SUCCESS);
    }

}