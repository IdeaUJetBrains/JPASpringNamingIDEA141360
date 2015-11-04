
import org.hibernate.engine.spi.PersistenceContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.PropertySource;

import javax.resource.spi.work.SecurityContext;

@Configuration
@Import({ PersistenceContext.class, SecurityContext.class})
public class ExampleApplicationContext {
    /**
     * These static classes are required because it makes it possible to use
     * different properties files for every Spring profile.
     * <p/>
     * See: <a href="http://stackoverflow.com/a/14167357/313554">This StackOverflow answer</a> for more details.
     */

    @Configuration
    @PropertySource("classpath:resources/application.properties")
    static class ApplicationProperties {
    }
}