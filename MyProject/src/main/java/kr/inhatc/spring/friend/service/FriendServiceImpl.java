package kr.inhatc.spring.friend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.inhatc.spring.friend.entity.Friends;
import kr.inhatc.spring.friend.repository.FriendRepository;

//Autowired를 위해 서비스 어노테이션 해주어야함
@Service
public class FriendServiceImpl implements FriendService{
	
	
	@Autowired
	FriendRepository friendRepository;
	

	@Override
	public List<Friends> friendList() {
		//모두 가지고 오지만 id를 기준으로 Desc 정렬한다.
		List<Friends> list = friendRepository.findAllByOrderByIdDesc();
		return list;
	}


	@Override
	public void saveFriends(Friends friend) {
		friendRepository.save(friend);	
	}


	@Override
	public Friends friendDetail(String id) {
		Optional<Friends> optional = friendRepository.findById(id);
		if(optional.isPresent()) {
			Friends friend = optional.get();
			return friend;
		}else {
			throw new NullPointerException();
		}
	}


	@Override
	public void friendDelete(String id) {
		friendRepository.deleteById(id);
	}


}
