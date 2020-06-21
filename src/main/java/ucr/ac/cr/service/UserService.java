package ucr.ac.cr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucr.ac.cr.project.Users;
import ucr.ac.cr.repository.UserRepository;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepository repository;
    public List<Users> getAllStudents() { return repository.getAllUsers(); }
}
