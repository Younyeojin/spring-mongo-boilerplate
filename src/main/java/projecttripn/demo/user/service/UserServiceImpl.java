package projecttripn.demo.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import projecttripn.demo.user.entity.User;
import projecttripn.demo.user.repository.UserRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }
    public List<User> findAllByName(String name){
        return userRepository.findAllByName(name);
    }
}
