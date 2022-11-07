package com.example.blockchainApp.repositories;

import com.example.blockchainApp.models.Response;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface ResponseRepository extends JpaRepository<Response, Long> {

    @Query
    Stream<List<Response>> findByQuestionId(long questionId);
}
