package cloud.huazai.tool.basic.demo;

import cloud.huazai.tool.basic.data.DateFormat;
import cloud.huazai.tool.basic.data.DateUtils;
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

// // 创建日期时间格式化对象
// 		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(DateFormat.DATE_MIDDLE_LINE_FORMAT);
// 		// 将用户输入的字符串解析为LocalDateTime对象
// 		LocalDate dateTime = LocalDate.parse("21-08-31", formatter);
//
// 		if (dateTime == null) {
// 			System.out.println("null");
// 		}else{
// 			Date date = DateUtils.getDate(dateTime);
// 			String formatDate = DateUtils.format(date, DateFormat.DATE_MIDDLE_LINE_FORMAT);
// 			System.out.println("formatDate = " + formatDate);
// 		}

		String dateStr = "2023-2-23";

		String dateFormat = "yyyy-M-d";
		boolean validFormat = DateUtils.isValidDate(dateStr,dateFormat);

		System.out.println("validFormat = " + validFormat);


		Date parse = DateUtils.parse("23-05-01", DateFormat.DATE_MIDDLE_LINE_FORMAT);
		if (parse == null) {
			System.out.println("null");

		}else{
			String format = DateUtils.format(parse, DateFormat.DATE_MIDDLE_LINE_FORMAT);
			System.out.println("format = " + format);
		}


	}
}
