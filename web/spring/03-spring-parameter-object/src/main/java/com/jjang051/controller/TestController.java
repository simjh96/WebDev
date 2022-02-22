package com.jjang051.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.jjang051.model.BoardDto;
import com.jjang051.model.DataDto;
import com.jjang051.model.MemberDto;

@Controller
public class TestController {
	
	@GetMapping("/ParameterObject01.do")
	public String parameterObject01(@RequestParam Map<String, String> map) {
		String data01 = map.get("data01");
		String data02 = map.get("data02");
		String data03 = map.get("data03");
		System.out.println("data01==="+data01);
		System.out.println("data02==="+data02);
		System.out.println("data03==="+data03);
		return "parameterObject01";
	}

	@GetMapping("/ParameterObject02.do")
	public String parameterObject02(@ModelAttribute DataDto dataDto) {
		int data01 = dataDto.getData01();
		int data02 = dataDto.getData02();
		int[] data03 = dataDto.getData03();
		System.out.println("data01==="+data01);
		System.out.println("data02==="+data02);
		System.out.println("data03==="+data03);
		return null;
	}
	
	@GetMapping("/ParameterObject03.do")
	public String parameterObject03(MemberDto memberDto) {
		String data01 = memberDto.getId();
		System.out.println("data01==="+data01);
		return null;
	}
	@PostMapping("/ParameterObject04.do")
	public String parameterObject04(BoardDto boardDto) {
		int data01 = boardDto.getNo();
		System.out.println("data01==="+data01);
		return null;
	} 

}
