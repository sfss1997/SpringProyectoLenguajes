package ucr.ac.cr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import ucr.ac.cr.project.*;
import ucr.ac.cr.repository.ProfessorRepository;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProfessorService {
    @Autowired
    private ProfessorRepository repository;

    public void AddProfessor(ProfessorDAO Professor){repository.addProfessor(Professor.getId(),Professor.getUsername(),Professor.getPassword(),Professor.getIsAdministrator(),Professor.getStatus(),Professor.getName(),Professor.getLastName(),Professor.getMail(),Professor.getImage(),Professor.getProvinceId(),Professor.getCantonId(),Professor.getDistrictId(),Professor.getAcademicDegree());}

    public void UpdateProfessor(ProfessorDAO Professor){repository.UpdateProfessor(Professor.getId(),Professor.getUsername(),Professor.getPassword(),Professor.getIsAdministrator(),Professor.getStatus(),Professor.getName(),Professor.getLastName(),Professor.getMail(),Professor.getImage(),Professor.getProvinceId(),Professor.getCantonId(),Professor.getDistrictId(),Professor.getAcademicDegree());}

    public List<SelectProfessorResult> ListAllProfessors(){return repository.ListAllProfessors();}

    public GetProfessorByIdResult getProfessorById(int Id){return repository.getProfessorById(Id);}

    public void DeleteProfessor(int Id){repository.DeleteProfessor(Id);}

    public List<SelectAcademicDegreeResult> ListAcademicDegree(){return  repository.ListAcademicDegree();}

    public void addSocialNetwork(SocialNetworkDAO SocialNetwork){repository.addSocialNetwork(SocialNetwork.getId(),SocialNetwork.getUserId(),SocialNetwork.getUrl(),SocialNetwork.getSocialNetworksNameId());}

    public void AddProfessorCourse(UserCourseDAO ProfessorCourse){repository.AddProfessorCourse(ProfessorCourse.getUserId(),ProfessorCourse.getCourseId());}

    public List<GetNameSocialNetworksResult> ListSocialNetworksCatalog(){return repository.ListSocialNetworksCatalog();}

    public List<GetSocialNetworksByIdResult> GetSocialNetworksByIdProfessor(int Id){return repository.GetSocialNetworksByIdProfessor(Id);}

    public void UpdateImage(ImageDAO Image){repository.UpdateImage(Image.getImage(),Image.getId());}
}
