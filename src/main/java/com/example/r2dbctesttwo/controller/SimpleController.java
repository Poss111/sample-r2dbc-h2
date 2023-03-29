package com.example.r2dbctesttwo.controller;

import com.example.r2dbctesttwo.dao.SampleDao;
import com.example.r2dbctesttwo.dao.entity.Sample;
import com.example.r2dbctesttwo.services.TestService;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController("/api")
@AllArgsConstructor
public class SimpleController {

    private final SampleDao sampleDao;

    @GetMapping(path = "/sample")
    public Mono<ResponseEntity<Sample>> getSamples() {
        return sampleDao.save(Sample.builder().build())
                .map(ResponseEntity::ok);
    }
}
