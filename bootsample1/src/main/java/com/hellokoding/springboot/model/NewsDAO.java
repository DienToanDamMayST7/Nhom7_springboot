package com.hellokoding.springboot.model;
import javax.transaction.Transactional;

import org.springframework.data.repository.CrudRepository;
public interface NewsDAO extends CrudRepository<News, Long>{
	public News AddNews(String title,String content);
	public News ShowNews();
}
