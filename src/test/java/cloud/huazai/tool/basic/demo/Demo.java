package cloud.huazai.tool.basic.demo;

import cloud.huazai.tool.basic.lang.StringUtils;

/**
 * Demo
 *
 * @author HuaZai
 * @since 2024-03-06
 */
public class Demo {


	public static void main(String[] args) {


		String format = StringUtils.format("date {} with dateFormat {} unconformity", "{}", "2023-04","yyyy-MM-dd");
		System.out.println("format = " + format);


	}

	public static void demo(String a) {
		System.out.println("a = " + a);
	}
}
