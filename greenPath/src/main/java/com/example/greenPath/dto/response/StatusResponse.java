package com.example.greenPath.dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StatusResponse {

    private Long id;
    private String message;
    private LocalDate timestamp;

}

