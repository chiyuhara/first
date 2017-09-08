package first.member.service;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

public interface MemberService {

	int insertUser(Map<String, Object> map) throws Exception;
	
    Object userCheck(Map<String, Object> map) throws Exception;
	
}
