package cloud.huazai.tool.basic.collection;

import java.util.*;

/**
 * CollectionUtils
 *
 * @author HuaZai
 * @since 2024-01-20
 */
public class CollectionUtils {

	public static  boolean isEmpty(final Collection<?> collection) {
		return collection == null || collection.isEmpty();
	}

	public static boolean isNotEmpty(final Collection<?> collection){
		return !isEmpty(collection);
	}

	public static <T> List<T> emptyList() {
		return Collections.emptyList();
	}

	public static  <T> Set<T> emptySet() {
		return Collections.emptySet();
	}


}
