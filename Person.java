package cn.test;
/**
 * 人类
 * @author Administrator
 *
 */
public class Person {
	private String name;  //姓名
	private String sex;  //性别
	
	public void setSex(String sex) throws Exception {
		
		if(sex.equals("男")||sex.equals("女")){
			this.sex = sex;
		}else{
			throw new Exception("性别必须是男或者是女！");
		}
	}
	

}
