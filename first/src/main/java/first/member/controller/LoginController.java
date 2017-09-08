package first.member.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import first.common.common.CommandMap;
import first.member.service.MemberService;

@Controller
public class LoginController {
	
	@Resource(name="memberService")
	private MemberService memberService;
	
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
	
	@RequestMapping("idCheck.do")
	public @ResponseBody int idCheck(CommandMap commandMap) throws Exception{
		
		String IdCheck = (String) memberService.userCheck(commandMap.getMap());
		
		int result = 0;
		if(IdCheck != null)
		{
			result = 1;
		}
		System.out.println(result);
		return result;
	}
	
	
	
	@RequestMapping("join.do")
	public ModelAndView join(CommandMap commandMap) throws Exception{
		int result = 0;
		
		result = memberService.insertUser(commandMap.getMap());
		mv.addObject("result",result);
		mv.setViewName("member/joinAjaxData");
		
		
		return mv;
	}
	
}
