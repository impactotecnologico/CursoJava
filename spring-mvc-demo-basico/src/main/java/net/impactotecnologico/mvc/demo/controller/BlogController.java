package net.impactotecnologico.mvc.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import net.impactotecnologico.mvc.demo.model.Blog;

@Controller
public class BlogController {

	@RequestMapping(path = { "/blog" }, method = RequestMethod.GET)
	public String sayHello(Model model) {

		Blog b = new Blog(1, "Titulo del Blog", "Un contenido de ejemplo");

		model.addAttribute("titulo", b.getTitulo());
		model.addAttribute("blog", b);

		return "blog";
	}
}
