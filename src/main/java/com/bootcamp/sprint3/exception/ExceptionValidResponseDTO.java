package com.bootcamp.sprint3.exception;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class ExceptionValidResponseDTO {
    private List<String> messages;
    private int status;
    @JsonFormat(pattern = "dd-MM-yyyy")
    private LocalDate timeStamp;
}
