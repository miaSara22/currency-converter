package com.example.currencyconverter.controller;

import com.example.currencyconverter.model.Request;
import com.example.currencyconverter.model.Result;
import com.example.currencyconverter.service.CurrencyConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;


@RestController
@RequestMapping(path = "/api/currency")
public class CurrencyConverterController {

    @Autowired
    private CurrencyConverterService service;

    @PostMapping("/convert")
    public Mono<Result> getCurrency(@RequestBody Request request) {
        return service.getCurrency(request);
    }

}
