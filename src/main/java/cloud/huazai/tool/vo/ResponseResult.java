package cloud.huazai.tool.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Response
 *
 * @author HuaZai
 * @since 2024-01-20
 */

@Data
@EqualsAndHashCode(callSuper = true)
public class ResponseResult<T> extends BaseVO {

	private static final long serialVersionUID = -8079092531490103780L;

	private T data;

	private ResponseResult() {
	}

	public static <T> ResponseResult<T> success() {
		ResponseResult<T> response = new ResponseResult<>();

		response.setSuccess(true);
		response.setStatusCode(200);

		return response;
	}


	public static <T> ResponseResult<T> success(T data) {
		ResponseResult<T> response = new ResponseResult<>();
		response.setData(data);
		response.setSuccess(true);
		response.setStatusCode(200);

		return response;
	}

	public static <T> ResponseResult<T> failure(Object statusCode, String message) {
		ResponseResult<T> response = new ResponseResult<>();

		response.setSuccess(false);
		response.setStatusCode(statusCode);
		response.setErrMessage(message);

		return response;
	}
}
