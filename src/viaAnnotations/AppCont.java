package viaAnnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;


/**
 * Created by Olga Pavlova on 09/09/2015.
 */
@Configuration
@ImportResource(value = "resources/SpringConfig.xml")
public class AppCont {
    @Bean
    public LabRat rat(){
        LabRat rat = new LabRat("Hi!");
        rat.setName("Olga");
        return rat;
    }
}
