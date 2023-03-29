package com.example.r2dbctesttwo.dao.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

@Data
@Builder
public class Sample {

    @Id
    private Long id;

}
