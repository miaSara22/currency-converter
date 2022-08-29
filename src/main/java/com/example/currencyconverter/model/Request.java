package com.example.currencyconverter.model;

import lombok.Data;

@Data
public class Request {

    private String from;
    private String to;
    private long amount;


}
