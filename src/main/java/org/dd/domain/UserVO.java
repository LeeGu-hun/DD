package org.dd.domain;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class UserVO {
	private int user_id;
	private String user_name, password;
	private Date created_on, expires_on;
	private int quota;
	private String products, admin_user, id;
	private List<AuthVO> authList;
}
