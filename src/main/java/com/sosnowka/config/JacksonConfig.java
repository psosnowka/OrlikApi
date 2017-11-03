package com.sosnowka.config;

import com.fasterxml.jackson.databind.SerializationFeature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;

/**
 * Created by Pawel on 03.10.2017.
 */
//@Configuration
public class JacksonConfig {
    //@Bean
    public Jackson2ObjectMapperBuilder jacksonBuilder(){
        Jackson2ObjectMapperBuilder builder = new Jackson2ObjectMapperBuilder();
        builder.featuresToEnable(SerializationFeature.WRAP_ROOT_VALUE); // enables wrapping for root elements
        return builder;
    }
}
