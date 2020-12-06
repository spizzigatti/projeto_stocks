//==============================//
//====                      ====//
//====    Projeto Stocks    ====//
//====         TEST         ====//
//====                      ====//
//==============================//

package com.stocks.api_rest.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/status")
public class StatusController {
    @GetMapping
    public String status(){
        return "<strong>OnLine</strong>";
    }
}
