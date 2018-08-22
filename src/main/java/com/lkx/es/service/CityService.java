package com.lkx.es.service;

import com.lkx.es.entity.City;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface CityService {

    /**
     * 新增城市信息
     *
     * @param city
     * @return
     */
    Long saveCity(City city);

    /**
     * 根据关键词，function score query 权重分分页查询
     *
     * @param searchContent
     * @return
     */
    List<City> searchCity(Pageable pageable, String searchContent);

    City getOne(Long id);
}