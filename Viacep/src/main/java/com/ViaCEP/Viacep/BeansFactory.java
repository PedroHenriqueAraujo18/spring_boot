package com.ViaCEP.Viacep;

import com.google.gson.Gson;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansFactory {
    @Bean
    public Gson gson(){
        return new Gson();
    }
}
