package com.bmw.board.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticeBoardController {

	@RequestMapping("/board/noticeBoard")
	public String home() {
		return "Hello, noticeBoard!";
	}
	
}
