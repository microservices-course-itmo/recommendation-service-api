package com.wine.to.up.recommendation.service.api.configuration;

import com.wine.to.up.recommendation.service.api.RecommendationServiceApiProperties;
import com.wine.to.up.recommendation.service.api.feign.RecommendationServiceClient;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Feign client for accessing recommendation service
 */
@SuppressWarnings("SpringFacetCodeInspection")
@Configuration
@RequiredArgsConstructor
public class RecommendationServiceFeignConfiguration {
    private final RecommendationServiceApiProperties recommendationServiceApiProperties;

    /**
     * Configured feign client
     */
    @Bean
    public RecommendationServiceClient getKafkaServiceClient() {
        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .client(new OkHttpClient())
                .target(RecommendationServiceClient.class, "http://" + recommendationServiceApiProperties.getHost());
    }
}
