package cloud.huazai.tool.basic.collection;

import java.util.Map;

/**
 * MapUtils
 *
 * @author Di Wu
 * @since 2024-01-20
 */
public class MapUtils {

	public static boolean isEmpty(final Map<?,?> map) {
		return map == null || map.isEmpty();
	}

	public static boolean isNotEmpty(final Map<?, ?> map) {
		return !isEmpty(map);
	}

}
