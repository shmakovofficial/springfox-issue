package com.example.demo;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {

    @ApiOperation(value = "getInt", httpMethod = "POST")
    @RequestMapping("/getInt")
    public int getInt() {
        return 0;
    }

}
