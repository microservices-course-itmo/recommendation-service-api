package com.wine.to.up.recommendation.service.api.recommendation.vo;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * @version 1.1
 * @author Roman
 */
@Getter
@Builder(builderClassName = "Builder")
public final class RecommendationResponse {
    /**
     * recommendedIds is a list of ids
     */
    private final List<Long> recommendedIds;
}