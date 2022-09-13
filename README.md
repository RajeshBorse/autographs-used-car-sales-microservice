# University of Leicester - Masters Project

Autographs is an application designed and developed as a part of an academic project for the year 2021/22. This is designed and developed by Rajesh Borse (rsb34)

## Requirements
As per the project requirements, we are expected to display the cloud-based data in the form of charts to android mobile users.

## Microservice

Autographs Used Car Sales Microservice - This is a spring-boot java microservice which has RESTful APIs which will be used by the android mobile application for displaying the charts in the frontend systems based on the service response.

Below are the services that this microservice serves.

- Used Car Sales.
- Used Car Sales by Top Colors.
- Used Car Sales by Top Models.
- Used Car Sales by Top Regions.


Below are the endpoints that are exposed by this microservice.

## Used Car Sales

- GET API Endpoint - Used for fetching all the Used Car Sales data from the MongoDB database.


```bash
/api/v1/usedCarSales/getAllUsedCarSalesData
```


- POST API Endpoint - Used for inserting all the Used Car Sales data in the MongoDB database.

```bash
/api/v1/usedCarSales/addUsedCarSalesData
```


- DELETE API Endpoint - Used for deleting all the Used Car Saless in the MongoDB database.
```bash
/api/v1/usedCarSales/deleteAllUsedCarSalesData
```


## Used Car Sales by Top Colors

- GET API Endpoint - Used for fetching all the Used Car Sales by Top Colors data from the MongoDB database.

```bash
/api/v1/usedCarSales/getAllUsedCarSalesTopColorsData
```

- POST API Endpoint - Used for inserting all the Used Car Sales by Top Colors data in the MongoDB database.

```bash
/api/v1/usedCarSales/addUsedCarSalesTopColorsData
```

- DELETE API Endpoint - Used for deleting all the Used Car Sales by Top Colors data in the MongoDB database.
```bash
/api/v1/usedCarSales/deleteAllUsedCarSalesTopColorsData
```

## Used Car Sales by Top Models
- GET API Endpoint - Used for fetching all the Used Car Sales by Top Models data from the MongoDB database.

```bash
/api/v1/usedCarSales/getAllUsedCarSalesTopModelsData
```

- POST API Endpoint - Used for inserting all the Used Car Sales by Top Models data in the MongoDB database.

```bash
/api/v1/usedCarSales/addUsedCarSalesTopModelsData
```

- DELETE API Endpoint - Used for deleting all the Used Car Sales by Top Models data in the MongoDB database.
```bash
/api/v1/usedCarSales/deleteAllUsedCarSalesTopModelData
```

## Used Car Sales by Top Regions
- GET API Endpoint - Used for fetching all the Used Car Sales by Top Regions data from the MongoDB database.

```bash
/api/v1/usedCarSales/getAllUsedCarSalesTopRegionsData
```

- POST API Endpoint - Used for inserting all the Used Car Sales by Top Regions data in the MongoDB database.

```bash
/api/v1/usedCarSales/addUsedCarSalesTopRegionsData
```

- DELETE API Endpoint - Used for deleting all the Used Car Sales by Top Regions data in the MongoDB database.
```bash
/api/v1/usedCarSales/deleteAllUsedCarSalesTopRegionsData
