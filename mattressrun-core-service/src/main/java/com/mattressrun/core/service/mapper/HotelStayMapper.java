package com.mattressrun.core.service.mapper;

import com.mattressrun.core.model.dto.HotelStayDto;
import com.mattressrun.core.model.entity.HotelStayEntity;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.javamoney.moneta.CurrencyUnitBuilder;
import org.springframework.stereotype.Component;

import javax.money.CurrencyUnit;

@Slf4j
@Component
@RequiredArgsConstructor
public class HotelStayMapper {

    public HotelStayEntity toHotelStayEntity(HotelStayDto hotelStayDto) {
        CurrencyUnit currencyUnit = CurrencyUnitBuilder.of(hotelStayDto.getCurrency(), "currency context").build();
        return HotelStayEntity.builder()
                .name(hotelStayDto.getName())
                .startDate(hotelStayDto.getStartDate())
                .endDate(hotelStayDto.getEndDate())
                .sourceOfBooking(hotelStayDto.getSourceOfBooking())
                .pointsEarned(hotelStayDto.getPointsEarned())
                .priceForStay(hotelStayDto.getPricePerNight())
                .currencyUnit(currencyUnit)
                .monetaryAmount(hotelStayDto.getAmount())
                .hotelId(hotelStayDto.getHotelId())
                .build();
    }
}
