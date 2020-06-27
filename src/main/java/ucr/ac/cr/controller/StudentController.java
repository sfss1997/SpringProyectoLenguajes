package ucr.ac.cr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ucr.ac.cr.project.*;
import ucr.ac.cr.service.StudentService;

import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class StudentController {

    @Autowired
    private StudentService service;

    //YAAA
    @RequestMapping(path = "/Student/Add", method = RequestMethod.POST)
    public void AddStudent(@RequestBody StudentDAO student){ service.AddStudent(student);}

    //YAAA
    @RequestMapping(path = "/Student/Update", method = RequestMethod.POST)
    public void UpdateStudent(@RequestBody StudentDAO student){ service.UpdateStudent(student);}

    //YAAA
    @GetMapping("/Student/Delete")
    public void DeleteStudent(@RequestParam(value = "id") Integer Id){ service.DeleteStudent(Id);}

    //YAAA
    @GetMapping("/Student/AddCourse")
    public void AddStudentCourse(@RequestBody UserCourseDAO StudentCourse) {service.AddStudentCourse(StudentCourse);}

    //YAAA
    @GetMapping("/Student/UpdateImage")
    public void UpdateImage(@RequestBody ImageDAO Image){ service.UpdateImage(Image);}

    //YAAA
    @GetMapping("/Student/AddSocialNetwork")
    public void AddSocialNetwork(SocialNetworkDAO SocialNetwork)
    {service.addSocialNetwork(SocialNetwork);}

    //YAAA
    @GetMapping("/Student/UpdateStatus")
    public void UpdateStudentStatus(@RequestBody StudentStatusDAO StudentStatus){ service.UpdateStudentStatus(StudentStatus);}



    @GetMapping("/Student/ListAll")
    public List<SelectStudentResult> ListAllStudents() {
        return service.ListAllStudents();
    }

    @GetMapping("/Student/getById")
    public GetStudentByIdResult getStudentById(@RequestParam(value = "id") Integer id) { return service.getStudentById(id); }

    @GetMapping("/Student/ListApproval")
    public List<StudentApprovalResult> ListStudentApproval() { return service.ListStudentApproval(); }

    @GetMapping("/Student/List")
    public List<ListStudentResult> ListStudents() { return service.ListStudents(); }

    @GetMapping("/Student/ListSocialNetworksCatalog")
    public List<GetNameSocialNetworksResult> ListSocialNetworksCatalog() {return service.ListSocialNetworksCatalog();}

    @GetMapping("/Student/GetSocialNetworksById")
    public List<GetSocialNetworksByIdResult> GetSocialNetworksByIdStudent(int Id) {return service.GetSocialNetworksByIdStudent(Id);}




}
