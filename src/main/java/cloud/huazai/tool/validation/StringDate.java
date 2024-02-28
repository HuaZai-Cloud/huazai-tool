package cloud.huazai.tool.validation;

import cloud.huazai.tool.validation.constraint.EnumValueConstraint;
import cloud.huazai.tool.validation.constraint.StringDateConstraint;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.TYPE_USE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * StrDate
 *
 * @author Di Wu
 * @since 2024-01-15
 */
// @Retention(RetentionPolicy.RUNTIME)
// @Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.PARAMETER, ElementType.FIELD})
@Constraint(validatedBy = StringDateConstraint.class)
public @interface StringDate {

	String dateFormat();

	String message() default "日期格式错误";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};



}
