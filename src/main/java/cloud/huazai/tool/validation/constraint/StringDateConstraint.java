package cloud.huazai.tool.validation.constraint;

import cloud.huazai.tool.basic.data.DateUtils;
import cloud.huazai.tool.basic.lang.StringUtils;
import cloud.huazai.tool.validation.StringDate;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;


/**
 * StringDateConstraint
 *
 * @author Di Wu
 * @since 2024-02-24
 */
public class StringDateConstraint implements ConstraintValidator<StringDate, String> {

	private String dateFormat;

	// private boolean validationBlank;


	@Override
	public void initialize(StringDate constraintAnnotation) {

		this.dateFormat = constraintAnnotation.dateFormat();
		// this.validationBlank = constraintAnnotation.validationBlank();
	}

	@Override
	public boolean isValid(String strDate, ConstraintValidatorContext context) {


		// if (validationBlank && StringUtils.isBlank(strDate)) {
		// 	return !validationBlank;
		// }
		//
		// if (!validationBlank && StringUtils.isBlank(strDate)) {
		// 	return !validationBlank;
		// }

		if ( StringUtils.isBlank(strDate)) {
			return true;
		}

		try {
			DateUtils.parse(strDate, dateFormat);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
}
