package ucr.ac.cr.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import ucr.ac.cr.project.Location;


import java.util.List;

@Repository
public interface LocationRepository  extends JpaRepository<Location, Integer> {

    @Query(value = "GetProvinces", nativeQuery = true)
    List<Location> ListAllProvinces();

    @Query(value = "{ call GetCantonsByIdProvince(:Id)}", nativeQuery = true)
    List<Location> GetCantonsByIdProvince(@Param("Id") Integer Id);

    @Query(value = "{ call GetDistrictsByIdCanton(:Id)}", nativeQuery = true)
    List<Location> GetDistrictsByIdCanton(@Param("Id") Integer Id);

}
