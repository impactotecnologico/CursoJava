package es.indra.demoblog.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import es.indra.demoblog.aspects.annotations.MedidorDeTiempo;
import es.indra.demoblog.model.Blog;
import es.indra.demoblog.repository.BlogRepository;
import es.indra.demoblog.service.BlogService;

@Component
public class BlogServiceImpl implements BlogService {

	@Autowired
	BlogRepository blogRepository;

	@MedidorDeTiempo
	@Override
	public List<Blog> getAllBlog() {
		return this.blogRepository.findAll();
	}

	@Override
	public Blog getBlogById(int id) {

		Optional<Blog> blogO = this.blogRepository.findById(id);
		if (blogO.isPresent()) {
			return blogO.get();
		} else {
			return null;
		}

	}

	@Override
	public Blog saveBlog(Blog blog) {

		return this.blogRepository.save(blog);
	}

	@Override
	public void removeBlog(Blog blog) {
		this.blogRepository.delete(blog);
	}

	@Override
	public Blog updateBlog(Blog blog) {
		if (this.getBlogById(blog.getId()) != null) {
			return this.blogRepository.save(blog);
		}
		return null;
	}

	@Override
	public boolean deleteById(int id) {
		Optional<Blog> op = this.blogRepository.findById(id);
		if (op.isPresent()) {
			Blog blog = op.get();
			this.blogRepository.delete(blog);
			return true;

		} else {
			return false;
		}

	}

}
