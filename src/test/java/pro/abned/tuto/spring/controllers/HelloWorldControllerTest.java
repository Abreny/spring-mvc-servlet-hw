package pro.abned.tuto.spring.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class HelloWorldControllerTest {
    private HelloWorldController helloWorldController;

    @BeforeEach
    void setUp() {
        helloWorldController = new HelloWorldController();
    }

    @Test
    void testHelloWorld() {
        var result = helloWorldController.hello();
        assertThat(result).isEqualTo("Hello world!");
    }

    @Test
    void testHelloWorldDto() {
        var result = helloWorldController.helloDto();
        assertThat(result).isNotNull();
        assertThat(result.data()).isEqualTo("Hello world!");
    }
}
