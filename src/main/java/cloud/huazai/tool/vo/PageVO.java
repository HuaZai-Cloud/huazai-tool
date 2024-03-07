package cloud.huazai.tool.vo;

import lombok.Getter;
import lombok.Setter;

import java.util.Collection;
import java.util.Collections;

/**
 * PageVO
 *
 * @author HuaZai
 * @since 2024-01-20
 */
@Getter
public class PageVO<T> extends VO{
	private static final long serialVersionUID = 1991435072495919929L;

	private static final int DEFAULT_PAGE_INDEX = 1;

	private static final int DEFAULT_PAGE_SIZE = 10;

	@Setter
	private int totalCount = 0;

	private int pageIndex = 1;

	private int pageSize = 10;

	private Collection<T> data;


	public void setPageSize(int pageSize) {
		if (pageSize < 1) {
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

	public void setData(Collection<T> data) {
		if (data == null) {
			data = Collections.emptyList();
		}
		this.data = data;
	}
}
