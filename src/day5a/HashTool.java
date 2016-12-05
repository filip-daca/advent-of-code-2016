package day5a;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class HashTool {

	private static MessageDigest algorithm;
	{
		try {
			algorithm = MessageDigest.getInstance("MD5");
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			algorithm = null;
		}	
	}
	
	public String getHash(String code) {
		byte[] bytesOfCode = null;
		try {
			bytesOfCode = code.getBytes("UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			return "";
		}
		byte[] theDigest = algorithm.digest(bytesOfCode);
		
		StringBuffer sb = new StringBuffer();
        for (int i = 0; i < theDigest.length; ++i) {
        	sb.append(Integer.toHexString((theDigest[i] & 0xFF) | 0x100).substring(1,3));
        }
        return sb.toString();
	}
	
	public int getPosition(String hash) {
		if (Character.isDigit(hash.charAt(5))) {
			return Integer.parseInt("" + hash.charAt(5));
		} else {
			return -1;
		}
	}
	
}
