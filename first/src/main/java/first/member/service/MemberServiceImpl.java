package first.member.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Service;

import first.member.dao.MemberDAO;

@Service("memberService")
public class MemberServiceImpl implements MemberService {

	@Resource(name="memberDAO")
	private MemberDAO memberDAO;
	
	@Override
	public int insertUser(Map<String, Object> map) throws Exception {
		
		return memberDAO.insertUser(map);
		
	}

	@Override
	public Object userCheck(Map<String, Object> map) throws Exception {		
		
		return memberDAO.userCheck(map);
	}
}
