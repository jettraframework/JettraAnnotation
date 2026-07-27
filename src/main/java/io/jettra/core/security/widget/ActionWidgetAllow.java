package io.jettra.core.security.widget;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Controla el acceso y la ejecución de eventos específicos dentro de los componentes.
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.TYPE})
public @interface ActionWidgetAllow {
    String[] role() default {};
    String department() default "";
}
