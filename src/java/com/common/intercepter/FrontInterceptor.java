package com.common.intercepter;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.common.collection.VO;

/**
 * Controller 호출 전 Handler를 통해 
 * 로그인 처리, VO 세팅 등 공통작업을 수행하는 인터셉터
 * 
 * @author Dong-Min Seol
 * @since  2019.02.03
 */
public class FrontInterceptor extends HandlerInterceptorAdapter {

	/**
	 * <pre> 
	 * 컨트롤러 호출 전 아래 메소드를 실행
	 * </pre>
	 * 
	 * @author  Dong-Min Seol
	 * @since   2019.02.03  
	 */
	@Override
	public boolean preHandle(HttpServletRequest req, HttpServletResponse res, Object handler) throws Exception {
		VO vo = new VO();
		Map<String, String[]> requestMap = req.getParameterMap();
		
		// [1] VO Setting
		requestMap.forEach( (k, v) -> {
			
			if(v.length == 1) {
				vo.put(k, v[0]);
			
			} else {
				vo.put(k, v);
			}
			
		});
		
		// 세팅된 VO request 영역에 저장 후 Controller로 전송
		req.setAttribute("initVO", vo);
		return true;
	}
	
	
}
