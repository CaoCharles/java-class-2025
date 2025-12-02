package practices;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface DataInit {
    // Retention 為 RUNTIME, Target 為 METHOD
    // 補充：
    //@Retention(RetentionPolicy.RUNTIME)：讓 Annotation 在「程式執行時」還能被反射 (getAnnotation) 看到。
    //@Target(...)：限制這個 Annotation 可以用在哪裡（類別 / 欄位 / 方法）。
}
