package es.indra.demoblog.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import es.indra.demoblog.model.Blog;

@Repository
public interface BlogRepository extends JpaRepository<Blog, Integer> {

}
