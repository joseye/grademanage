package com.gradeadminsystrem.util;


public class EncryptionTool {
//	private static final String PRIVATEKEY="MIICdwIBADANBgkqhkiG9w0BAQEFAASCAmEwggJdAgEAAoGBAI5zcVJUNRbq6DNQKTzdikdAUyNM"+
//			"KVad+oip+IZMvrkDsXKtQcSLOhSq6F4OcV5wP3vb3LRg0q3DyqMK+u/w10Iq2355RDo0jaj92SGZ"+
//			"ThWUQSnzR2gu4stLwsvrTVj+7mtyygu5ueSh4FV1da+3IXW0cE/qg3vLSLROqUivp1FjAgMBAAEC"+
//			"gYB4c7VG4F1j244slYPJK6tZRFMIbcYmr77BALhdF1fOKglJ5qbOAsxB3aJOpffG2zNTED43aAe9"+
//			"VulppEc7zHK3BS2w7fShEbXkesvpmkhxNetKs4n+keD0CjLpfXtgx1bU721DzKDyjE14Q0qLWITQ"+
//			"dBiJOm8iC+YZuAErY2wTwQJBAMfQ6w0sP12n3F6D4NbFTGS4xqDlCpzP3GvvOtCXwEV4qhkHM18g"+
//			"g+G5VlD3/DbURFD8reVm7MXQYYGhnr3VJZ8CQQC2gUo7GaW8SySv9jd0gk1jSdqpLJVk/SNgG8Nw"+
//			"DqI1te33L+PNQReDzT6OlMS+8VBRMMDdff4/V/9JhjA5e5W9AkEAhkSGjdV7xu0zEXfAr9DoIo5f"+
//			"OmJuHS03ynd4qA4wrv4EHslN5dAtjpJBxCq/GgDM3zbLi2j8FXiO7NKznpAJtQJAdBPJdct7OUaF"+
//			"4BD29niF5hesJpt/rYq/fDpMVLJKA2ViJCzmc77pyN+64Q7IEDYFgo5CrN2c3wcGDOp3M6hh9QJB"+
//			"AJgKIOrZXGAQUrtKUElS4Y2aAupsWZ9XGBMCMWX2mHEYBG8Bn7+g47P46eSrmBxtexmmVTGxmYto"+
//			"EBdHOCCbLQE=";
//		private static  String PUBLICKEY="MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCOc3FSVDUW6ugzUCk83YpHQFMjTClWnfqIqfiG"+
//				"TL65A7FyrUHEizoUquheDnFecD9729y0YNKtw8qjCvrv8NdCKtt+eUQ6NI2o/dkhmU4VlEEp80do"+
//				"LuLLS8LL601Y/u5rcsoLubnkoeBVdXWvtyF1tHBP6oN7y0i0TqlIr6dRYwIDAQAB";
	private static final String PRIVATEKEY="MIIBVAIBADANBgkqhkiG9w0BAQEFAASCAT4wggE6AgEAAkEAqTAVWeTKyejsQwWA7HRZzyxuIiGf"+
			"ItZdrRhP27X0CznfRVro0P3u1BQcnvAR97hiY6eLlGA6GZz8ZYBlZ/UjlwIDAQABAkAXsuCKwv2U"+
			"4seVa8PvWyzpVDPpHASKgLSGdo1ZHVed6rbfDsfZez4zq8+t/YMVNscOjHX3jkl/iz0iS7YM2e3h"+
			"AiEA4HvEqi4YuIC9mqQRTjjQEgtQ038+RJ0uyxvXeTqErbUCIQDA8Oq3UptghUE4a5xdRQvjxeQl"+
			"ZeKuttxFNjolm8J7mwIgT2s6TsL0OAJEEjvNa5Ep+9hJBipUS04Yyf7VoqwTWKkCIBQJcPa013oA"+
			"nLNVSZnOD9wJsxXHLPFkACAX75X0RRA9AiEAlfPe790UBWh1HzdxrhVGFdPimmkjLgSMmeR9ioZ6"+
			"6Nk=";
		private static  String PUBLICKEY="MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAKkwFVnkysno7EMFgOx0Wc8sbiIhnyLWXa0YT9u19As5"
				+"30Va6ND97tQUHJ7wEfe4YmOni5RgOhmc/GWAZWf1I5cCAwEAAQ==";
	public static String encryptionStr(String str){
	 try {
		if(null==str){
			 return "";
		 }
		 byte[] data = str.getBytes();  
		 byte[] encodedData = EncryptionUtil.encryptByPrivateKey(data, PRIVATEKEY);
		 String result= EncryptionUtil.encryptBASE64(encodedData);
		 return result.replace("\r\n", "");
	} catch (Exception e) {
		e.printStackTrace();
		 return "";
	}  
 }
 public static String decryptionStr(String str){
	 try {
		if(null==str){
			 return "";
		 }
		 byte[] data=EncryptionUtil.decryptBASE64(str);
		 byte[] encodedData = EncryptionUtil.decryptByPublicKey(data, PUBLICKEY);
		 return new String(encodedData);
	} catch (Exception e) {
		e.printStackTrace();
		 return "";
	}  
 }
 
 public static void setPUBLICKEY(String pUBLICKEY) {
	PUBLICKEY = pUBLICKEY;
}
public static void main(String[] args) {
	String xxx="我是中国人";
	String jiamistr=encryptionStr(xxx);
	System.out.println("jiamistr\n"+jiamistr);
	System.out.println("解密\n"+decryptionStr(jiamistr));
}
}
