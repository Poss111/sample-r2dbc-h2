package com.example.r2dbctesttwo.services;

import com.example.r2dbctesttwo.dao.SampleDao;
import com.example.r2dbctesttwo.dao.entity.Sample;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;
import java.util.List;

@Service
@Slf4j
@AllArgsConstructor
public class TestService {

    private final SampleDao sampleDao;

//    @PostConstruct
//    void run() {
//        List<Sample> block = sampleDao.findAll().collectList().block();
//        log.info("item {}", block);
//        sampleDao.save(Sample.builder().id("Value").build())
//                .block(Duration.of(10, ChronoUnit.SECONDS));
//      log.info("Ran!");
//    }
}
