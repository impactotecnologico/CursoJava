package es.indra.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;

import es.indra.demo.model.Blog;

@Service
public interface BlogService {

	List<Blog> getAllBlogs();
	
	Blog getBlogById(long id);
	
	void createBlog(Blog b);
}
