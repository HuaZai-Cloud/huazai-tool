package cloud.huazai.tool.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * PageDTO
 *
 * @author HuaZai
 * @since 2024-01-20
 */
@Getter
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class PageDTO extends BaseDTO {

	private static final long serialVersionUID = 2557291554877893868L;

	private static final int DEFAULT_PAGE_INDEX = 1;

	private static final int DEFAULT_PAGE_SIZE = 10;

	private static final int MINIMUM_PAGE_SIZE = 1;



	private int pageIndex = 1;

	private int pageSize = 10;

	public static final String ASC = "ASC";

	public static final String DESC = "DESC";

	private String orderRule = "DESC";

	public void setPageSize(int pageSize) {
		if (pageSize < MINIMUM_PAGE_SIZE) {
			pageSize = DEFAULT_PAGE_SIZE;
		}
		this.pageSize = pageSize;
	}

	public void setPageIndex(int pageIndex) {
		if (pageIndex < DEFAULT_PAGE_INDEX) {
			pageIndex = DEFAULT_PAGE_INDEX;
		}
		this.pageIndex = pageIndex;
	}

	public void setOrderRule(String orderRule) {
		if (ASC.equalsIgnoreCase(orderRule) || DESC.equalsIgnoreCase(orderRule)) {
			this.orderRule = orderRule;
		}
	}
}
