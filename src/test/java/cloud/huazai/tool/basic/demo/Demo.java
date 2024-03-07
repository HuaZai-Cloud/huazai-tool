package cloud.huazai.tool.basic.demo;

import cloud.huazai.tool.basic.constant.SymbolConstant;
import cloud.huazai.tool.basic.data.DateFormat;
import cloud.huazai.tool.basic.data.DateUtils;
import cloud.huazai.tool.basic.lang.StringUtils;
import cn.hutool.core.util.StrUtil;
import com.threesides.lang.StringUtil;
import org.junit.Test;
import org.springframework.format.datetime.DateFormatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

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
