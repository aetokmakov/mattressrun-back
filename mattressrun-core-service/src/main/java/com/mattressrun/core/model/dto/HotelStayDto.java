package com.mattressrun.core.model.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.mattressrun.core.model.enums.SourceOfBooking;
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
public class HotelStayDto {
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private SourceOfBooking sourceOfBooking;
    private BigDecimal pointsEarned;
    private BigDecimal pricePerNight;
    private String currency;
    private BigDecimal amount;
    private String hotelId;
}
