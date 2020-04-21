package org.dd.mapper;

import org.dd.domain.UserVO;

public interface UserMapper {
	public UserVO checkLogin(String id);
}
