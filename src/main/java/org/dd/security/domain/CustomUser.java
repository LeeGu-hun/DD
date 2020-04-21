package org.dd.security.domain;

import java.util.Collection;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.dd.domain.AuthVO;
import org.dd.domain.UserVO;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import lombok.Getter;

@Getter
public class CustomUser extends User {

	private static final long serialVersionUID = 1L;

	private UserVO user;

	public CustomUser(String username, String password, 
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, authorities);
	}

	public CustomUser(UserVO vo) {
		super(vo.getId(), vo.getPassword(),
			vo.getAuthList().stream().map(
				new Function<AuthVO, SimpleGrantedAuthority>() {
					@Override
					public SimpleGrantedAuthority apply(AuthVO auth) {
					  return new SimpleGrantedAuthority(auth.getAuth());
					}
			}).collect(Collectors.toList()));

//		super(vo.getId(), vo.getPassword(), vo.getAuthList().stream()
//				.map(auth -> new SimpleGrantedAuthority(
//						auth.getAuth())).collect(Collectors.toList()));
		this.user = vo;
	}
}
