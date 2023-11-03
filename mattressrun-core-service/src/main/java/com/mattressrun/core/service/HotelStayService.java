package com.mattressrun.core.service;

import com.mattressrun.core.model.dto.HotelStayDto;
import com.mattressrun.core.repository.HotelStayRepository;
import com.mattressrun.core.service.mapper.HotelStayMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Slf4j
@Service
public class HotelStayService {

    private final HotelStayRepository hotelStayRepository;
    private final HotelStayMapper hotelStayMapper;

    public void createHotelStay(HotelStayDto hotelStayDto) {
        var hotelStayEntity = hotelStayMapper.toHotelStayEntity(hotelStayDto);
        hotelStayRepository.save(hotelStayEntity);
    }
}
