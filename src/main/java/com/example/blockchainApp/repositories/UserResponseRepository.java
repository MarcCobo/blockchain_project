package com.example.blockchainApp.repositories;

import com.example.blockchainApp.models.UserResponse;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.stream.Stream;

@Repository
public interface UserResponseRepository extends JpaRepository<UserResponse, Long> {

    @Query
    Stream<List<UserResponse>> findByQuestionId(long questionId);

    @Query
    Stream<List<UserResponse>> findByResponseId(long responseId);

    @Query
    Stream<List<UserResponse>> findByUserId(long questionId);
}
