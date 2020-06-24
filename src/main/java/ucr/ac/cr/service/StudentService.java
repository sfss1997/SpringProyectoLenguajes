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

    public void AddStudent(int Id,String Username,String Password,int IsAdministrator,
                           String Status,String StudentCard,String StudentName,String LastName,
                           String Birthday,String Mail,String Image,String RegistrationStatus,
                           int ProvinceId,int CantonId,int DistrictId){ repository.addStudent(Id,Username,Password,IsAdministrator,Status,StudentCard,StudentName,LastName, Birthday,Mail,Image,RegistrationStatus, ProvinceId,CantonId,DistrictId);}

    public void UpdateStudent(int Id,String Username,String Password,int IsAdministrator,
                           String Status,String StudentCard,String StudentName,String LastName,
                           String Birthday,String Mail,String Image,String RegistrationStatus,
                           int ProvinceId,int CantonId,int DistrictId){ repository.updateStudent(Id,Username,Password,IsAdministrator,Status,StudentCard,StudentName,LastName, Birthday,Mail,Image,RegistrationStatus, ProvinceId,CantonId,DistrictId);}

    public List<SelectStudentResult> ListAllStudents() {
        return repository.ListAllStudents();
    }

    public GetStudentByIdResult getStudentById(int Id) { return repository.getStudentById(Id); }

    public List<StudentApprovalResult> ListStudentApproval() { return repository.ListStudentApproval(); }

    public void UpdateStudentStatus(int Id,int RegistrationStatus){ repository.UpdateStudentStatus(Id,RegistrationStatus);}

    public void DeleteStudent(int Id){ repository.DeleteStudent(Id);}

    public List<ListStudentResult> ListStudents() { return repository.ListStudents(); }

    public void addSocialNetwork(int Id, int StudentId, String Url, int SocialNetworksNameId)
    {repository.addSocialNetwork(Id,StudentId,Url,SocialNetworksNameId);}

    public void AddStudentCourse(int StudentId, int CourseId) {repository.AddStudentCourse(StudentId,CourseId);}

    public List<GetNameSocialNetworksResult> ListSocialNetworksCatalog() {return repository.ListSocialNetworksCatalog();}

    public List<GetSocialNetworksByIdResult> GetSocialNetworksByIdStudent(int Id) {return repository.GetSocialNetworksByIdStudent(Id);}

    public void UpdateImage(String Image, int Id){ repository.UpdateImage(Image,Id);}



}
