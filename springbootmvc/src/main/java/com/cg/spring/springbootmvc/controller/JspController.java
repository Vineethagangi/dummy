package com.cg.spring.springbootmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class JspController {
@RequestMapping("/index")
public String ahowProductByIdPage() {
	return "index";
}
}
