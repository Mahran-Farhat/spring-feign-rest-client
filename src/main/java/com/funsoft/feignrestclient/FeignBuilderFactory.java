package com.funsoft.feignrestclient;

import feign.Feign;
import feign.jackson.JacksonDecoder;
import feign.jackson.JacksonEncoder;
import feign.okhttp.OkHttpClient;
import feign.slf4j.Slf4jLogger;

public class FeignBuilderFactory {

    public static <T> T createClient(Class<T> type, String url) {
        return Feign.builder()
                .client(new OkHttpClient())
                .encoder(new JacksonEncoder())
                .decoder(new JacksonDecoder())
                .logger(new Slf4jLogger(type))
                .logLevel(feign.Logger.Level.FULL)
                .target(type, url);
    }

}
