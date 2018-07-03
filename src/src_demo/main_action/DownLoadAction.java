package main_action;

import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class DownLoadAction extends ActionSupport{
  
	private String downPath;
	private String contentType;
	private String filename;
	public String getDownPath() {
		return downPath;
	}
	public void setDownPath(String downPath) {
		
		try {
			this.downPath = new String(downPath.getBytes(), "gbk");
			
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		this.downPath = downPath;
	}
	public String getContentType() {
		return contentType;
	}
	public void setContentType(String contentType) {
		this.contentType = contentType;
	}
	public String getFilename() {
		
		return filename;
	}
	
	public void setFilename(String filename) {
		try {
//			this.filename = new String(filename.getBytes(), "gbk");
			this.filename = URLEncoder.encode(filename, "UTF-8");
		}catch(UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		this.filename = filename;
	}
	public InputStream getInputStream() {
		System.out.println("文件名1：" + downPath);
		return ServletActionContext.getServletContext().getResourceAsStream(downPath);
	}
	
	public String execute() {
		System.out.println("文件名：" + downPath);
		filename = downPath;
		downPath = "file/" + downPath;
		contentType = "application/x-msdownload";
		filename = MyUtil.toUTF8String(filename);
		return SUCCESS;
	}
}
