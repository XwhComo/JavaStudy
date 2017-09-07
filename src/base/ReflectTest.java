package base;

import java.lang.reflect.Field;
import java.time.chrono.JapaneseChronology;

public class ReflectTest {
    
	private String fname;
	private String lname;
	public ReflectTest (String fname,String lname){
		this.fname=fname;
		this.lname=lname;
	}
	public static void main(String[] args) {
		try{
			//创建ReflectTest类的对象，同时被初始化属性
			ReflectTest rt=new ReflectTest("java", "aspect");
			fun(rt);
		}
		catch(Exception e){e.printStackTrace();}

	}
	public static void fun(Object obj) throws Exception {
		//获取object的所有成员列表，
		Field[] fields=obj.getClass().getDeclaredFields();
		System.out.println("替代前的：");
		for(Field field : fields){
			System.out.println(field.getName()+"="+ field.get(obj));
			if(field.getType().equals(java.lang.String.class)){
				//设置为true才能修改成员变量
				field.setAccessible(true);
				String org=(String)field.get(obj);
				//将field中当前存放的对象的属性值中出现的所有字符串中“a”用字符串“b”替代
				field.set(obj, org.replaceAll("a", "b"));
			}
		}
		System.out.println("替代后的：");
		for(Field field : fields){
			System.out.println(field.getName()+"="+ field.get(obj));
		}
	}

}
