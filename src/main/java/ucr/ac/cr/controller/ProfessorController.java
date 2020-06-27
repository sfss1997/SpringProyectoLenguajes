package ucr.ac.cr.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ucr.ac.cr.project.*;
import ucr.ac.cr.service.ProfessorService;


import java.util.List;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    //YAAA
    @GetMapping("/Professor/Add")
    public void AddProfessor(@RequestBody ProfessorDAO Professor){service.AddProfessor(Professor);}

    //YAAA
    @GetMapping("/Professor/Update")
    public void UpdateProfessor(@RequestBody ProfessorDAO Professor){service.UpdateProfessor(Professor);}

    //YAAA
    @GetMapping("/Professor/Delete")
    public void DeleteProfessor(@RequestParam(value = "id") Integer Id){service.DeleteProfessor(Id);}

    //YAAA
    @GetMapping("/Professor/addSocialNetwork")
    public void addSocialNetwork(@RequestBody SocialNetworkDAO SocialNetwork){service.addSocialNetwork(SocialNetwork);}

    //YAAA
    @GetMapping("/Professor/AddCourse")
    public void AddProfessorCourse(@RequestBody UserCourseDAO ProfessorCourse){service.AddProfessorCourse(ProfessorCourse);}

    //YAAA
    @GetMapping("/Professor/UpdateImage")
    public void UpdateImage(@RequestBody ImageDAO Image){service.UpdateImage(Image);}


    @GetMapping("/Professor/ListAll")
    public List<SelectProfessorResult> ListAllProfessors(){return service.ListAllProfessors();}

    @GetMapping("/Professor/getById")
    public GetProfessorByIdResult getProfessorById(@RequestParam(value = "id") Integer Id){return service.getProfessorById(Id);}

    @GetMapping("/Professor/ListAcademicDegree")
    public List<SelectAcademicDegreeResult> ListAcademicDegree(){return  service.ListAcademicDegree();}

    @GetMapping("/Professor/ListSocialNetworksCatalog")
    public List<GetNameSocialNetworksResult> ListSocialNetworksCatalog(){return service.ListSocialNetworksCatalog();}

    @GetMapping("/Professor/GetSocialNetworksById")
    public List<GetSocialNetworksByIdResult> GetSocialNetworksByIdProfessor(int Id){return service.GetSocialNetworksByIdProfessor(Id);}


}
