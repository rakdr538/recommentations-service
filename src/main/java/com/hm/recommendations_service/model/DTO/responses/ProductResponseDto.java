package com.hm.recommendations_service.model.DTO.responses;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProductResponseDto {
    private String productName;
    private Float originalPrice;
    private Float discountedPrice;
    private Boolean inStock;
    private String description;
}
