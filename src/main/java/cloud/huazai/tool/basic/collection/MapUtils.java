package cloud.huazai.tool.basic.collection;

import java.util.Collections;
import java.util.Map;

/**
 * MapUtils
 *
 * @author HuaZai
 * @since 2024-01-20
 */
public class MapUtils {


	public static boolean isEmpty(final Map<?,?> map) {
		return map == null || map.isEmpty();
	}


	public static boolean isNotEmpty(final Map<?, ?> map) {
		return !isEmpty(map);
	}

	public static <K, V> Map<K, V> emptyMap() {
		return Collections.emptyMap();
	}

}
