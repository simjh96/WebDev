package com.jjang051.controller;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.FilenameUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import com.jjang051.model.GalleryDao;
import com.jjang051.model.GalleryDto;
import com.jjang051.util.ScriptWriter;

@Controller
public class GalleryController {
	@Autowired
	GalleryDao galleryDao;

//	@Autowired
//	GalleryDto galleryDto;

	@RequestMapping("/Insert.do")
	public String insertGallery() {

		return "insert";
	}

	@RequestMapping("/InsertProcess.do")
	public void insertProcessGallery(GalleryDto galleryDto, MultipartFile multipartFile, HttpServletRequest request,
			HttpServletResponse response) throws IOException {

		System.out.println(galleryDto);

		String originalFileName = multipartFile.getOriginalFilename();
		String extention = FilenameUtils.getExtension(originalFileName);
		String imgFolder = "C:\\galleryImage\\";
		String savedFileName = UUID.randomUUID() + "." + extention;
		File targetFile = new File(imgFolder + savedFileName);

		String context = request.getContextPath();
		String dbFileName = context + "/galleryImage/" + savedFileName;

		try {
			InputStream fileStream = multipartFile.getInputStream();
			FileUtils.copyInputStreamToFile(fileStream, targetFile);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

		galleryDto.setRealImg(originalFileName);
		galleryDto.setImg(dbFileName);
		System.out.println(galleryDto);

		int result = galleryDao.insertGallery(galleryDto);
		if (result > 0) {
			ScriptWriter.alertAndNext(response, "글 등록", "List.do");
		} else {
			ScriptWriter.alertAndBack(response, "시스템 오류입니다.");
		}
	}
	@RequestMapping("/List.do")
	public String list() {

		return "list";
	}
	
	
}
