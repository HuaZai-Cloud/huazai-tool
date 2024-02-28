package cloud.huazai.tool.validation;

import cloud.huazai.tool.validation.constraint.EnumValueConstraint;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * EnumValue
 *
 * @author Di Wu
 * @since 2024-02-24
 */
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = EnumValueConstraint.class)
public @interface EnumValue {

	Class<? extends Enum<?>> enumType();

	String field();


	String message() default "枚举值错误";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};
}