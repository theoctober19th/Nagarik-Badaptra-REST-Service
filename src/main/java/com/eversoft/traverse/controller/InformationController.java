package com.eversoft.traverse.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.eversoft.traverse.model.Information;
import com.eversoft.traverse.model.Office;
import com.eversoft.traverse.service.InformationService;
import com.eversoft.traverse.utility.StringUtils;

@RestController
@RequestMapping("/")
public class InformationController {
	
	@Autowired
	InformationService infoService;
	
	
	@RequestMapping(value="/info/getall", method = RequestMethod.GET)
	public List<Information> getAllInformation(@RequestParam(value="id") int id) {
		return infoService.getAllInformation(id);
	}
	
	@RequestMapping(value="/office/getinfo", method = RequestMethod.GET)
	public Office getOfficeInformation(@RequestParam(value="id") int id) {
		return infoService.getOfficeInfo(id);
	}
	
	@RequestMapping(value="/office/getall", method = RequestMethod.GET)
	public List<Office> getAllOffice() {
		return infoService.getAllOffice();
	}
}
