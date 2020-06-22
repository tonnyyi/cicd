package com.example.cicd;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
class CicdApplicationTests {

    @Autowired
    private IndexService indexService;

    @Test
    void add() {
        int result = indexService.add(1, 12);
        assertThat(result).isEqualTo(13);
    }

}
