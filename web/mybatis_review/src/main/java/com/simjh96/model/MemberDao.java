package com.simjh96.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class MemberDao {
	public List<MemberDto> getAllList() {
		List<MemberDto> memberList = null;
		SqlSession sqlSession = MybatisConnectionFactory.getSqlSession();
		memberList = sqlSession.selectList("getAllMember");
		sqlSession.close();
		return memberList;
	}
	public MemberDto getSelectOne(String id) {
		MemberDto memberList = null;
		SqlSession sqlSession = MybatisConnectionFactory.getSqlSession();
		memberList = sqlSession.selectOne("memberInfo", id);
		sqlSession.close();
		return memberList;
	}
}
