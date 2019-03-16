package com.codementor.coderetreat201903;

import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.emptyString;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

class FirstTest {

    @Test
    void failing() {
        var coderetreat = "";
        assertThat(coderetreat, is(not(emptyString())));
    }
}
