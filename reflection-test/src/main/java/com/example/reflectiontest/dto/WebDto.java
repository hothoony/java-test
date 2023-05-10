package com.example.reflectiontest.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString(callSuper = true)
public class WebDto extends BaseDto {
    
    private Integer page;
    private Integer size;
}
