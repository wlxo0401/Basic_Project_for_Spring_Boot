package kr.inhatc.spring.friend.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import kr.inhatc.spring.friend.entity.Friends;

@Repository
public interface FriendRepository extends CrudRepository<Friends, String>{

	List<Friends> findAllByOrderByIdDesc();
 

}
