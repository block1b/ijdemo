package main_action;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class IOUtils {

	public void copyfiles(File[] headImage, String[] headImageContentType, String[] headImageFileName) throws IOException
	{
		String realpath = ServletActionContext.getServletContext().getRealPath("/file");
		File file = new File(realpath);
		if(!file.exists()) {
			file.mkdirs();
		}
		for(int i=0; i<headImage.length; i++) {
			File uploadImage = headImage[i];
			FileUtils.copyFile(uploadImage, new File(file, headImageFileName[i]));
		}
	}
}
