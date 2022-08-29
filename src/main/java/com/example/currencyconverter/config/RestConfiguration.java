package com.example.currencyconverter.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "rest")
@Data
public class RestConfiguration {

    private String baseUrl;

}
