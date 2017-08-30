package first.member.service;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface MemberService {

	void insertUser(Map<String, Object> map, HttpServletRequest request) throws Exception;
}
