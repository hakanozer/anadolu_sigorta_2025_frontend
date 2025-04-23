package com.works.entities.dto;

import com.works.entities.Product;
import jakarta.validation.constraints.*;
import lombok.Value;

import java.io.Serializable;

/**
 * DTO for {@link Product}
 */
@Value
public class ProductSaveDto implements Serializable {
    @NotNull
    @Size(min = 2, max = 150)
    @NotEmpty
    String title;
    @NotNull
    @Min(2)
    @Max(1000000)
    Integer price;
}