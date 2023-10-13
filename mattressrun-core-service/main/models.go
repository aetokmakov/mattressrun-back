package main

type hotelChain struct {
	Name string `json:"name"`
	Link string `json:"link"`
}

type hotel struct {
	ID         string     `json:"id"`
	Name       string     `json:"name"`
	Address    string     `json:"address"`
	Country    string     `json:"country"`
	Brand      string     `json:"brand"`
	HotelChain hotelChain `json:"hotelChain"`
}
