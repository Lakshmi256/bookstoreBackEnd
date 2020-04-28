package com.blbr.books.repositroy;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blbr.books.model.BooksModel;

@Repository
public interface BooksRepository extends JpaRepository<BooksModel, Long> {

}
