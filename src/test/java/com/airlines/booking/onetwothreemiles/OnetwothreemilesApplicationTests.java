package com.airlines.booking.onetwothreemiles;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OnetwothreemilesApplicationTests {

    @Test
    void contextLoads() {
        String expectedString = "Meow";
        assertEquals(expectedString, "Meow");
    }
}
