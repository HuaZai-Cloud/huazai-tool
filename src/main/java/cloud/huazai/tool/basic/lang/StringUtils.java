package cloud.huazai.tool.basic.lang;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * StringUtils
 *
 * @author Di Wu
 * @since 2024-01-15
 */
public class StringUtils {

	public static final String EMPTY = "";



	public static boolean isBlank(CharSequence cs) {
		int strLen = length(cs);
		if (strLen != 0) {
			for (int i = 0; i < strLen; ++i) {
				if (!Character.isWhitespace(cs.charAt(i))) {
					return false;
				}
			}
		}
		return true;
	}

	public static boolean isNotBlank(CharSequence cs) {

		return !isBlank(cs);
	}

	public static boolean isEmpty(CharSequence cs) {
		return cs == null || cs.length() == 0;
	}

	public static boolean isNotEmpty(CharSequence cs) {
		return !isEmpty(cs);
	}

	public static String join(CharSequence[] elements,CharSequence delimiter){

		// TODO 判断是否为空 为null
		StringJoiner joiner = new StringJoiner(delimiter);
		for (CharSequence element : elements) {

			joiner.add(toStringOrEmpty(element));
		}
		return joiner.toString();
	}

	public static String join(Iterable<? extends CharSequence> elements,CharSequence delimiter){
		// TODO 判断是否为空 为null
		StringJoiner joiner = new StringJoiner(delimiter);
		for (CharSequence element : elements) {

			joiner.add(toStringOrEmpty(element));
		}
		return joiner.toString();
	}

	public static String[] split(String str,String delimiter) {

		// TODO 判断 delimiter



		if (null == str) {
			return null;
		}

		int length = str.length();
		if (length == 0) {
			return ArrayUtils.EMPTY_STRING_ARRAY;
		}

		return str.split(delimiter);

	}


	public static List<String> splitToList(String str, String delimiter) {

		// TODO 判断 delimiter

		if (null == str) {
			return null;
		}
		List<String> result = new ArrayList<>();
		result.toArray(str.split(delimiter));

		return result;
	}




	public static int length(CharSequence cs) {
		return cs == null ? 0 : cs.length();
	}

	private static String toStringOrEmpty(final Object obj) {
		return Objects.toString(obj, EMPTY);
	}

	public static boolean endsWithIgnoreCase(String Str, String endsWith) {

		int n1 = Str.length();
		int n2 = endsWith.length();
		int min = Math.min(n1, n2);
		int difference = Math.max(n1, n2) - min;

		for (int i = 0; i < min; i++) {
			char c1 = Str.charAt(i + difference);
			char c2 = endsWith.charAt(i);
			if (c1 != c2) {
				c1 = Character.toUpperCase(c1);
				c2 = Character.toUpperCase(c2);
				if (c1 != c2) {
					c1 = Character.toLowerCase(c1);
					c2 = Character.toLowerCase(c2);
					if (c1 != c2) {
						return false;
					}
				}
			}
		}
		return true;
	}





}
