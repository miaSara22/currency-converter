package com.example.currencyconverter.service;


import com.example.currencyconverter.config.RestConfiguration;
import com.example.currencyconverter.model.Request;
import com.example.currencyconverter.model.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class CurrencyConverterService {

    @Autowired
    private RestConfiguration configuration;

    @Autowired
    private WebClient webClient;

    public Mono<Result> getCurrency (Request request) {

       return webClient
               .method(HttpMethod.GET)
               .uri(configuration.getBaseUrl() + "from=" + request.getFrom() + "&to=" + request.getTo() + "&amount=" + request.getAmount())
               .body(Mono.just(request), Request.class)
               .retrieve()
               .bodyToMono(Result.class);

    }


}
