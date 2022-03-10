package com.jjang051.model;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GalleryDao {
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	public int insertGallery(GalleryDto galleryDto) {
		int result = 0;
		SqlSession sqlSession = sqlSessionFactory.openSession();
		result = sqlSession.insert("insertGallery", galleryDto);
		sqlSession.commit();
		sqlSession.close();
		return result;
	}
}
