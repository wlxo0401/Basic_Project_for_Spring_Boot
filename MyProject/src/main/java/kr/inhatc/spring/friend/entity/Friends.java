package kr.inhatc.spring.friend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "friend")
@NoArgsConstructor
@Data
public class Friends {
	
	@Id
	@Column(name = "FRIEND_ID")
	private String id;
	private String name;
	private String age;
	private String city;
	private String Phone;
	private String job;
}
