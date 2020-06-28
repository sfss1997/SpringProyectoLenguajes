package ucr.ac.cr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucr.ac.cr.project.*;
import ucr.ac.cr.repository.*;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;
    private AllStudentsRepository allStudentRepository;
    private StudentByIdRepository studentByIdRepository;
    private StudentApprovalRepository studentApprovalRepository;
    private ListStudentsRepository listStudentsRepository;
    private SocialNetworkCatalogRepository socialNetworkCatalogRepository;
    private SocialNetworksStudentRepository socialNetworksStudentRepository;

    public void AddStudent(StudentDAO student){ studentRepository.addStudent(student.getId(),student.getUsername(),student.getPassword(),student.getIsAdministrator(),student.getStatus(),student.getStudentCard(),student.getStudentName(),student.getLastName(), student.getBirthday(),student.getMail(),student.getImage(),student.getRegistrationStatus(), student.getProvinceId(),student.getCantonId(),student.getDistrictId());}

    public void UpdateStudent(StudentDAO student){ studentRepository.updateStudent(student.getId(),student.getUsername(),student.getPassword(),student.getIsAdministrator(),student.getStatus(),student.getStudentCard(),student.getStudentName(),student.getLastName(), student.getBirthday(),student.getMail(),student.getImage(),student.getRegistrationStatus(), student.getProvinceId(),student.getCantonId(),student.getDistrictId());}

    public List<SelectStudentResult> ListAllStudents() {
        return allStudentRepository.ListAllStudents();
    }

    public GetStudentByIdResult getStudentById(int Id) { return studentByIdRepository.getStudentById(Id); }

    public List<StudentApprovalResult> ListStudentApproval() { return studentApprovalRepository.ListStudentApproval(); }

    public void UpdateStudentStatus(StudentStatusDAO StudentStatus){ studentRepository.UpdateStudentStatus(StudentStatus.getId(),StudentStatus.getRegistrationStatus());}

    public void DeleteStudent(int Id){ studentRepository.DeleteStudent(Id);}

    public List<ListStudentResult> ListStudents() { return listStudentsRepository.ListStudents(); }

    public void addSocialNetwork(SocialNetworkDAO SocialNetwork)
    {
        studentRepository.addSocialNetwork(SocialNetwork.getId(),SocialNetwork.getUserId(),SocialNetwork.getUrl(),SocialNetwork.getSocialNetworksNameId());}

    public void AddStudentCourse(UserCourseDAO StudentCourse) {
        studentRepository.AddStudentCourse(StudentCourse.getUserId(),StudentCourse.getCourseId());}

    public List<GetNameSocialNetworksResult> ListSocialNetworksCatalog() {return socialNetworkCatalogRepository.ListSocialNetworksCatalog();}

    public List<GetSocialNetworksByIdResult> GetSocialNetworksByIdStudent(int Id) {return socialNetworksStudentRepository.GetSocialNetworksByIdStudent(Id);}

    public void UpdateImage(ImageDAO Image){ studentRepository.UpdateImage(Image.getImage(),Image.getId());}



}
