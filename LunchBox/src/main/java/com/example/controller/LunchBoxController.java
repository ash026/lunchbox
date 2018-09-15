package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.example.model.Tiffin;
import com.example.service.TiffinServices;

@Controller
@RequestMapping("/lunchbox")
public class LunchBoxController {

	@Autowired
	TiffinServices tiffinServices;
	
	@RequestMapping("/")
	public String sayHi() {
		System.out.println("asheesh");
		return "welcome";
	}
	
	@RequestMapping("/tiffinActivateHome")
	public String activateTiffin(Map<String, Object> model) {
		Tiffin tiffin = new Tiffin ();
		model.put("tiffin", tiffin);
		model.put("place", tiffinServices.getTiffinAddresses());
		model.put("tiffinList", tiffinServices.getTiffinTypes());
		return "addTiffin";
	}
	
	@RequestMapping(value="/tiffin", method=RequestMethod.POST)
	public String saveTiffin(@ModelAttribute("tiffin") Tiffin tiffin, Model model   ) {
		Tiffin tiff= tiffinServices.save(tiffin);
		model.addAttribute("tiffin", tiff);
		return "successful";
	}
	
	@RequestMapping("/tiffin/{id}")
	public Tiffin getTiffin(@PathVariable("id") Integer id) {
		System.out.println("id"+id);
		return tiffinServices.getTiffinDetails(id);
	}
}
