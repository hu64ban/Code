package cn.test;
/**
 * ����
 * @author Administrator
 *
 */
public class Person {
	private String name;  //����
	private String sex;  //�Ա�
	
	public void setSex(String sex) throws Exception {
		
		if(sex.equals("��")||sex.equals("Ů")){
			this.sex = sex;
		}else{
			throw new Exception("�Ա�������л�����Ů��");
		}
	}
	

}
