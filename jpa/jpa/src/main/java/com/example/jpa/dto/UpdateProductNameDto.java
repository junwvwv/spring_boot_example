package com.example.jpa.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class UpdateProductNameDto {

    private Long id;
    private String name;

}
