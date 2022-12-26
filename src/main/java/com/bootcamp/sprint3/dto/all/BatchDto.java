package com.bootcamp.sprint3.dto.all;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.time.LocalDateTime;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BatchDto {
    @NotNull(message = "batchNumber must be not null")
    private Integer batchNumber;
    @NotNull(message = "productId must be not null")
    private Integer productId;
    private Double currentTemperature;
    private Double minimumTemperature;
    @NotNull(message = "initialQuantity must be not null")
    @Size(min = 1, max = 100,message = "initialQuantity must be greater than 1 and less or equal than 100")
    private Integer initialQuantity;
    @NotNull(message = "currentQuantity must be not null")
    @Size(min = 1, max = 100,message = "initialQuantity must be greater than 1 and less or equal than 100")
    private Integer currentQuantity;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate manufacturingDate;
    @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
    private LocalDateTime manufacturingTime;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate dueDate;
}
