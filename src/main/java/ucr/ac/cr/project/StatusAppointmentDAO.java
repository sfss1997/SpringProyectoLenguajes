package ucr.ac.cr.project;

public class StatusAppointmentDAO {

    private int AppointmentId;
    private int Accepted;

    public StatusAppointmentDAO() {
    }

    public StatusAppointmentDAO(int appointmentId, int accepted) {
        AppointmentId = appointmentId;
        Accepted = accepted;
    }

    public int getAppointmentId() {
        return AppointmentId;
    }

    public void setAppointmentId(int appointmentId) {
        AppointmentId = appointmentId;
    }

    public int getAccepted() {
        return Accepted;
    }

    public void setAccepted(int accepted) {
        Accepted = accepted;
    }
}
