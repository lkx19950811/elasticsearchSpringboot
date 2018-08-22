package com.lkx.es.controller;

import com.lkx.es.common.BaseController;
import com.lkx.es.entity.City;
import com.lkx.es.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * 城市 Controller 实现 Restful HTTP 服务
 * <p>
 * Created by bysocket on 03/05/2017.
 */
@RequestMapping("/api/city")
@RestController
public class CityRestController extends BaseController {

    @Autowired
    private CityService cityService;

    @RequestMapping(value = "", method = RequestMethod.POST)
    public Long createCity(@RequestBody City city) {
        return cityService.saveCity(city);
    }

    @RequestMapping(value = "/search", method = RequestMethod.GET)
    public List<City> searchCity(Pageable pageable,
                                 @RequestParam(value = "content") String searchContent) {
        return cityService.searchCity(pageable,searchContent);
    }
    @RequestMapping(value = "/getOne",method = RequestMethod.GET)
    public City getOne(Long id){
        return cityService.getOne(id);
    }
}