package com.common.enumtype;

import java.util.Arrays;

/**
 * <pre>
 * 공통 에러코드 enum class
 * </pre>
 * 
 * @author 	Dong-Min Seol
 * @version 1.0
 * @since  2019.02.23
 */
public enum ErrorCodeType {
	
	// 정상 에러코드 
	COMMON_ERROR_000000("000000", "정상"),
	
	// 비정상 에러코드 (공통)
	COMMON_ERROR_000001("000001", "공통 [unknown exception] 알 수 없는 에러입니다.");
	
	private String errMsg;
	private String errCode;
	
	private ErrorCodeType(String errCode, String errMsg) {
		this.errCode = errCode;
		this.errMsg = errMsg;
	}
	
	public String getErrMsg() {
		return errMsg;
	}

	public String getErrCode() {
		return errCode;
	}
	
	/**
	 * <pre>
	 * 에러코드 기반 에러 조회 enum method
	 * 
	 * @author   Dong-Min Seol
	 * @since    2019.02.23
	 * @param    errCode   enum 에러 코드
	 * @return   ErrorCodeType 
	 * </pre> 
	 * 
	 */
	public static ErrorCodeType search(String errCode) {
		
		return Arrays.stream(ErrorCodeType.values())
					 .filter(t -> errCode.equals(t.getErrCode()))
					 .findAny()
					 .orElse(null);
		
	}
}
