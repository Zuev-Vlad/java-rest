package my.example.first.service;

import my.example.first.entity.UserEntity;
import my.example.first.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<UserEntity> getUsers() {
        List<UserEntity> users = new ArrayList<>();
        users = userRepository.findAll();
        return users;
    }
}
