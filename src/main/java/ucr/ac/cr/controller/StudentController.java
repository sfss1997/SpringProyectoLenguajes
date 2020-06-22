package ucr.ac.cr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ucr.ac.cr.project.*;
import ucr.ac.cr.service.StudentService;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/AddStudent")
    public void AddStudent(int Id,String Username,String Password,int IsAdministrator,
                           String Status,String StudentCard,String StudentName,String LastName,
                           String Birthday,String Mail,String Image,String RegistrationStatus,
                           int ProvinceId,int CantonId,int DistrictId){ service.AddStudent(Id,Username,Password,IsAdministrator,Status,StudentCard,StudentName,LastName, Birthday,Mail,Image,RegistrationStatus, ProvinceId,CantonId,DistrictId);}
    @GetMapping("/UpdateStudent")
    public void UpdateStudent(int Id,String Username,String Password,int IsAdministrator,
                              String Status,String StudentCard,String StudentName,String LastName,
                              String Birthday,String Mail,String Image,String RegistrationStatus,
                              int ProvinceId,int CantonId,int DistrictId){ service.UpdateStudent(Id,Username,Password,IsAdministrator,Status,StudentCard,StudentName,LastName, Birthday,Mail,Image,RegistrationStatus, ProvinceId,CantonId,DistrictId);}

    @GetMapping("/ListAllStudents")
    public List<SelectStudentResult> ListAllStudents() {
        return service.ListAllStudents();
    }

    @GetMapping("/getStudentById")
    public GetStudentByIdResult getStudentById(@RequestParam(value = "id") Integer id) { return service.getStudentById(id); }

    @GetMapping("/ListStudentApproval")
    public List<StudentApprovalResult> ListStudentApproval() { return service.ListStudentApproval(); }

    @GetMapping("/UpdateStudentStatus")
    public void UpdateStudentStatus(int Id,int RegistrationStatus){ service.UpdateStudentStatus(Id,RegistrationStatus);}

    @GetMapping("/DeleteStudent/{id}")
    public void DeleteStudent(int Id){ service.DeleteStudent(Id);}

    @GetMapping("/ListStudents")
    public List<ListStudentResult> ListStudents() { return service.ListStudents(); }

    @GetMapping("/AddSocialNetwork")
    public void AddSocialNetwork(int Id, int StudentId, String Url, int SocialNetworksNameId)
    {service.addSocialNetwork(Id,StudentId,Url,SocialNetworksNameId);}

    @GetMapping("/AddStudentCourse")
    public void AddStudentCourse(int StudentId, int CourseId) {service.AddStudentCourse(StudentId,CourseId);}

    @GetMapping("/ListSocialNetworksCatalog")
    public List<GetNameSocialNetworksResult> ListSocialNetworksCatalog() {return service.ListSocialNetworksCatalog();}

    @GetMapping("/GetSocialNetworksByIdStudent")
    public List<GetSocialNetworksByIdStudentResult> GetSocialNetworksByIdStudent(int Id) {return service.GetSocialNetworksByIdStudent(Id);}

    @GetMapping("/UpdateImage")
    public void UpdateImage(String Image, int Id){ service.UpdateImage(Image,Id);}

}
