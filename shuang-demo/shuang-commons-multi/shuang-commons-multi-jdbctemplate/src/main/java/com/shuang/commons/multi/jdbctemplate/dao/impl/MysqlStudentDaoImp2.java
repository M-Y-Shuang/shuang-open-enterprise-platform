package com.shuang.commons.multi.jdbctemplate.dao.impl;

import com.shuang.commons.multi.jdbctemplate.dao.MysqlStudentDao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public class MysqlStudentDaoImp2 implements MysqlStudentDao2 {

	@Autowired
	@Qualifier("mysqlJdbcTemplate2")
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Map<String, Object>> getAllStudents() {

		return this.jdbcTemplate.queryForList("select * from student");
	}

}