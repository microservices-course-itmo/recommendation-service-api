package com.wine.to.up.notification.service.api;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/**
 * Defines values from properties. Can be autowired as a regular class
 */
@SuppressWarnings("SpringPropertySource")
@PropertySources({
        @PropertySource("classpath:application-notification-service-api.properties"),
        @PropertySource("classpath:application-notification-service-api-${spring.profiles.active:local}.properties")
})
@ConfigurationProperties(prefix = "notification.service.api")
@Setter
@Component
@Getter
public class NotificationServiceApiProperties {
    private String messageSentEventsTopicName;
    private String host;
}
