package com.shuang.commons.multi.jpa.scanpackage.dao.second;

import com.shuang.commons.multi.jpa.scanpackage.model.City;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * City Repository
 */
public interface CityRepository extends JpaRepository<City, Integer> {
}
