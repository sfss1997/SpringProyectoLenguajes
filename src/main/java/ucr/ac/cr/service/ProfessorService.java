package ucr.ac.cr.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ucr.ac.cr.project.*;
import ucr.ac.cr.repository.*;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class ProfessorService {
    @Autowired
    private ProfessorRepository professorRepository;
    @Autowired
    private ListProfessorsRepository listProfessorsRepository;
    @Autowired
    private ProfessorByIdRepository professorByIdRepository;
    @Autowired
    private AcademicDegreeRepository academicDegreeRepository;
    @Autowired
    private SocialNetworkCatalogRepository socialNetworkCatalogRepository;
    @Autowired
    private SocialNetworksProfessorRepository socialNetworksProfessorRepository;

    public void AddProfessor(ProfessorDTO Professor){
        professorRepository.addProfessor(Professor.getId(),Professor.getUsername(),Professor.getPassword(),Professor.getIsAdministrator(),Professor.getStatus(),Professor.getName(),Professor.getLastName(),Professor.getMail(),Professor.getImage(),Professor.getProvinceId(),Professor.getCantonId(),Professor.getDistrictId(),Professor.getAcademicDegree());}

    public void UpdateProfessor(ProfessorDTO Professor){
        professorRepository.UpdateProfessor(Professor.getId(),Professor.getUsername(),Professor.getPassword(),Professor.getIsAdministrator(),Professor.getStatus(),Professor.getName(),Professor.getLastName(),Professor.getMail(),Professor.getImage(),Professor.getProvinceId(),Professor.getCantonId(),Professor.getDistrictId(),Professor.getAcademicDegree());}

    public List<SelectProfessorResult> ListAllProfessors(){return listProfessorsRepository.ListAllProfessors();}

    public GetProfessorByIdResult getProfessorById(int Id){return professorByIdRepository.getProfessorById(Id);}

    public void DeleteProfessor(int Id){
        professorRepository.DeleteProfessor(Id);}

    public List<SelectAcademicDegreeResult> ListAcademicDegree(){return  academicDegreeRepository.ListAcademicDegree();}

    public void addSocialNetwork(SocialNetworkDTO SocialNetwork){
        professorRepository.AddSocialNetwork(SocialNetwork.getId(),SocialNetwork.getUserId(),SocialNetwork.getUrl(),SocialNetwork.getSocialNetworksNameId());}

    public void AddProfessorCourse(UserCourseDTO ProfessorCourse){
        professorRepository.AddProfessorCourse(ProfessorCourse.getUserId(),ProfessorCourse.getCourseId());}

    public List<GetNameSocialNetworksResult> ListSocialNetworksCatalog(){return socialNetworkCatalogRepository.ListSocialNetworksCatalog();}

    public List<GetSocialNetworksByIdResult> GetSocialNetworksByIdProfessor(int Id){return socialNetworksProfessorRepository.GetSocialNetworksByIdProfessor(Id);}

    public void UpdateImage(ImageDTO Image){
        professorRepository.UpdateImage(Image.getImage(),Image.getId());}
}
