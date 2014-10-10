import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 6/18/14  4:28 PM
 * Created by JustinZhang.
 */
public @interface Uniqueness {
    Constraints constraints() default @Constraints(unique = true);
}
