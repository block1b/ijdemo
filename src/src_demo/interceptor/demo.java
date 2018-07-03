package interceptor;

import org.apache.struts2.ServletActionContext;

public class demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name = "namer";
		String r_char = name.substring(name.length() - 1);
		System.out.println("最后一个字符串：" + r_char);
		
	}

}
