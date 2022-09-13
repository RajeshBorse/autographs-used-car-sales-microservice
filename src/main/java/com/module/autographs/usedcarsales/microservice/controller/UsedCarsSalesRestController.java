package com.module.autographs.usedcarsales.microservice.controller;

import com.module.autographs.usedcarsales.microservice.AutographsUsedCarSalesApplication;
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
@Tag(name = "UsedCarsSalesRestController")

public class UsedCarsSalesRestController {

    @Autowired
    private UsedCarsSalesService usedCarsSalesService;

    @Autowired
    private UsedCarsSalesRepository usedCarsSalesRepository;

    private static final Logger logger = LogManager.getLogger(AutographsUsedCarSalesApplication.class);


    @GetMapping(value = GET_API_PATH)
    @Operation(summary = SWAGGER_GET_API_SUMMARY, responses = {@ApiResponse(description = SWAGGER_GET_API_SUCCESS, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content(mediaType = "application/json", schema = @Schema(implementation = UsedCarsSalesDTO.class))), @ApiResponse(description = SWAGGER_GET_API_NO_DATA_FOUND, responseCode = HTTP_RESPONSE_CODE_OK, content = @Content)})
    public List<UsedCarsSalesDTO> getUsedCarsSalesData() {
        List<UsedCarsSalesDTO> usedCarsSalesDTOList = ObjectMapperUtils.mapAll(usedCarsSalesService.findAll(), UsedCarsSalesDTO.class);
        if (usedCarsSalesDTOList.size() > 0) {
            return ResponseEntity.ok(usedCarsSalesDTOList).getBody();
        } else {
            throw new ResponseStatusException(HttpStatus.OK, SWAGGER_GET_API_NO_DATA_FOUND);
        }
    }

    @PostMapping(value = POST_API_PATH)
    @Operation(summary = SWAGGER_POST_API_SUMMARY, responses = {@ApiResponse(description = SWAGGER_POST_API_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = UsedCarsSalesDTO.class))), @ApiResponse(description = SWAGGER_POST_API_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> addUsedCarsSalesData(@RequestBody List<UsedCarsSalesDTO> UsedCarsSalesDTOList) {
        List<UsedCarsSalesDataModel> usedCarsSalesDataModelList = usedCarsSalesService.addUsedCarsSalesData(ObjectMapperUtils.mapAll(UsedCarsSalesDTOList, UsedCarsSalesDataModel.class));
        if (usedCarsSalesDataModelList.size() > 0) {
            return ResponseEntity.ok(SWAGGER_POST_API_SUCCESS);
        } else {
            throw new ResponseStatusException(HttpStatus.INTERNAL_SERVER_ERROR, SWAGGER_POST_API_FAILURE);
        }
    }

    @DeleteMapping(value = DELETE_ALL_API_PATH)
    @Operation(summary = SWAGGER_DELETE_API_SUMMARY, responses = {@ApiResponse(description = SWAGGER_DELETE_API_SUCCESS, responseCode = "200", content = @Content(mediaType = "application/text", schema = @Schema(implementation = UsedCarsSalesDTO.class))), @ApiResponse(description = SWAGGER_DELETE_API_FAILURE, responseCode = HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR, content = @Content)})
    public ResponseEntity<?> deleteAllUsedCarsSalesData() {
        usedCarsSalesRepository.deleteAll();
        return ResponseEntity.ok(SWAGGER_DELETE_API_SUCCESS);
    }

}
