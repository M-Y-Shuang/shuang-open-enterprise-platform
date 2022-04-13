package com.shuang.commons.multi.mongodb.repository.secondary;

import com.shuang.commons.multi.mongodb.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SecondaryRepository extends MongoRepository<User, String> {
}
