package com.shuang.commons.multi.jdbctemplate.service;

import java.util.List;
import java.util.Map;

public interface StudentService {

	List<Map<String, Object>> getAllStudentsFrom1();

	List<Map<String, Object>> getAllStudentsFrom2();
}
