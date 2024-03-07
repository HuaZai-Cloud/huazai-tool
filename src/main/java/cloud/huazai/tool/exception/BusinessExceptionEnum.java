package cloud.huazai.tool.exception;

/**
 * BusinessExceptionEnum
 *
 * @author HuaZai
 * @since 2024-01-20
 */
public enum BusinessExceptionEnum implements IBusinessExceptionEnum{

	BUSINESS_EXCEPTION(100,"BUSINESS_EXCEPTION"),
	;

	private final Object errCode;

	private final String errMessage;

	BusinessExceptionEnum(Object errCode, String errMessage) {
		this.errCode = errCode;
		this.errMessage = errMessage;
	}

	@Override
	public Object errCode() {
		return errCode;
	}

	@Override
	public String errMessage() {
		return errMessage;
	}
}
