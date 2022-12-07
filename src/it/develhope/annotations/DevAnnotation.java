package it.develhope.annotations;

import java.lang.annotation.*;

@Documented
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)

public @interface DevAnnotation {

    String DevName();
    String DevSurname();

}
