package validate;

/**
 * �����ж�һЩ�����������ǲ��Ƿ�������Ҫ��
 * @author WYL
 *
 */
public class validate {

	/**
	 * �ж�һ�������ǲ�����ȷ�����ָ�ʽ
	 * @param number
	 */
	public static final boolean validateNumber(final Integer number){
		if(number instanceof Integer){
			//�����͵ľ�ֱ�ӷ���true
			return true;
		}
		//���粻�����͵ľ�ֱ�ӷ���false
		return false;
	}
	
	/**
	 * �ж�һ�������ǲ���Long���͵�
	 * @param number
	 * @return
	 */
	public static final boolean validateNumber(final Long number){
		if(number instanceof Long){
			//��Long���͵��򷵻�true
			return true;
		}
		//����Long�����򷵻�false
		return false;
	}
	
	/**
	 * �ж�һ���ַ����ǲ���String����	 
	 * @param str
	 * @return
	 */
	public static final boolean validateNumber(final String str)
	{
		if(str instanceof String){
			//������String�򷵻�true
			return true;
		}
		//���򷵻�false
		return false;
	}
	
	
	
	
}
