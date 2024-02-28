package cloud.huazai.tool.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * SelectValueItemVO
 *
 * @author Di Wu
 * @since 2024-01-20
 */
@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SelectValueItemVO extends VO{

	private static final long serialVersionUID = 8973986149144184352L;

	private Object key;

	private Object value;

	private boolean isEnable=Boolean.FALSE;
}
