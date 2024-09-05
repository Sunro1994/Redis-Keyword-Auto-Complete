package com.auto_complete.test01.global.config;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("api/v1/dog")
@RequiredArgsConstructor
@Slf4j
public class DogController {

    private final DogService dogService;

    @GetMapping("/{keyword}")
    public void cut(
            @PathVariable("keyword") String keyword
    ) {
        log.info("keyword={}", keyword);
        List<String> autocorrect = dogService.autocorrect(keyword);

        log.info("관련 검색어 = {}", autocorrect);
    }
}
