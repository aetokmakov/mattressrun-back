package com.mattressrun.core.repository;

import com.mattressrun.core.model.entity.HotelStayEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HotelStayRepository extends CrudRepository<HotelStayEntity, String> {
}
