package filterDesignPattern;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public class Util {

	public static void showList(List<? extends Person> list){
		Field field[] = null;
		if(null == null || list.size() == 0){
			Class<?> clazz = list.get(0).getClass();
			field = clazz.getDeclaredFields();
		}else{
			System.out.println("showList method : param error");
			return;
		}
		for (int i = 0; i < list.size(); i++) {
			System.out.printf("%d.---------%n",i+1);
			for (Field field2 : field) {
				System.out.printf("%s = %s%n", field2.getName(),Util.getter(list.get(i), field2.getName()));
			}
		}
		
	}
	public static String getter(Object obj, String arry){
		String result = "";
		try {
			arry = arry.substring(0,1).toUpperCase().concat(arry.substring(1));
			Method method = obj.getClass().getMethod("get" + arry);
			result = method.invoke(obj).toString();
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		return result;
	}
	public Util() {
		// TODO Auto-generated constructor stub
	}

}
