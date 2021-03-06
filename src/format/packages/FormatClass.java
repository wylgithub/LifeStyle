package format.packages;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatClass {

	/**
	 * 将字符串转换成大写
	 * @param str
	 * @return 字符串的大写
	 */
	public static String toUppercase(String str){
		return str.toUpperCase();
	}
	
	/**
	 * 将一个字符串转换成小写
	 * @param str
	 * @return 转换成小写之后的字符串
	 */
	public static String toLowerCase(String str){
		return str.toLowerCase();
	}
	
	/**
	 * 判断一个字符串是不是为空
	 * @param str
	 * @return
	 */
	public static String isBlankOrNull(String str){
		if(str == null){
			return "";
		}
		
		return str;
	}
	
	
	public static void getinteger(){
		
	}

	/**
	 * 将一个时间格式化成指定的样式
	 * @param date： 	要格式化的时间
	 * @param dateStyle 要格式化的样式
	 * @return
	 */
	public static String  formatDate(Date date, String dateStyle){
	
		//时间格式化类
		SimpleDateFormat sdf = new SimpleDateFormat(dateStyle);
		
		return sdf.format(date);
	}
	
	/**
	 * 判断一个字符串是否是空
	 * @param str
	 * @return
	 */
	public static boolean isEmpty(final String str){
		return (str == null) || (str.length() == 0);
	}
	
	/**
	 * 将一个日期格式化为制定的格式
	 * @param date
	 * @return
	 */
	public static String formateDate(final Date date,final String formatStyle){
		
		//获得时间格式化类实例
		SimpleDateFormat formater = new SimpleDateFormat(formatStyle);
		
		String formateDate = formater.format(date);
		//返回格式化后的时间
		return formateDate;
	}
	
	
	
	
}
