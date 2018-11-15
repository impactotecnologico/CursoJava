package es.indra.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import es.indra.demo.model.Blog;
import es.indra.demo.service.BlogService;

@RestController
public class BlogController {
	
	@Autowired
	BlogService blogService;
	
	@RequestMapping(value="/blog", method=RequestMethod.GET)
	public ResponseEntity<List<Blog>> getAllBlogs(){
		return new ResponseEntity<List<Blog>>(blogService.getAllBlogs(), HttpStatus.OK);
	}
	
	@RequestMapping(value="/blog", method=RequestMethod.POST)
	public ResponseEntity<Void> createBlog(@RequestBody Blog b){
		this.blogService.createBlog(b);
		return new ResponseEntity<Void>(HttpStatus.CREATED);
	}
	

}
