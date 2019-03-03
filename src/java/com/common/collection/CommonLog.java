package com.common.collection;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * 공통 로그 모듈
 * 
 * @author  Dong-min Seol
 * @since	2019.02.09
 */
@Component
public class CommonLog {

	// -----------     Fields    ----------- 
	private Logger log = null;
	public String randomChar = "";
	
	// -----------   Constructor  -----------
	public CommonLog() {
		log = LogManager.getLogger(CommonLog.class.getName());
	}
	
	// ----------- Public Operations -----------
	
	/**
	 * <pre>
	 * 	Logging debug Message
	 * </pre>
	 * @param   message
	 * @author  Dong-min Seol
	 * @since	2019.02.09
	 */
	public void d(String message) {
		log.debug(message);
	}
	
	/**
	 * <pre>
	 * 	Logging info Message
	 * </pre>
	 * @param   message
	 * @author  Dong-min Seol
	 * @since	2019.02.09
	 */
	public void i(String message) {
		log.info(message);
	}
	
	/**
	 * <pre>
	 * 	Logging debug Message
	 * </pre>
	 * @param   message
	 * @author  Dong-min Seol
	 * @since	2019.02.09
	 */
	public void w(String message) {
		log.warn(message);
	}
	
	/**
	 * <pre>
	 * 	Logging error Message
	 * </pre>
	 * @param   message
	 * @author  Dong-min Seol
	 * @since	2019.02.09
	 */
	public void e(String message) {
		log.error(message);
	}
}
