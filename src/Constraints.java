import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 6/18/14  4:09 PM
 * Created by JustinZhang.
 */
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Constraints {
    public boolean primaryKey() default false;
    public boolean allowNull() default true;
    public boolean unique() default false;
}
