package cloud.huazai.tool.exception;

import lombok.Getter;
import lombok.Setter;

/**
 * BaseException
 *
 * @author HuaZai
 * @since 2024-01-15
 */
@Setter
@Getter
public abstract class BaseException extends RuntimeException{


	private static final long serialVersionUID = -8526299362748013248L;


	private Object errCode;


	public BaseException(String message, Object errCode) {
		super(message);
		this.errCode = errCode;
	}

	public BaseException(String message, Throwable cause, Object errCode) {
		super(message, cause);
		this.errCode = errCode;
	}

	public BaseException(Throwable cause, Object errCode) {
		super(cause);
		this.errCode = errCode;
	}

	public BaseException(IBaseExceptionEnum baseExceptionEnum) {
		super(baseExceptionEnum.errMessage());
		this.errCode = baseExceptionEnum.errCode();
	}


}
