package viaAnnotations;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import persistence.data.TESTTABLE;
import persistence.services.IMyEntityService;

/**
 * Made by descriprion: http://samolisov.blogspot.de/2009/06/hibernate-spring.html
 */
public class MainAnnot {


    public static void main(String []args) {
//clear spring
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppCont.class);
        LabRat rat = context.getBean(LabRat.class);
        rat.sayHi();
        System.out.println(rat.getName());

//+persistence
        IMyEntityService service = (IMyEntityService) context.getBean("entityService");
        TESTTABLE entity = new TESTTABLE();
        System.out.println("getFirstname = " + entity.getFirstname() );
        service.saveEntity(entity);
    }


}
