package com.efun.dao.impl;

import com.efun.dao.UserDao;
import com.efun.pojo.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.sql.Types;
import java.util.List;

@Repository("userDao")
public class UserDaoImpl implements UserDao{


    @Resource(name = "local_template")
    private JdbcTemplate jj;

    public User getById(Integer id) {
        return null;
    }

    public List<User> findAll() {
        return null;
    }

    public Integer save(User entity) {
        String sql = "insert into user" + " values(?,?,?)";

        return jj.update(sql, new Object[]{entity.getId(),entity.getName() ,entity.getAge() }, new int[]{Types.INTEGER, Types.VARCHAR, Types.INTEGER});

    }
}
