package com.mattressrun.core.service.mapper;

import com.mattressrun.core.model.dto.HotelStayDto;
import com.mattressrun.core.model.entity.HotelStayEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Slf4j
@Component
@RequiredArgsConstructor
public class HotelStayMapper {

    public HotelStayEntity toHotelStayEntity(HotelStayDto hotelStayDto) {
        return HotelStayEntity.builder()
                .id(hotelStayDto.getId())
                .name(hotelStayDto.getName())
                .startDate(hotelStayDto.getStartDate())
                .endDate(hotelStayDto.getEndDate())
                .sourceOfBooking(hotelStayDto.getSourceOfBooking())
                .pointsEarned(hotelStayDto.getPointsEarned())
                .pricePerNight(hotelStayDto.getPricePerNight())
                .currency(hotelStayDto.getCurrency())
                .amount(hotelStayDto.getAmount())
                .hotelId(hotelStayDto.getHotelId())
                .build();
    }

    public HotelStayDto toHotelStayDto(HotelStayEntity hotelStayEntity) {
        return HotelStayDto.builder()
                .id(hotelStayEntity.getId())
                .hotelId(hotelStayEntity.getHotelId())
                .amount(hotelStayEntity.getAmount())
                .currency(hotelStayEntity.getCurrency())
                .endDate(hotelStayEntity.getEndDate())
                .startDate(hotelStayEntity.getStartDate())
                .name(hotelStayEntity.getName())
                .pointsEarned(hotelStayEntity.getPointsEarned())
                .pricePerNight(hotelStayEntity.getPricePerNight())
                .sourceOfBooking(hotelStayEntity.getSourceOfBooking())
                .build();
    }
}
