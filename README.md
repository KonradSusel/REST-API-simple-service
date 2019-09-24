# REST-API-simple-service
This REST API was created with Spring Boot Initializer. There is one model - Customer. CustomerController class 
provides support for POST and GET requests. CustomerRepository class is used by Spring to store objects. It has private
field repository which is a Map with Customer objects.
Requests can be sent using Postman app or HAL Browser at address http://localhost:8080/

JSON body example for POST request:
{
	"id": 1,
	"name": "Jan",
	"address": {
			"street" : "Street Name", 
			"zipCode" : "30-300",
			"city" : "Krakow"
		}
}