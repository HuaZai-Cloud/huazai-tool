package cloud.huazai.tool.validation;


import java.lang.annotation.*;



/**
 * StrDate
 *
 * @author HuaZai
 * @since 2024-01-15
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
// @Constraint(validatedBy = StringDateConstraint.class)
public @interface StringDate {

	String dateFormat();

	String message() default "日期格式错误";

	Class<?>[] groups() default {};

	// Class<? extends Payload>[] payload() default {};



}
