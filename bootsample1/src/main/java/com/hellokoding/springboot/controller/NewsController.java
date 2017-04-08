package com.hellokoding.springboot.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.hellokoding.springboot.model.News;
import com.hellokoding.springboot.model.NewsDAO;
@Controller
public class NewsController {

	@RequestMapping("/addnews")
	  @ResponseBody
	  public String create(String title, String content) {
	    News news = null;
	    try {
	      news = new News(title, content);
	      NewsDAO.AddNews(title,content);
	    }
	    catch (Exception ex) {
	      return "Error " + ex.toString();
	    }
	    return "User succesfully created!";
	}
	@RequestMapping("/shownews")
	  @ResponseBody
	  public void shownews() {
		News news=null;
	    try {
	      news = NewsDAO.ShowNews();
	    }
	    catch (Exception ex) {

	    }
	  
	}
	@Autowired
	private NewsDAO NewsDAO;
}
