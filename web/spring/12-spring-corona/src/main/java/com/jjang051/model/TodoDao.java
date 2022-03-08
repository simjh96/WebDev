package com.jjang051.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TodoDao {
	
	@Autowired
	public SqlSessionFactory sqlSessionFactory;
	
	public int insertTodo(TodoDto todoDto) {
		int result = 0;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		result = sqlSession.insert("insertTodo",todoDto);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}

	public int deleteTodo(int delNo) {
		int result = 0;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		result = sqlSession.delete("deleteTodo", delNo);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
	
	public List<TodoDto> getAllList(String pickedDate) {
		List<TodoDto> todoList = null;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		todoList = sqlSession.selectList("getAllList",pickedDate);
		sqlSession.close();
		return todoList;
	}
	
	public int updateTodo(TodoDto todoDto) {
		int result = 0;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		result = sqlSession.update("updateTodo", todoDto);
		sqlSession.commit();
		sqlSession.close();		
		return result;
	}
}







