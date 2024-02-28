package cloud.huazai.tool.basic.collection;

import java.util.*;

/**
 * CollectionUtils
 *
 * @author Di Wu
 * @since 2024-01-20
 */
public class CollectionUtils {

	public static   final  List<Object> EMPTY_LIST = new ArrayList<>();
	public static   final Set<Object> EMPTY_SET = new HashSet<>();


	public static  boolean isEmpty(final Collection<?> collection) {

		return collection == null || collection.isEmpty();
	}

	public static boolean isNotEmpty(final Collection<?> collection){
		return !isEmpty(collection);

	}


}
