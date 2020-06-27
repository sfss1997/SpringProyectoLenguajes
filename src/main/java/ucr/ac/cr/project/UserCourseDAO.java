package ucr.ac.cr.project;

public class UserCourseDAO {

    private int UserId;
    private int CourseId;

    public UserCourseDAO() {

    }

    public UserCourseDAO(int userId, int courseId) {
        UserId = userId;
        CourseId = courseId;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public int getCourseId() {
        return CourseId;
    }

    public void setCourseId(int courseId) {
        CourseId = courseId;
    }
}
