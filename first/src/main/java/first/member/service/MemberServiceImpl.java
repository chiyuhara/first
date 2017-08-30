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
	public void insertUser(Map<String, Object> map, HttpServletRequest request) throws Exception {
		
		memberDAO.insertUser(map);
		
	}
}
