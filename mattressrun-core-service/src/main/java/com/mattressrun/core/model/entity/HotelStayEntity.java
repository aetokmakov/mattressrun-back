package com.mattressrun.core.model.entity;

import com.mattressrun.core.model.enums.SourceOfBooking;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import javax.money.CurrencyUnit;
import java.math.BigDecimal;
import java.time.LocalDate;

@Table("hotel_stay")
@Data
@Builder
public class HotelStayEntity {
    @Id
    private String id;
    private String name;
    private LocalDate startDate;
    private LocalDate endDate;
    private SourceOfBooking sourceOfBooking;
    private BigDecimal pointsEarned;
    private BigDecimal priceForStay;
    private CurrencyUnit currencyUnit;
    private BigDecimal monetaryAmount;
    private String hotelId;
}
