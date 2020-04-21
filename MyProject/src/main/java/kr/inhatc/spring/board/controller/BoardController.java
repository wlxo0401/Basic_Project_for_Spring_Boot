package kr.inhatc.spring.board.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import kr.inhatc.spring.board.dto.BoardDto;
import kr.inhatc.spring.board.service.BoardService;

@Controller
public class BoardController {
	
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/")
	public String hello() {
		return "Index.html";
	}
	

	@RequestMapping("/board/boardList.do")
	public String boardList(Model model) {
		List<BoardDto> list = boardService.boardList();
		System.out.println("=============== >>>> " + list.size());
		//이름은 list로 하고 담아갈 친구는 위에 list
		model.addAttribute("list", list);
		// 아래 주소를 찾아간다.
		return "board/boardList";
	}

	
//	@RequestMapping("/board/boardList.do")
//	public ModelAndView boardList() {
//		//Model And View 를 만든다. 페이지는 board/boadrList로 이동한다.
//		ModelAndView mv = new ModelAndView("board/boardList");
//		//서비스를 타고 리스트를 만들어온다.
//		List<BoardDto> list = boardService.boardList();
//		//만들어오면 Model and View에 담는다. 모델이라는 애를 (list라는 이름으로 가지고 온다. list를 사용한다.)
//		mv.addObject("list", list);
//		return mv;
//	}

}
