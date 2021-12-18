package com.forum.csee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.forum.csee.vo.UserVO;

@Service
public class UserServiceImpl {
	@Autowired
	UserDAO userDAO;
	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
}