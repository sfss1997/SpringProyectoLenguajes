package ucr.ac.cr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucr.ac.cr.project.*;
import ucr.ac.cr.repository.StudentRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public void AddStudent(StudentDAO student){ repository.addStudent(student.getId(),student.getUsername(),student.getPassword(),student.getIsAdministrator(),student.getStatus(),student.getStudentCard(),student.getStudentName(),student.getLastName(), student.getBirthday(),student.getMail(),student.getImage(),student.getRegistrationStatus(), student.getProvinceId(),student.getCantonId(),student.getDistrictId());}

    public void UpdateStudent(StudentDAO student){ repository.updateStudent(student.getId(),student.getUsername(),student.getPassword(),student.getIsAdministrator(),student.getStatus(),student.getStudentCard(),student.getStudentName(),student.getLastName(), student.getBirthday(),student.getMail(),student.getImage(),student.getRegistrationStatus(), student.getProvinceId(),student.getCantonId(),student.getDistrictId());}

    public List<SelectStudentResult> ListAllStudents() {
        return repository.ListAllStudents();
    }

    public GetStudentByIdResult getStudentById(int Id) { return repository.getStudentById(Id); }

    public List<StudentApprovalResult> ListStudentApproval() { return repository.ListStudentApproval(); }

    public void UpdateStudentStatus(StudentStatusDAO StudentStatus){ repository.UpdateStudentStatus(StudentStatus.getId(),StudentStatus.getRegistrationStatus());}

    public void DeleteStudent(int Id){ repository.DeleteStudent(Id);}

    public List<ListStudentResult> ListStudents() { return repository.ListStudents(); }

    public void addSocialNetwork(SocialNetworkDAO SocialNetwork)
    {repository.addSocialNetwork(SocialNetwork.getId(),SocialNetwork.getUserId(),SocialNetwork.getUrl(),SocialNetwork.getSocialNetworksNameId());}

    public void AddStudentCourse(UserCourseDAO StudentCourse) {repository.AddStudentCourse(StudentCourse.getUserId(),StudentCourse.getCourseId());}

    public List<GetNameSocialNetworksResult> ListSocialNetworksCatalog() {return repository.ListSocialNetworksCatalog();}

    public List<GetSocialNetworksByIdResult> GetSocialNetworksByIdStudent(int Id) {return repository.GetSocialNetworksByIdStudent(Id);}

    public void UpdateImage(ImageDAO Image){ repository.UpdateImage(Image.getImage(),Image.getId());}



}
