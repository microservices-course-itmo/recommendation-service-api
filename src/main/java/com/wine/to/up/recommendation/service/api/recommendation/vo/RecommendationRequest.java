package com.wine.to.up.recommendation.service.api.recommendation.vo;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderClassName = "Builder")
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public final class RecommendationRequest {
    private final Long id;

    public static final class Builder {
        private Builder(){}
    }
}