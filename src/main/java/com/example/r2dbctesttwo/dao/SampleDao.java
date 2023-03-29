package com.example.r2dbctesttwo.dao;

import com.example.r2dbctesttwo.dao.entity.Sample;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface SampleDao extends ReactiveCrudRepository<Sample, String> {
}
