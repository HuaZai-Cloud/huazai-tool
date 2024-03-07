package cloud.huazai.tool.dto;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * KeywordDTO
 *
 * @author HuaZai
 * @since 2024-01-20
 */


@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class BaseDTO extends DTO{
	private static final long serialVersionUID = 1437201097898102916L;


	private String keyword;



}
