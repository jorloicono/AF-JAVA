package com.example.seccion3;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assumptions.assumeTrue;
import static org.junit.jupiter.api.Assumptions.assumingThat;

public class EAssumptionsTest2 {
    @Test
    void testInAllEnvironments() {
        assumingThat("LINUX".equals(System.getenv("OS")),
                () -> {
                    // perform these assertions only on the DEV server
                    assertEquals(2, 4);
                });
        // perform these assertions in all environments
        assertEquals(42, 42);
    }
}
