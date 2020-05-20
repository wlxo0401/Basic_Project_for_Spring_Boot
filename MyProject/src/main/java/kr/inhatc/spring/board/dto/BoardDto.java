package kr.inhatc.spring.board.dto;

import java.util.List;

import lombok.Data;

// DTO : Data Transfer Object 데이터를 전달해주는 객체
@Data
public class BoardDto {	
	private int boardIdx;
	private String title;
	private String contents;
	private int hitCnt;
	private String createDatetime;
	private String creatorId;
	// 파일 관리 위한 리스트 추가
	private List<FileDto> fileList;
}
