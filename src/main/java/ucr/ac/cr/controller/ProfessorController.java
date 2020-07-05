package ucr.ac.cr.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ucr.ac.cr.project.*;
import ucr.ac.cr.service.ProfessorService;


import java.util.List;


@RestController
@CrossOrigin
public class ProfessorController {

    @Autowired
    private ProfessorService service;

    @PostMapping("/Professor/Add")
    public void AddProfessor(@RequestBody ProfessorDTO Professor){service.AddProfessor(Professor);}

    @PutMapping("/Professor/Update")
    public void UpdateProfessor(@RequestBody ProfessorDTO Professor){service.UpdateProfessor(Professor);}

    @DeleteMapping("/Professor/Delete")
    public void DeleteProfessor(@RequestParam(value = "id") Integer Id){service.DeleteProfessor(Id);}

    @PostMapping("/Professor/addSocialNetwork")
    public void addSocialNetwork(@RequestBody SocialNetworkDTO SocialNetwork){service.addSocialNetwork(SocialNetwork);}

    @PostMapping("/Professor/AddCourse")
    public void AddProfessorCourse(@RequestBody UserCourseDTO ProfessorCourse){service.AddProfessorCourse(ProfessorCourse);}

    @PutMapping("/Professor/UpdateImage")
    public void UpdateImage(@RequestBody ImageDTO Image){service.UpdateImage(Image);}

    //falta
    @GetMapping("/Professor/ListAll")
    public List<SelectProfessorResult> ListAllProfessors(){return service.ListAllProfessors();}

    //falta
    @GetMapping("/Professor/getById")
    public GetProfessorByIdResult getProfessorById(@RequestParam(value = "id") Integer Id){return service.getProfessorById(Id);}

    //falta
    @GetMapping("/Professor/ListAcademicDegree")
    public List<SelectAcademicDegreeResult> ListAcademicDegree(){return  service.ListAcademicDegree();}

    //falta
    @GetMapping("/Professor/ListSocialNetworksCatalog")
    public List<GetNameSocialNetworksResult> ListSocialNetworksCatalog(){return service.ListSocialNetworksCatalog();}

    //falta
    @GetMapping("/Professor/GetSocialNetworksById")
    public List<GetSocialNetworksByIdResult> GetSocialNetworksByIdProfessor(@RequestParam(value = "id") Integer Id){return service.GetSocialNetworksByIdProfessor(Id);}


}
