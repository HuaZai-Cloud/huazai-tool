package cloud.huazai.tool.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


/**
 * BaseVO
 *
 * @author HuaZai
 * @since 2024-01-20
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public  class BaseVO extends VO{
	private static final long serialVersionUID = -2229723043465861622L;

	private boolean success;
	private Object statusCode;
	private String errMessage;



}
