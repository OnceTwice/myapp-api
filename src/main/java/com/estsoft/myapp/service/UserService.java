package com.estsoft.myapp.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.estsoft.myapp.domain.User;

@Service
public class UserService {
	
	public List<User> getAllUsers() {
		
		List<User> list = new ArrayList<User>();
		
		User user = new User();
		user.setId( 1L );
		user.setName( "안대혁" );
		user.setPhone( "010-4761-6934" );
		user.setEmail( "kickscar@gmail.com" );
		user.setProfilePic( "https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-1/p160x160/936089_1019758748039064_7187347097932848216_n.jpg?oh=d7f1b684d98039f57995a7bada9120d7&oe=58B949B2" );
		user.setStatus( 1 );
		list.add( user );
		
		user = new User();
		user.setId( 3L );
		user.setName( "큰형님" );
		user.setPhone( "010-4761-6934" );
		user.setEmail( "bigbrother@gmail.com" );
		user.setProfilePic( "https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/1186118_146279165582758_1233784670_n.jpg?oh=a24bc568aa5092897f71cd4baabcb125&oe=58BC55BE" );
		user.setStatus( 1 );
		list.add( user );
	
		user = new User();
		user.setId( 6L );
		user.setName( "이윤임" );
		user.setPhone( "010-4761-6934" );
		user.setEmail( "yilee@gmail.com" );
		user.setProfilePic( "https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/970872_131001340439142_72401859_n.jpg?oh=3d8d77ed4bc46446d9e126db7890571b&oe=58F633AF" );
		user.setStatus( 1 );
		list.add( user );

		user = new User();
		user.setId( 10L );
		user.setName( "드림웍스" );
		user.setPhone( "010-4761-6934" );
		user.setEmail( "morison@gmail.com" );
		user.setProfilePic( "https://scontent-icn1-1.xx.fbcdn.net/v/t1.0-9/13244704_1192288654129059_9040112177709593214_n.jpg?oh=ee9c7e5ef89e449f5e1dbcf04a159d03&oe=58F66F22" );
		user.setStatus( 1 );
		list.add( user );
		
		return list;		
	}
}
