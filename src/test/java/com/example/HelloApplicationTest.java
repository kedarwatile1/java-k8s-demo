
package com.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class HelloApplicationTest {

    @Test
    void shouldReturnHelloMessage() {
        assertEquals(
            "Hello from Java CI/CD on Kubernetes! and my name is kedar",
            HelloApplication.message()
        );
    }
}

