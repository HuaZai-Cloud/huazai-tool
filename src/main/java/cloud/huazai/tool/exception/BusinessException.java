package cloud.huazai.tool.exception;

/**
 * BusinessException
 *
 * @author Di Wu
 * @since 2024-01-15
 */
public class BusinessException extends BaseException{

	private static final long serialVersionUID = 3765565336371015657L;

	public BusinessException(String message) {
		super(message,4000);
	}

	public BusinessException(String message, Object errCode) {
		super(message, errCode);
	}

	public BusinessException(String message,Throwable cause) {
		super(message,cause, 4000);
	}

	public BusinessException(String message, Throwable cause, Object errCode) {
		super(message, cause, errCode);
	}

	public BusinessException(IBusinessExceptionEnum businessExceptionEnum) {
		super(businessExceptionEnum);
	}

}
