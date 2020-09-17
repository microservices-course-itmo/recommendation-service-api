package com.wine.to.up.notification.service.api.configuration;

import com.wine.to.up.notification.service.api.NotificationServiceApiProperties;
import com.wine.to.up.notification.service.api.feign.NotificationServiceClient;
import feign.Feign;
import feign.gson.GsonDecoder;
import feign.gson.GsonEncoder;
import feign.okhttp.OkHttpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Feign client for accessing notification service
 */
@SuppressWarnings("SpringFacetCodeInspection")
@Configuration
@RequiredArgsConstructor
public class NotificationServiceFeignConfiguration {
    private final NotificationServiceApiProperties notificationServiceApiProperties;

    /**
     * Configured feign client
     */
    @Bean
    public NotificationServiceClient getKafkaServiceClient() {
        return Feign.builder()
                .encoder(new GsonEncoder())
                .decoder(new GsonDecoder())
                .client(new OkHttpClient())
                .target(NotificationServiceClient.class, "http://" + notificationServiceApiProperties.getHost());
    }
}
