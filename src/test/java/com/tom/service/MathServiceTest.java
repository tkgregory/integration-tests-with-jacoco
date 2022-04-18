package com.tom.service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class MathServiceTest {
    private MathService mathService;

    @BeforeEach
    public void setUp() {
        mathService = new MathService();
    }

    @Test
    public void multipliesNumbers() {
        int result = mathService.multiply(2, 4);

        assertThat(result, equalTo(8));
    }

    @Test
    public void subtractNumbers() {
        int result = mathService.subtract(5, 3);

        assertThat(result, equalTo(2));
    }
}
