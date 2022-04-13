package com.shuang.commons.multi.jpa.annotation.repository;

import com.shuang.commons.multi.jpa.annotation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
