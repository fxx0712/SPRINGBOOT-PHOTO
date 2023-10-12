package com.example.fxx_user.userService;
import com.example.fxx_user.Dao.Dao;
import com.example.fxx_user.entity.User;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    Dao dao;

    public User login(User user) {
        return dao.Log(user.getUsername(), user.getPassword());
    }

    public boolean register(User user) {
        // 检查用户名是否已存在
        User existingUser = dao.Log(user.getUsername(), user.getPassword());
        if (existingUser != null) {
            return false; // 用户名已存在，注册失败
        }
        // 执行注册逻辑
        dao.register(user.getUsername(), user.getPassword());
        return true; // 注册成功
    }
}
