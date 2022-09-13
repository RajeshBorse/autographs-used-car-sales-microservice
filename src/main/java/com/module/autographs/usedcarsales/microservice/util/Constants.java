package com.module.autographs.usedcarsales.microservice.util;

public class Constants {

    // HTTP STATUS CODES
    public static final String HTTP_RESPONSE_CODE_OK = "200";
    public static final String HTTP_RESPONSE_CODE_INTERNAL_SERVER_ERROR = "500";

    // ALL API PATHS

    // 1 - USED CAR SALES
    public static final String GET_API_PATH = "/getAllUsedCarSalesData";
    public static final String POST_API_PATH = "/addUsedCarSalesData";
    public static final String DELETE_ALL_API_PATH = "/deleteAllUsedCarSalesData";

    // 2 - USED CAR SALES TOP COLORS
    public static final String GET_API_PATH_BY_TOP_COLORS_TYPE = "/getAllUsedCarSalesTopColorsData";
    public static final String POST_API_PATH_BY_TOP_COLORS_TYPE = "/addUsedCarSalesTopColorsData";
    public static final String DELETE_ALL_API_PATH_BY_TOP_COLORS_TYPE = "/deleteAllUsedCarSalesTopColorsData";

    // 3 - USED CAR SALES TOP MODELS
    public static final String GET_API_PATH_BY_TOP_MODELS_TYPE = "/getAllUsedCarSalesTopModelsData";
    public static final String POST_API_PATH_BY_TOP_MODELS_TYPE = "/addUsedCarSalesTopModelsData";
    public static final String DELETE_ALL_API_PATH_BY_TOP_MODELS_TYPE = "/deleteAllUsedCarSalesTopModelData";

    // 4 - USED CAR SALES TOP REGIONS
    public static final String GET_API_PATH_BY_TOP_REGIONS_TYPE = "/getAllUsedCarSalesTopRegionsData";
    public static final String POST_API_PATH_BY_TOP_REGIONS_TYPE = "/addUsedCarSalesTopRegionsData";
    public static final String DELETE_ALL_API_PATH_BY_TOP_REGIONS_TYPE = "/deleteAllUsedCarSalesTopRegionsData";


    // ALL SWAGGER CONSTANTS BELOW ---------------------------------------------------------------------------------------------------------

    // 1 - USED CARS SALES
    // GET API
    public static final String SWAGGER_GET_API_SUMMARY = "GET - USED CARS SALES DATA";
    public static final String SWAGGER_GET_API_SUCCESS = "USED CARS SALES DATA FETCHED SUCCESSFULLY.";
    public static final String SWAGGER_GET_API_NO_DATA_FOUND = "NO DATA FOUND FOR USED CARS SALES.";
    // POST API
    public static final String SWAGGER_POST_API_SUMMARY = "POST - ADD USED CARS SALES";
    public static final String SWAGGER_POST_API_SUCCESS = "USED CARS SALES DATA ADDED SUCCESSFULLY.";
    public static final String SWAGGER_POST_API_FAILURE = "FAILURE OCCURRED WHILE ADDING USED CARS SALES DATA.";
    // DELETE API
    public static final String SWAGGER_DELETE_API_SUMMARY = "DELETE ALL - USED CARS SALES DATA";
    public static final String SWAGGER_DELETE_API_SUCCESS = "USED CARS SALES DATA DELETED SUCCESSFULLY.";
    public static final String SWAGGER_DELETE_API_FAILURE = "FAILURE OCCURRED WHILE DELETING USED CARS SALES DATA.";

    // 2 - USED CARS TOP COLORS SALES
    // GET API
    public static final String SWAGGER_GET_API_BY_TOP_COLORS_TYPE_SUMMARY = "GET - USED CARS TOP COLORS SALES DATA";
    public static final String SWAGGER_GET_API_BY_TOP_COLORS_SUCCESS = "USED CARS TOP COLORS SALES DATA FETCHED SUCCESSFULLY.";
    public static final String SWAGGER_GET_API_BY_TOP_COLORS_NO_DATA_FOUND = "NO DATA FOUND FOR USED CARS TOP COLORS SALES.";
    // POST API
    public static final String SWAGGER_POST_API_BY_TOP_COLORS_TYPE_SUMMARY = "POST - ADD USED CARS TOP COLORS SALES";
    public static final String SWAGGER_POST_API_BY_TOP_COLORS_TYPE_SUCCESS = "USED CARS TOP COLORS SALES DATA ADDED SUCCESSFULLY.";
    public static final String SWAGGER_POST_API_BY_TOP_COLORS_TYPE_FAILURE = "FAILURE OCCURRED WHILE ADDING USED CARS TOP COLORS SALES DATA.";
    // DELETE API
    public static final String SWAGGER_DELETE_API_BY_TOP_COLORS_TYPE_SUMMARY = "DELETE ALL - USED CARS TOP COLORS SALES DATA";
    public static final String SWAGGER_DELETE_API_BY_TOP_COLORS_TYPE_SUCCESS = "USED CARS TOP COLORS SALES DATA DELETED SUCCESSFULLY.";
    public static final String SWAGGER_DELETE_API_BY_TOP_COLORS_TYPE_FAILURE = "FAILURE OCCURRED WHILE DELETING USED CARS TOP COLORS SALES DATA.";


    // 3 - USED CARS TOP MODELS SALES
    // GET API
    public static final String SWAGGER_GET_API_BY_TOP_MODELS_TYPE_SUMMARY = "GET - USED CARS TOP MODELS SALES DATA";
    public static final String SWAGGER_GET_API_BY_TOP_MODELS_SUCCESS = "USED CARS TOP MODELS SALES DATA FETCHED SUCCESSFULLY.";
    public static final String SWAGGER_GET_API_BY_TOP_MODELS_NO_DATA_FOUND = "NO DATA FOUND FOR USED CARS TOP MODELS SALES.";
    // POST API
    public static final String SWAGGER_POST_API_BY_TOP_MODELS_TYPE_SUMMARY = "POST - ADD USED CARS TOP MODELS SALES";
    public static final String SWAGGER_POST_API_BY_TOP_MODELS_TYPE_SUCCESS = "USED CARS TOP MODELS SALES DATA ADDED SUCCESSFULLY.";
    public static final String SWAGGER_POST_API_BY_TOP_MODELS_TYPE_FAILURE = "FAILURE OCCURRED WHILE ADDING USED CARS TOP MODELS SALES DATA.";
    // DELETE API
    public static final String SWAGGER_DELETE_API_BY_TOP_MODELS_TYPE_SUMMARY = "DELETE ALL - USED CARS TOP MODELS SALES DATA";
    public static final String SWAGGER_DELETE_API_BY_TOP_MODELS_TYPE_SUCCESS = "USED CARS TOP MODELS SALES DATA DELETED SUCCESSFULLY.";
    public static final String SWAGGER_DELETE_API_BY_TOP_MODELS_TYPE_FAILURE = "FAILURE OCCURRED WHILE DELETING USED CARS TOP MODELS SALES DATA.";

    // 4 - USED CARS TOP REGIONS SALES
    // GET API
    public static final String SWAGGER_GET_API_BY_TOP_REGIONS_TYPE_SUMMARY = "GET - USED CARS TOP REGIONS SALES DATA";
    public static final String SWAGGER_GET_API_BY_TOP_REGIONS_SUCCESS = "USED CARS TOP REGIONS SALES DATA FETCHED SUCCESSFULLY.";
    public static final String SWAGGER_GET_API_BY_TOP_REGIONS_NO_DATA_FOUND = "NO DATA FOUND FOR USED CARS TOP REGIONS SALES.";
    // POST API
    public static final String SWAGGER_POST_API_BY_TOP_REGIONS_TYPE_SUMMARY = "POST - ADD USED CARS TOP REGIONS SALES";
    public static final String SWAGGER_POST_API_BY_TOP_REGIONS_TYPE_SUCCESS = "USED CARS TOP REGIONS SALES DATA ADDED SUCCESSFULLY.";
    public static final String SWAGGER_POST_API_BY_TOP_REGIONS_TYPE_FAILURE = "FAILURE OCCURRED WHILE ADDING USED CARS TOP REGIONS SALES DATA.";
    // DELETE API
    public static final String SWAGGER_DELETE_API_BY_TOP_REGIONS_TYPE_SUMMARY = "DELETE ALL - USED CARS TOP REGIONS SALES DATA";
    public static final String SWAGGER_DELETE_API_BY_TOP_REGIONS_TYPE_SUCCESS = "USED CARS TOP REGIONS SALES DATA DELETED SUCCESSFULLY.";
    public static final String SWAGGER_DELETE_API_BY_TOP_REGIONS_TYPE_FAILURE = "FAILURE OCCURRED WHILE DELETING USED CARS TOP REGIONS SALES DATA.";


    // LOGGER CONSTANTS ---------------------------------------------------
    public static final String LOGGER_GET_API_SUCCESS = "UsedCarsSalesRestController : LOGGER : GET API : Data Fetch Success";
    public static final String LOGGER_GET_API_FAILURE = "UsedCarsSalesRestController : LOGGER : GET API : Data Fetch Failure";
    public static final String LOGGER_POST_API_SUCCESS = "UsedCarsSalesRestController : LOGGER : POST API : Data Adding Success";
    public static final String LOGGER_POST_API_FAILURE = "UsedCarsSalesRestController : LOGGER : POST API : Data Adding Failure";
    public static final String LOGGER_DELETE_API_SUCCESS = "UsedCarsSalesRestController : LOGGER : DELETE API : Data Deleting Success";

    public static final String LOGGER_GET_API_BY_TOP_COLORS_TYPE_SUCCESS = "UsedCarsSalesTopColorsRestController : LOGGER : GET API : Data Fetch Success";
    public static final String LOGGER_GET_API_BY_TOP_COLORS_TYPE_FAILURE = "UsedCarsSalesTopColorsRestController : LOGGER : GET API : Data Fetch Failure";
    public static final String LOGGER_POST_API_BY_TOP_COLORS_TYPE_SUCCESS = "UsedCarsSalesTopColorsRestController : LOGGER : POST API : Data Adding Success";
    public static final String LOGGER_POST_API_BY_TOP_COLORS_TYPE_FAILURE = "UsedCarsSalesTopColorsRestController : LOGGER : POST API : Data Adding Failure";
    public static final String LOGGER_DELETE_API_BY_TOP_COLORS_TYPE_SUCCESS = "UsedCarsSalesTopColorsRestController : LOGGER : DELETE API : Data Deleting Success";

    public static final String LOGGER_GET_API_BY_TOP_MODELS_TYPE_SUCCESS = "UsedCarsSalesTopModelsRestController : LOGGER : GET API : Data Fetch Success";
    public static final String LOGGER_GET_API_BY_TOP_MODELS_TYPE_FAILURE = "UsedCarsSalesTopModelsRestController : LOGGER : GET API : Data Fetch Failure";
    public static final String LOGGER_POST_API_BY_TOP_MODELS_TYPE_SUCCESS = "UsedCarsSalesTopModelsRestController : LOGGER : POST API : Data Adding Success";
    public static final String LOGGER_POST_API_BY_TOP_MODELS_TYPE_FAILURE = "UsedCarsSalesTopModelsRestController : LOGGER : POST API : Data Adding Failure";
    public static final String LOGGER_DELETE_API_BY_TOP_MODELS_TYPE_SUCCESS = "UsedCarsSalesTopModelsRestController : LOGGER : DELETE API : Data Deleting Success";

    public static final String LOGGER_GET_API_BY_TOP_REGIONS_TYPE_SUCCESS = "UsedCarsSalesTopRegionsRestController : LOGGER : GET API : Data Fetch Success";
    public static final String LOGGER_GET_API_BY_TOP_REGIONS_TYPE_FAILURE = "UsedCarsSalesTopRegionsRestController : LOGGER : GET API : Data Fetch Failure";
    public static final String LOGGER_POST_API_BY_TOP_REGIONS_TYPE_SUCCESS = "UsedCarsSalesTopRegionsRestController : LOGGER : POST API : Data Adding Success";
    public static final String LOGGER_POST_API_BY_TOP_REGIONS_TYPE_FAILURE = "UsedCarsSalesTopRegionsRestController : LOGGER : POST API : Data Adding Failure";
    public static final String LOGGER_DELETE_API_BY_TOP_REGIONS_TYPE_SUCCESS = "UsedCarsSalesTopRegionsRestController : LOGGER : DELETE API : Data Deleting Success";

}
