package base;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.util.Iterator;
import java.util.Properties;
//properties继承与hashtable
public class PropertiesTest {

	public static void main(String[] args) {
		Properties properties=new Properties();
		try{
			//读取properties配置文件的信息
			InputStream in=new BufferedInputStream(new FileInputStream("D://test/a.properties"));
		    properties.load(in); //加载属性列表
		    Iterator<String> it=properties.stringPropertyNames().iterator();
		    while(it.hasNext()){
		    	String key=it.next();
		    	System.out.println(key+""+properties.getProperty(key));
		    }
		    in.close();
		    
		    //保存属性到b.properties
			FileOutputStream   oFile=new FileOutputStream("D://test/b.properties");
			properties.setProperty("mom", "asd");
			properties.setProperty("fat", "qwe");
			properties.setProperty("sao", "fgh");
		    properties.store(oFile,"The new properties files");
		    oFile.close();
		
		}
		catch(Exception e){
			System.out.println(e);
		}	
	}

}
