package es.indra.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.indra.demo.model.Blog;
import es.indra.demo.repository.BlogRepository;
import es.indra.demo.service.BlogService;

@Component
public class BlogServiceImpl implements BlogService {
	
	@Autowired
	BlogRepository blogRepository;

	@Override
	public List<Blog> getAllBlogs() {
		return this.blogRepository.findAll();
	}

	@Override
	public Blog getBlogById(long id) {
		return this.blogRepository.getOne(id);
	}

	@Override
	public void createBlog(Blog b) {
		System.out.println("creando blog...!");
		this.blogRepository.save(b);
		
	}

}
