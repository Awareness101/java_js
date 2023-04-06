package handwrittencode.annotation;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

public class MyAnnotationTest {
    //注解中属性必须赋值，不然是会报错
    @AnnotationMy( value = RetentionPolicy.SOURCE,string = {"568","my annotation"})
    public void doSome(){


    }
}
