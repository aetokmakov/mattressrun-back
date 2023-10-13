package main

var hilton = hotelChain{
	Name: "Hilton",
	Link: "http://www.hilton.com",
}

var accor = hotelChain{
	Name: "Accor",
	Link: "http://www.accor.com",
}

var hotels = []hotel{
	{ID: "1", Name: "Hilton Garden Inn Mall of Emirates", Address: "Dubai, Mall of Emirates", Country: "UAE", Brand: "Hilton Garden Inn", HotelChain: hilton},
	{ID: "2", Name: "Hilton Orchard", Address: "Orchard road, Singapore", Country: "Singapore", Brand: "Hilton", HotelChain: hilton},
	{ID: "3", Name: "Novotel Al Bustan", Address: "Abu Dhabi, Al Bustan", Country: "UAE", Brand: "Novotel", HotelChain: accor},
}

func main() {
	initiate()
}
