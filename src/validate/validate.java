package validate;

/**
 * 用于判断一些参数的输入是不是符合输入要求
 * @author WYL
 *
 */
public class validate {

	/**
	 * 判断一个参数是不是正确的数字格式
	 * @param number
	 */
	public static final boolean validateNumber(final Integer number){
		if(number instanceof Integer){
			//是整型的就直接返回true
			return true;
		}
		//假如不是整型的就直接返回false
		return false;
	}
	
	/**
	 * 判断一个数字是不是Long类型的
	 * @param number
	 * @return
	 */
	public static final boolean validateNumber(final Long number){
		if(number instanceof Long){
			//是Long类型的则返回true
			return true;
		}
		//不是Long类型则返回false
		return false;
	}
	
	/**
	 * 判断一个字符串是不是String类型	 
	 * @param str
	 * @return
	 */
	public static final boolean validateNumber(final String str)
	{
		if(str instanceof String){
			//类型是String则返回true
			return true;
		}
		//否则返回false
		return false;
	}
	
	
	
	
}
