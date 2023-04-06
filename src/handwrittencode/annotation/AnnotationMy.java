package handwrittencode.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value = {ElementType.METHOD,ElementType.FIELD})//可以 出现在那些位置
@Retention( RetentionPolicy.RUNTIME) //这个注解表示注解只会在源文件中出现，retention的汉语意思是保持。
public @interface AnnotationMy {
    //属性,看着像一个方法，实际上是属性
    RetentionPolicy value();
    int face() default 1;
    String[] string ();

}
