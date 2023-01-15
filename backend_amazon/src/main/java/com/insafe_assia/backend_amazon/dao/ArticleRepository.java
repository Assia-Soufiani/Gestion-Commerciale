package com.insafe_assia.backend_amazon.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.insafe_assia.backend_amazon.model.Article;


public interface ArticleRepository extends JpaRepository<Article,Integer>{

}
