package com.example.seccion3;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assumptions.*;


public class CAssumptionsTest {


    @BeforeAll
    static void beforeAll() {
        System.getenv().forEach(
                (key, value) -> System.out.println(key + " - " + value)
        );

        System.getProperties().forEach(
                (key, value) -> System.out.println(key + " - " + value)
        );
    }

    @Test
    void name() {
        String jdk = System.getProperty("java.home");
        assumeFalse(jdk.contains("11"));
        assumeTrue(jdk.contains("16.0.2"));

        System.out.println("El test continua");
    }


}
