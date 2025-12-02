package practices;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface DataElement {
    //   Retention 為 RUNTIME, Target 為 FIELD,
    //   設定資料名稱為 key, 型態為 String, 預設值為 ""
    String key() default "";
}
