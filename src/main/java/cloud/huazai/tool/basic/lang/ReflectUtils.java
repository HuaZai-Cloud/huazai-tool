package cloud.huazai.tool.basic.lang;



import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

/**
 * ReflectUtils
 *
 * @author HuaZai
 * @since 2024-02-24
 */
public class ReflectUtils {

	public static<T> List<Object> getFieldValueListByEnumClazzAndField(Class<T> enumClazz,String field){
		List<Object> result = new ArrayList<Object>();
		try {
			T[] enums = enumClazz.getEnumConstants();
			if (ArrayUtils.isEmpty(enums)) {
				return result;
			}

			for (int i = 0; i < enums.length; i++) {
				T anEnum = enums[i];
				if (anEnum == null) {
					break;
				}
				Field declaredField = anEnum.getClass().getDeclaredField(field);
				declaredField.setAccessible(true);
				Object o = declaredField.get(anEnum);
				result.add(o);
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		}


		return result;

	}
}
