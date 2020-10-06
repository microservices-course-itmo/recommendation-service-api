package com.wine.to.up.recommendation.service.api.recommendation.vo;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder(builderClassName = "Builder")
public final class RecommendationResponse {
    private final List<Long> recommendedIds;
}