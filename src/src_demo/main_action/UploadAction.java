package main_action;

import java.io.File;
import java.io.IOException;
import java.util.Map;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class UploadAction extends ActionSupport {

	private File headImage;
	private String headImageContentType;
	private String headImageFileName;
	private Map<String, Object> request;
	
	public File getHeadImage() {
		return headImage;
	}
	public void setHeadImage(File headImage) {
		this.headImage = headImage;
	}
	public String getHeadImageContentType() {
		return headImageContentType;
	}
	public void setHeadImageContentType(String headImageContentType) {
		this.headImageContentType = headImageContentType;
	}
	public String getHeadImageFileName() {
		return headImageFileName;
	}
	public void setHeadImageFileName(String headImageFileName) {
		this.headImageFileName = headImageFileName;
	}
	public String execute() throws IOException{
		//绝对路径  
		String root_path = ServletActionContext.getServletContext().getRealPath("/file");  
		//相对路径  
//		String root = ServletActionContext.getRequest().getContextPath();
//		String root_path = root+"/files";
		System.out.println("项目目录：" + root_path);
		File file1 = new File(root_path);
		if(!file1.exists()) {
			file1.mkdirs();
		}
		FileUtils.copyFile(headImage, new File(file1, headImageFileName));
		return SUCCESS;
	}
	
}
