package first.member.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

	ModelAndView mv= new ModelAndView();
	
	@RequestMapping("loginForm.do")
	public ModelAndView loginForm(){ // 로그인 폼
		
		mv.setViewName("member/loginForm");
		
		return mv;
	}
	
	
	@RequestMapping("joinForm.do")
	public ModelAndView joinForm(){ // 회원가입 폼
		
		mv.setViewName("member/joinForm");
		
		return mv;
	}
	
	@RequestMapping("join.do")
	public ModelAndView join(){
		
		mv.setViewName("loginForm.do");
		
		return mv;
	}
	
}
