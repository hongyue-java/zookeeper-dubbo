package com.jaycekon.dubbo.service;

import com.alibaba.dubbo.config.annotation.Reference;
import com.jaycekon.dubbo.domain.City;
import com.jaycekon.dubbo.domain.User;
import org.springframework.stereotype.Component;

/**
 * 城市 Dubbo 服务消费者
 * <p>
 * Created by Jaycekon on 20/09/2017.
 */
@Component
public class CityDubboConsumerService {

    @Reference
    CityDubboService cityDubboService;

    @Reference
    UserService userService;

    public City printCity() {
        return cityDubboService.findCityByName();
    }


    public User saveUser() {
        return userService.saveUser();
    }
}
