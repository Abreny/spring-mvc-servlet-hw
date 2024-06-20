package pro.abned.tuto.spring.configs;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.ContextHierarchy;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import static org.assertj.core.api.Assertions.*;

@SpringJUnitWebConfig
@ContextHierarchy({
        @ContextConfiguration(classes = AppConfig.class),
        @ContextConfiguration(classes = WebConfig.class)
})
class WebConfigTest {
    @Autowired
    private WebApplicationContext webApplicationContext;

    @Autowired
    private RequestMappingHandlerMapping handlerMapping;

    @Autowired
    private RequestMappingHandlerAdapter handlerAdapter;

    @Test
    void testWebApplicationContext() {
        assertThat(webApplicationContext).isNotNull();
    }

    @Test
    void testHandlerMappingRegistration() {
        assertThat(handlerMapping).isNotNull();
    }

    @Test
    void testHandlerAdapterRegistration() {
        assertThat(handlerAdapter).isNotNull();
    }
}