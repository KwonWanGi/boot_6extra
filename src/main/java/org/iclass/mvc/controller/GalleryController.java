package org.iclass.mvc.controller;

import org.iclass.mvc.dto.Gallery;
import org.iclass.mvc.service.GalleryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class GalleryController {

	private GalleryService service;
	
	public GalleryController(GalleryService service) {
		this.service=service;
	}
	
	@GetMapping("/gallery")
	public void gallery(Model model) {		//화면 : 파일명은 gallery.html
		model.addAttribute("list", service.getList());
	}
	
	@PostMapping("/gallery")
	public String save(Gallery vo) {
		int count = service.save(vo);
		return "redirect:gallery";
	}
}
