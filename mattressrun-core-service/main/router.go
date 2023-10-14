package main

import (
	"github.com/gin-gonic/gin"
	"log"
	"net/http"
)

func initiate() {
	router := gin.Default()

	router.GET("/hotels", getHotels)
	router.GET("hotels/:id", getHotelById)
	router.POST("/hotel", createHotel)
	router.Run("localhost:9090")
}

func getHotels(c *gin.Context) {
	log.Print("Entered getHotels handler")

	c.IndentedJSON(http.StatusOK, hotels)

	log.Print("Finished execution of getHotels handler")
}

func getHotelById(c *gin.Context) {
	id := c.Param("id")
	for _, hotel := range hotels {
		if hotel.ID == id {
			c.IndentedJSON(http.StatusOK, hotel)
			return
		}
	}

	c.IndentedJSON(http.StatusNotFound, gin.H{"message": "Hotel not found with passed Id!"})
}

func createHotel(c *gin.Context) {
	var newHotel hotel
	err := c.BindJSON(&newHotel)
	if err != nil {
		return
	}
	hotels = append(hotels, newHotel)
	c.IndentedJSON(http.StatusCreated, newHotel)
}
