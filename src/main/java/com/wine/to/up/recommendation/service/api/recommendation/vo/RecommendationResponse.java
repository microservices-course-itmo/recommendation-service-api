package com.wine.to.up.recommendation.service.api.recommendation.vo;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder(builderClassName = "Builder")
public final class RecommendationResponse {
    private final Long id;
}