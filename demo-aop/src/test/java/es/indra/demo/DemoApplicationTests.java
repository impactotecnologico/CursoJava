package es.indra.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import es.indra.demo.model.Blog;
import es.indra.demo.service.BlogService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {
	
	@Autowired
	BlogService blogService;

	@Test
	public void testingService() {
		this.blogService.createBlog(new Blog());
	}

}
