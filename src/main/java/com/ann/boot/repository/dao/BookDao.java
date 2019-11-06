package com.ann.boot.repository.dao;

import java.util.List;

import com.ann.boot.entity.BookEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.repository.CrudRepository;


public interface BookDao extends CrudRepository<BookEntity, String> {
    public List<BookEntity> getByMessage(String key);

    public Page<BookEntity> getByMessage(String key, Pageable pageable);

    @Query("{\"bool\" : {\"must\" : {\"field\" : {\"name\" : \"?0\"}}}}")
    Page<BookEntity> findByName(String name, Pageable pageable);
}
