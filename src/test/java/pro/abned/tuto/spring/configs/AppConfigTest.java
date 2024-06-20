package pro.abned.tuto.spring.configs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import static org.assertj.core.api.Assertions.*;

@SpringJUnitConfig(classes = AppConfig.class)
class AppConfigTest {

    @Autowired
    ApplicationContext applicationContext;

    @Test
    void testAppContext() {
        assertThat(applicationContext).isNotNull();
    }
}