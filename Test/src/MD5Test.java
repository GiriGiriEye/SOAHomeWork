/** 
 * Copyright 2012 
 * 
 * All right reserved 
 *  
 * Created on 2012-8-31下午5:43:58 
 */  
import java.io.*;
import java.security.*;
public class MD5Test  {

public static String getFileMd5Value(String filePath, String fileName){
	    File file = new File(filePath + File.separator + fileName);
	    if(!file.exists() || !file.isFile()){
	        return "";
	    }
	    byte[] buffer = new byte[2048];
	    try {
	        MessageDigest digest = MessageDigest.getInstance("MD5");
	        FileInputStream in = new FileInputStream(file);
	        while(true){
	            int len = in.read(buffer,0,2048);
	            if(len != -1){
	                digest.update(buffer, 0, len);
	            }else{
	                break;
	            }
	        }
	        in.close();
	         
	        byte[] md5Bytes  = digest.digest();
	        StringBuffer hexValue = new StringBuffer();
	        for (int i = 0; i < md5Bytes.length; i++) {
	            int val = ((int) md5Bytes[i]) & 0xff;
	            if (val < 16) {
	                hexValue.append("0");
	            }
	            hexValue.append(Integer.toHexString(val));
	        }
	        return hexValue.toString();
	    } catch (Exception e) {
	        e.printStackTrace();
	        return "";
	    }
	}
	
	public static void main(String[] args) {
		System.out.println(MD5Test.getFileMd5Value("D:\\git_repo\\DesignerWork\\designer\\Excel\\Role", "Npc.xlsx").toUpperCase());
	}
}
