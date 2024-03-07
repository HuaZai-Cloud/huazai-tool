package cloud.huazai.tool.basic.lang;

import cloud.huazai.tool.basic.constant.SymbolConstant;
import cn.hutool.core.text.StrFormatter;
import cn.hutool.core.util.ArrayUtil;
import cn.hutool.core.util.CharsetUtil;
import cn.hutool.core.util.StrUtil;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.StringJoiner;

/**
 * StringUtils
 *
 * @author HuaZai
 * @since 2024-01-15
 */
public class StringUtils {

	public static final String EMPTY = SymbolConstant.EMPTY;


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



	public static String format(String strPattern, String placeHolder, String... argArray) {
		if (StrUtil.isBlank(strPattern) || StrUtil.isBlank(placeHolder) || ArrayUtils.isEmpty(argArray)) {
			return strPattern;
		}
		final int strPatternLength = strPattern.length();
		final int placeHolderLength = placeHolder.length();

		// 初始化定义好的长度以获得更好的性能
		final StringBuilder sbuf = new StringBuilder(strPatternLength + 50);

		int handledPosition = 0;// 记录已经处理到的位置
		int delimIndex;// 占位符所在位置

		for (int argIndex = 0; argIndex < argArray.length; argIndex++) {
			delimIndex = strPattern.indexOf(placeHolder, handledPosition);
			if (delimIndex == -1) {// 剩余部分无占位符
				if (handledPosition == 0) { // 不带占位符的模板直接返回
					return strPattern;
				}
				// 字符串模板剩余部分不再包含占位符，加入剩余部分后返回结果
				sbuf.append(strPattern, handledPosition, strPatternLength);
				return sbuf.toString();
			}

			// 转义符
			if (delimIndex > 0 && strPattern.charAt(delimIndex - 1) == SymbolConstant.C_BACKSLASH) {// 转义符
				if (delimIndex > 1 && strPattern.charAt(delimIndex - 2) == SymbolConstant.C_BACKSLASH) {// 双转义符
					// 转义符之前还有一个转义符，占位符依旧有效
					sbuf.append(strPattern, handledPosition, delimIndex - 1);
					sbuf.append(argArray[argIndex]);
					handledPosition = delimIndex + placeHolderLength;
				} else {
					// 占位符被转义
					argIndex--;
					sbuf.append(strPattern, handledPosition, delimIndex - 1);
					sbuf.append(placeHolder.charAt(0));
					handledPosition = delimIndex + 1;
				}
			} else {// 正常占位符
				sbuf.append(strPattern, handledPosition, delimIndex);
				sbuf.append(argArray[argIndex]);
				handledPosition = delimIndex + placeHolderLength;
			}
		}

		// 加入最后一个占位符后所有的字符
		sbuf.append(strPattern, handledPosition, strPatternLength);

		return sbuf.toString();
	}






}
