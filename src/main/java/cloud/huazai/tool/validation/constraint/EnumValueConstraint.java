package cloud.huazai.tool.validation.constraint;

import cloud.huazai.tool.basic.collection.CollectionUtils;
import cloud.huazai.tool.basic.lang.ReflectUtils;
import cloud.huazai.tool.validation.EnumValue;


import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.List;

/**
 * EnumValueConstraint
 *
 * @author HuaZai
 * @since 2024-02-24
 */
public class EnumValueConstraint implements ConstraintValidator<EnumValue,Object> {

    private Class<? extends Enum<?>> enumType;

	private String validationField;
	@Override
	public void initialize(EnumValue constraintAnnotation) {
		 this.enumType = constraintAnnotation.enumType();
		this.validationField = constraintAnnotation.field();
	}

	@Override
	public boolean isValid(Object value, ConstraintValidatorContext context) {

		if (null == value) {
			return true;
		}

		List<Object> fieldValueList = ReflectUtils.getFieldValueListByEnumClazzAndField(enumType, validationField);

		if (CollectionUtils.isEmpty(fieldValueList)) {
			return false;
		}

		return fieldValueList.contains(value);
	}
}
