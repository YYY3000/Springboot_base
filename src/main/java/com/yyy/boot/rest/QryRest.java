package com.yyy.boot.rest;

import com.yyy.boot.po.ConfigPO;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author yinyiyun
 * @date 2018/5/28 10:17
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/test")
public class QryRest {

    @Resource
    private ConfigPO configPO;

    @RequestMapping(method = RequestMethod.GET)
    public Object get() {
        System.out.println(configPO.getCount());
        System.out.println(configPO.getConnections());
        return configPO;
    }

}
