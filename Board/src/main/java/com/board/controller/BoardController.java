package com.board.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.board.dto.PageMakerDTO;
import com.board.model.BoardVO;
import com.board.model.Criteria;
import com.board.service.BoardService;


@Controller
@RequestMapping("/board/*")
public class BoardController {

	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	@Autowired
	private BoardService bservice;
	
//	게시판 목록 페이지 접속(페이징처리)
	@GetMapping("/list")
	public void boardListGET(Model model, Criteria cri) {
		
		logger.debug("boardListGET");
		
		logger.debug("cri : " + cri);
		
		model.addAttribute("list", bservice.getListPaging(cri));
		
		int total = bservice.getTotal(cri);
		
		PageMakerDTO pageMake = new PageMakerDTO(cri, total);
		
		model.addAttribute("pageMaker", pageMake);
		
	}	
	
//	게시판 등록 페이지 접속
	@GetMapping("/enroll")
	public void boardEnrollGET() {
		
		logger.debug("게시판 등록 페이지 진입");
		
	}
	
//	게시판 등록
	@PostMapping("/enroll")
	public String boardEnrollPOST(BoardVO board, RedirectAttributes rttr) {
		
		logger.debug("BoardVO : " + board);
		
		bservice.enroll(board);
		
		logger.debug("BoardVO : " + board);
		
		rttr.addFlashAttribute("result", "enrol success");
		
		return "redirect:/board/list";
		
	}
	
//	게시판 조회
	@GetMapping("/get")
	public void boardGetPageGET(int bno, Model model, Criteria cri) {
		
		model.addAttribute("pageInfo", bservice.getPage(bno));
		
		model.addAttribute("cri", cri);
		
	}
	
//	수정 페이지
	@GetMapping("/modify")
	public void boardModifyGET(int bno, Model model, Criteria cri) {
		
		model.addAttribute("pageInfo", bservice.getPage(bno));
		
		model.addAttribute("cri", cri);
		
	}
	
//	페이지 수정
	@PostMapping("/modify")
	public String boardModifyPOST(BoardVO board, RedirectAttributes rttr) {
		
		bservice.modify(board);
		
		rttr.addFlashAttribute("result", "modify success");
		
		return "redirect:/board/list";
		
	}
	
//	삭제
	@PostMapping("/delete")
	public String boardDeletePOST(int bno, RedirectAttributes rttr) {
		
		bservice.delete(bno);
		
		rttr.addFlashAttribute("result", "delete success");
		
		return "redirect:/board/list";
	}
	
	
}
