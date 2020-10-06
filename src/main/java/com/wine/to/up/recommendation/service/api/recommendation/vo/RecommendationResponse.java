package com.wine.to.up.recommendation.service.api.recommendation.vo;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * @version 0.3.1
 * @author Vladimir Vovk
 */
@Getter
@Builder(builderClassName = "Builder")
public final class RecommendationResponse {
    /**
     * recommendedIds is a list of ids
     */
    private final List<Long> recommendedIds;
}