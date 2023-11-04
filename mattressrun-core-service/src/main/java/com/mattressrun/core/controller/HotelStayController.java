package com.mattressrun.core.controller;

import com.mattressrun.core.model.dto.HotelStayDto;
import com.mattressrun.core.service.HotelStayService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Component
@RequiredArgsConstructor
@RestController
@RequestMapping(path = "/api/v1/hotel-stay")
public class HotelStayController {

    private final HotelStayService hotelStayService;

    @PostMapping
    public void createHotelStay(@RequestBody HotelStayDto hotelStayDto) {
        hotelStayService.createHotelStay(hotelStayDto);
    }
}
