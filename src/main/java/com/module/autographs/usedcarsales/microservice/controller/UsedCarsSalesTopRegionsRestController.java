package com.module.autographs.usedcarsales.microservice.controller;

import com.module.autographs.usedcarsales.microservice.AutographsUsedCarSalesApplication;
import com.module.autographs.usedcarsales.microservice.dto.UsedCarsSalesTopRegionsDTO;
import com.module.autographs.usedcarsales.microservice.model.UsedCarsSalesTopRegionsDataModel;
import com.module.autographs.usedcarsales.microservice.repository.UsedCarsSalesTopRegionsRepository;
import com.module.autographs.usedcarsales.microservice.service.UsedCarsSalesTopRegionsService;
import com.module.autographs.usedcarsales.microservice.util.ObjectMapperUtils;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;
import static com.module.autographs.usedcarsales.microservice.util.Constants.*;


@RestController
@RequestMapping("/api/v1/usedCarSales")
@Tag(name = "UsedCarsSalesTopRegionsRestController")

public class UsedCarsSalesTopRegionsRestController {

    @Autowired
    private UsedCarsSalesTopRegionsService usedCarsSalesTopRegionsService;

    @Autowired
    private UsedCarsSalesTopRegionsRepository usedCarsSalesTopRegionsRepository;

    private static final Logger logger = LogManager.getLogger(AutographsUsedCarSalesApplication.class);

    @GetMapping(value = GET_API_PATH_BY_TOP_REGIONS_TYPE)
    @Operation(summary = SWAGGER_GET_API_BY_TOP_REGIONS_TYPE_SUMMARY, responses = {@ApiResponse(description = SWAGGER_GET_API_BY_TOP_REGIONS_SUCCESS, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content(mediaType = "application/json", schema = @Schema(implementation = UsedCarsSalesTopRegionsDTO.class))), @ApiResponse(description = SWAGGER_GET_API_BY_TOP_REGIONS_NO_DATA_FOUND, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<UsedCarsSalesTopRegionsDTO> getUsedCarsSalesTopRegionsData() {
        List<UsedCarsSalesTopRegionsDTO> usedCarsSalesTopRegionsDTOList = ObjectMapperUtils.mapAll(usedCarsSalesTopRegionsService.findAll(), UsedCarsSalesTopRegionsDTO.class);
        if (usedCarsSalesTopRegionsDTOList.size() > 0) {
            logger.info(LOGGER_GET_API_BY_TOP_MODELS_TYPE_SUCCESS);
            return ResponseEntity.ok(usedCarsSalesTopRegionsDTOList).getBody();
        } else {
            logger.info(LOGGER_GET_API_BY_TOP_MODELS_TYPE_FAILURE);
            throw new ResponseStatusException(HttpStatus.OK, SWAGGER_GET_API_BY_TOP_REGIONS_NO_DATA_FOUND);
        }
    }

    @PostMapping(value = POST_API_PATH_BY_TOP_REGIONS_TYPE)
    @Operation(summary = SWAGGER_POST_API_BY_TOP_REGIONS_TYPE_SUMMARY, responses = {@ApiResponse(description = SWAGGER_POST_API_BY_TOP_REGIONS_TYPE_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = UsedCarsSalesTopRegionsDTO.class))), @ApiResponse(description = SWAGGER_POST_API_BY_TOP_REGIONS_TYPE_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addUsedCarsSalesTopRegionsData(@RequestBody List<UsedCarsSalesTopRegionsDTO> usedCarsSalesTopRegionsDTOList) {
        List<UsedCarsSalesTopRegionsDataModel> usedCarsSalesTopRegionsDataModelList = usedCarsSalesTopRegionsService.addUsedCarsSalesTopRegionsData(ObjectMapperUtils.mapAll(usedCarsSalesTopRegionsDTOList, UsedCarsSalesTopRegionsDataModel.class));
        if (usedCarsSalesTopRegionsDataModelList.size() > 0) {
            logger.info(LOGGER_POST_API_BY_TOP_MODELS_TYPE_SUCCESS);
            return ResponseEntity.ok(SWAGGER_POST_API_BY_TOP_REGIONS_TYPE_SUCCESS);
        } else {
            logger.info(LOGGER_POST_API_BY_TOP_MODELS_TYPE_FAILURE);
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, SWAGGER_POST_API_BY_TOP_REGIONS_TYPE_FAILURE);
        }
    }

    @DeleteMapping(value = DELETE_ALL_API_PATH_BY_TOP_REGIONS_TYPE)
    @Operation(summary = SWAGGER_DELETE_API_BY_TOP_REGIONS_TYPE_SUMMARY, responses = {@ApiResponse(description = SWAGGER_DELETE_API_BY_TOP_REGIONS_TYPE_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = UsedCarsSalesTopRegionsDTO.class))), @ApiResponse(description = SWAGGER_DELETE_API_BY_TOP_REGIONS_TYPE_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllUsedCarsSalesData() {
        logger.info(LOGGER_DELETE_API_BY_TOP_MODELS_TYPE_SUCCESS);
        usedCarsSalesTopRegionsRepository.deleteAll();
        return ResponseEntity.ok(SWAGGER_DELETE_API_BY_TOP_REGIONS_TYPE_SUCCESS);
    }

}
