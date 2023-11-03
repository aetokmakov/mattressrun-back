package com.mattressrun.core.model.entity;

import com.mattressrun.core.model.enums.HotelChain;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("hotel")
@Data
public class HotelEntity {
    @Id
    private String id;
    private String name;
    private double geoLatitude;
    private double geoLongitude;
    private HotelChain hotelChain;
    private String city;
    private String address;
    private String country;
}
