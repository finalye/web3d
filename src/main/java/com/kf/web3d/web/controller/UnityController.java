package com.kf.web3d.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by ye on 2018/12/3.
 */
@Controller
@RequestMapping(value = "/unity")
public class UnityController {

    @RequestMapping(value = "/index")
    public String index(){
        return "unity/index";
    }
}
