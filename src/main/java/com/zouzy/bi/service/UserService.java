package com.zouzy.bi.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.zouzy.bi.model.dto.user.UserQueryRequest;
import com.zouzy.bi.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import com.zouzy.bi.model.vo.LoginUserVO;
import com.zouzy.bi.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author zouzhenyu
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2023-12-17 10:36:55
*/
public interface UserService extends IService<User> {

    long userRegister(String userAccount, String userPassword, String checkPassword);

    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    boolean userLogout(HttpServletRequest request);

    User getLoginUser(HttpServletRequest request);

    LoginUserVO getLoginUserVO(User user);

    UserVO getUserVO(User user);

    List<UserVO> getUserVO(List<User> records);

    Wrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

    boolean isAdmin(HttpServletRequest request);

    boolean isAdmin(User loginUser);
}
