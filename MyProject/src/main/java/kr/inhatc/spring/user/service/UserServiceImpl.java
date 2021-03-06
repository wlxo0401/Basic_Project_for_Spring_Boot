package kr.inhatc.spring.user.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.inhatc.spring.user.entity.Users;
import kr.inhatc.spring.user.repository.UserRepository;

//Autowired를 위해 서비스 어노테이션 해주어야함
@Service
public class UserServiceImpl implements UserService{
	
	
	@Autowired
	UserRepository userRepository;
	

	@Override
	public List<Users> userList() {
		//모두 가지고 오지만 id를 기준으로 Desc 정렬한다.
		List<Users> list = userRepository.findAllByOrderByIdDesc();
		return list;
	}


	@Override
	public void saveUsers(Users user) {
		userRepository.save(user);	
	}


	@Override
	public Users userDetail(String id) {
		Optional<Users> optional = userRepository.findById(id);
		if(optional.isPresent()) {
			Users user = optional.get();
			return user;
		}else {
			throw new NullPointerException();
		}
	}


	@Override
	public void userDelete(String id) {
		userRepository.deleteById(id);
	}

}
