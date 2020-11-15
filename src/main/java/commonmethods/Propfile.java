package commonmethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.lang3.StringUtils;

public class Propfile {
	
	static Properties prop = new Properties();
	
	public static  String getpropvalue(String key) throws Exception {
		
		//String pfpath ="C:\\Users\\prave\\eclipse-workspace\\advshp\\src\\test\\resourses\\config.properties";
		
		String pfpath=System.getProperty("user.dir")+"\\src\\test\\resourses\\config.properties";
		FileInputStream fis = new FileInputStream(pfpath);
		prop.load(fis);
		
		//read file
		String value=prop.get(key).toString();
		
		if(StringUtils.isEmpty(value)){
			
			throw new Exception ("value is not aviable");
			
		}
		return value;
		
	}

}
//C:\Users\prave\eclipse-workspace\advshp\src\test\resourses\config.properties