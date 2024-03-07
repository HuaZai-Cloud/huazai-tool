package cloud.huazai.tool.basic.collection;

import cloud.huazai.tool.basic.pojo.Student;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * CollectionUtilsTest
 *
 * @author HuaZai
 * @since 2024-03-06
 */
public class CollectionUtilsTest extends TestCase {

	public void testIsEmpty() {

		List<Student> studentList = getList();
		if (CollectionUtils.isEmpty(studentList)) {
			System.err.println("studentList 是空");
		}else{
			System.err.println("studentList 不为空");
		}

	}

	private List<Student> getList() {


		return	CollectionUtils.emptyList();

	}

	public void testIsNotEmpty() {
		List<Student> studentList = getList();
		if (CollectionUtils.isNotEmpty(studentList)) {
			System.err.println("studentList 不为空");
		}else{
			System.err.println("studentList 是空");
		}

	}
}