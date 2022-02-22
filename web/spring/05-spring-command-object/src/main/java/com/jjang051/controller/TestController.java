package com.jjang051.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.jjang051.model.DataDto;
import com.jjang051.model.MemberDto;

@Controller
public class TestController {
	
	@PostMapping("/Test01.do")
	public String test01(DataDto dataDto) {
		return "test01";
	}
	
	@PostMapping("/MemberTest.do")
	public String memberTest(MemberDto memberDto) {
		System.out.println("data01==="+memberDto.getNo());
		return "member";
	}

}
