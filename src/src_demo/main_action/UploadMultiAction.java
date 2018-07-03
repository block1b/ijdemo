package main_action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class UploadMultiAction extends ActionSupport {

	private File[] headImage;
	private String[] headImageContentType;
	private String[] headImageFileName;

	public File[] getHeadImage() {
		return headImage;
	}

	public void setHeadImage(File[] headImage) {
		this.headImage = headImage;
	}

	public String[] getHeadImageContentType() {
		return headImageContentType;
	}

	public void setHeadImageContentType(String[] headImageContentType) {
		this.headImageContentType = headImageContentType;
	}

	public String[] getHeadImageFileName() {
		return headImageFileName;
	}

	public void setHeadImageFileName(String[] headImageFileName) {
		this.headImageFileName = headImageFileName;
	}
	public String execute() throws IOException{
//		String realpath = ServletActionContext.getServletContext().getRealPath("/file");
//		File file = new File(realpath);
//		if(!file.exists()) {
//			file.mkdirs();
//		}
//		for(int i=0; i<headImage.length; i++) {
//			File uploadImage = headImage[i];
//			FileUtils.copyFile(uploadImage, new File(file, headImageFileName[i]));
//		}
		IOUtils iot = new IOUtils();
		iot.copyfiles(headImage, headImageContentType, headImageFileName);
		return SUCCESS;
	}
}
