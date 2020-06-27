package ucr.ac.cr.project;

public class GetProfessorByIdCourseResult {

    private String Name;
    private String Last_name;
    private int Id;

    public GetProfessorByIdCourseResult() {
    }

    public GetProfessorByIdCourseResult(String name, String last_name, int id) {
        Name = name;
        Last_name = last_name;
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }
}
