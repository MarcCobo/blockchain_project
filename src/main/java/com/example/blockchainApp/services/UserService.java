//package com.example.blockchainApp.services;
//
//import com.example.blockchainApp.models.User;
//import com.example.blockchainApp.repositories.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//@Service
//public class UserService {
//
//    @Autowired
//    private UserRepository repository;
//
//    @Transactional
//    public List<User> getAllUsers() {
//        return repository.findAll();
//    }
//
//    @Transactional
//    public User getUserById(Long id) {
//        return repository.findById(id).get();
//    }
//    // Returns null if the email doesn't exist
//    // else, return the email
//
//
//    @Transactional
//    public String emailExists(String email) {
//        if (email != null) {
//            User user = repository.findUserByEmail(email);
//            if (user != null) {
//                return email;
//            }
//        }
//        return null;
//    }
//
//    @Transactional
//    public User createUser(User user){
//        repository.save(user);
//        return user;
//    }
//
//
//}
