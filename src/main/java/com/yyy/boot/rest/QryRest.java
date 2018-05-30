package com.yyy.boot.rest;

import com.yyy.boot.po.ConfigPO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinyiyun
 * @date 2018/5/28 10:17
 */
@RestController
@EnableAutoConfiguration
@RequestMapping("/qry")
public class QryRest {

    @Autowired
    private ConfigPO configPO;

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    public void get() {
        System.out.println(configPO.getCount());
        System.out.println(configPO.getConnections());
    }

}
