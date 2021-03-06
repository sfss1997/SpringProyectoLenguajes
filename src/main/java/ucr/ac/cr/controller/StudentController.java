package ucr.ac.cr.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ucr.ac.cr.project.*;
import ucr.ac.cr.service.StudentService;

import java.util.List;


@RestController
@CrossOrigin
public class StudentController {

    @Autowired
    private StudentService service;

    @RequestMapping(path = "/Student/Add", method = RequestMethod.POST)
    public void AddStudent(@RequestBody StudentDTO student){ service.AddStudent(student);}

    @RequestMapping(path = "/Student/Update", method = RequestMethod.PUT)
    public void UpdateStudent(@RequestBody StudentDTO student){ service.UpdateStudent(student);}

    @DeleteMapping("/Student/Delete")
    public void DeleteStudent(@RequestParam(value = "id") Integer Id){ service.DeleteStudent(Id);}

    @PostMapping("/Student/AddCourse")
    public void AddStudentCourse(@RequestBody UserCourseDTO StudentCourse) {service.AddStudentCourse(StudentCourse);}

    @PutMapping("/Student/UpdateImage")
    public void UpdateImage(@RequestBody ImageDTO Image){ service.UpdateImage(Image);}

    @PostMapping("/Student/AddSocialNetwork")
    public void AddSocialNetwork(@RequestBody SocialNetworkDTO SocialNetwork) {service.addSocialNetwork(SocialNetwork);}

    @PutMapping("/Student/Approval")
    public void Approval(@RequestBody GetStudentByIdResult getStudentByIdResult){ service.StudentApproval(getStudentByIdResult);}

    @PutMapping("/Student/Deny")
    public void Deny(@RequestBody GetStudentByIdResult getStudentByIdResult){ service.StudentDeny(getStudentByIdResult);}

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
    public List<GetSocialNetworksByIdResult> GetSocialNetworksByIdStudent(@RequestParam(value = "id") Integer id) {return service.GetSocialNetworksByIdStudent(id);}




}
