package first.member.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("memberDAO")
public class MemberDAO extends AbstractDAO {
	
	public Object userCheck(Map<String, Object> map) throws Exception{
		return selectOne("member.userCheck", map);
	}
	
	public int insertUser(Map<String, Object> map) throws Exception{
		return insertUser("member.insertUser", map);
	}
}
