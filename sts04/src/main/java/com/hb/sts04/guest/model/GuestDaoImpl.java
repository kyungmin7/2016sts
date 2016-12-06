package com.hb.sts04.guest.model;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

public class GuestDaoImpl implements GuestDao {
	private SqlSession sqlSession;
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List selectAll() {
		
		return sqlSession.selectList("guest.selectAll");
	}

	@Override
	public GuestVo selectOne(int sabun) {
		return sqlSession.selectOne("guest.selectOne", sabun);
	}

	@Override
	public void insertOne(GuestVo bean) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateOne(GuestVo bean) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteOne(int sabun) {
		// TODO Auto-generated method stub

	}

}
