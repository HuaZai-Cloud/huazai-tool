package cloud.huazai.tool.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * SelectChildItemVO
 *
 * @author Di Wu
 * @since 2024-01-20
 */

@Data
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class SelectChildItemVO extends VO{

	private static final long serialVersionUID = 250246027387983535L;

	private Object key;

	private Object value;

	private boolean isEnable=Boolean.FALSE;

	private List<SelectChildItemVO> childList = new ArrayList<>();
}
