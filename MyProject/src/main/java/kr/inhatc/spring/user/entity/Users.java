package kr.inhatc.spring.user.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.Data;
import lombok.NoArgsConstructor;

//DB객체 라는 뜻
@Entity
//테이블 명
@Table(name = "users")
@NoArgsConstructor
@Data
public class Users {
		
	@Id
	//이름 바꾸기
	@Column(name = "USER_ID")
	private String id;
	private String pw;
	private String name;
	private String email;
	@Temporal(TemporalType.TIMESTAMP)
	@Column(insertable = false, updatable = false, columnDefinition = "date default sysdate")
	private Date joinDate;
	private String enabled;
	private String role;

}
