package com.core.dao;

import com.core.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by yonghuo.chen on 16/10/7.
 */
public interface UserRepository extends Repository<User,Long> {

User getByUsername(String username);
}
