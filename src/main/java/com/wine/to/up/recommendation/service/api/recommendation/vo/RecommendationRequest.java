package com.wine.to.up.recommendation.service.api.recommendation.vo;

import lombok.Builder;
import lombok.Getter;

/**
 * @version 1.1
 * @author Alexander
 */
@Getter
@Builder(builderClassName = "Builder")
public final class RecommendationRequest {
    /**
     * id is an id of a current request
     */
    private final Long id;
}