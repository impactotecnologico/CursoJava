package es.indra.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import es.indra.demo.model.Blog;

public interface BlogRepository extends JpaRepository<Blog, Long> {

}
