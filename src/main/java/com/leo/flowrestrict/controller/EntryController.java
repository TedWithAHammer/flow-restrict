package com.leo.flowrestrict.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.leo.flowrestrict.Response.RestBaseResp;
import com.leo.flowrestrict.Response.RestResp;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by leo on 2020/7/20.
 * Description:
 */
@RestController
@Slf4j
public class EntryController {
    @GetMapping("/counter")
    public RestBaseResp restrictCounter() {
        return new RestResp<>("Counter Test Success");
    }


}
