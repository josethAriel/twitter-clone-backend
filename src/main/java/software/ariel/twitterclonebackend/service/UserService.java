package software.ariel.twitterclonebackend.service;

import org.springframework.stereotype.Service;
import software.ariel.twitterclonebackend.entity.User;
import software.ariel.twitterclonebackend.repository.UserRepository;

import java.time.LocalDate;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void addNewUser(String name, String email, int year, int month, int day) {
        User user = new User(name, email, LocalDate.of(year, month, day));
        userRepository.save(user);
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }

}
