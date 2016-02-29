package format.packages;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FormatClass {

	/**
	 * ���ַ���ת���ɴ�д
	 * @param str
	 * @return �ַ����Ĵ�д
	 */
	public static String toUppercase(String str){
		return str.toUpperCase();
	}
	
	/**
	 * ��һ���ַ���ת����Сд
	 * @param str
	 * @return ת����Сд֮����ַ���
	 */
	public static String toLowerCase(String str){
		return str.toLowerCase();
	}
	
	/**
	 * �ж�һ���ַ����ǲ���Ϊ��
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
	 * ��һ��ʱ���ʽ����ָ������ʽ
	 * @param date�� 	Ҫ��ʽ����ʱ��
	 * @param dateStyle Ҫ��ʽ������ʽ
	 * @return
	 */
	public static String  formatDate(Date date, String dateStyle){
	
		//ʱ���ʽ����
		SimpleDateFormat sdf = new SimpleDateFormat(dateStyle);
		
		return sdf.format(date);
	}
	
	
	
}
