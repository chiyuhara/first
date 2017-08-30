package first.member.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;

import first.common.dao.AbstractDAO;

@Repository("memberDAO")
public class MemberDAO extends AbstractDAO {

	public void insertUser(Map<String, Object> map) throws Exception{
		insert("member.insertUser", map);
	}
}
