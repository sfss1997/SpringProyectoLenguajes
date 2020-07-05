package ucr.ac.cr.project;

public class Email {

    private String to;
    private String subject;
    private String body;
    private String html;

    public Email() {
    }

    public Email(String to, String subject, String body, String html) {
        this.to = to;
        this.subject = subject;
        this.body = body;
        this.html = html;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getTo() {
        return to;
    }

    public String getSubject() {
        return subject;
    }

    public String getBody() {
        html="<!DOCTYPE html>\n" +
                "<html lang='en'>\n" +
                "<head>\n" +
                "    <meta charset='utf-8'>\n" +
                "    <title></title>\n" +
                "    <link rel='stylesheet' href='https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css' integridad='SHA384-ggOyR0iXCbMQv3Xipma34MD + dH / 1fQ784 / j6cY / iJTQUOhcWr7x9JvoRxT2MZw1T' crossorigin='anónimo'>\n" +
                "</head>\n" +
                "\n" +
                "<body style='background-color:lightgray;'>\n" +
                "    <br>\n" +
                "    <h5 style='margin: 33; padding: 0; '>Informática Empresarial</h5>\n" +
                "    <br>\n" +
                "    <p style='margin: 33; padding: 0; '>"+body+"</p>\n" +
                "\n" +
                "    <br><br><br><br><br><br>\n" +
                "    <table style='max-width:600px;'>\n" +
                "        <tr>\n" +
                "            <th>\n" +
                "                <div class='pre' style='margin: 33; padding: 0; '>\n" +
                "                    Universidad de Costa Rica<br>\n" +
                "                    Sede del Atlántico<br>\n" +
                "                    Recinto Paraíso<br>\n" +
                "                </div>\n" +
                "            </th>\n" +
                "            <th>\n" +
                "                <img src='https://medios.ucr.ac.cr/plantillas/ucr_4/imagenes/firma-ucr-ico.png' height='100' width='200' style='float:right'>\n" +
                "            </th>\n" +
                "        </tr>\n" +
                "    </table>\n" +
                "    <div class='pre' style='margin: 33; padding: 0; '>\n" +
                "        Para consultas o mas información ingrese a la direción www.ucr.ac.cr\n" +
                "    </div>\n" +
                "</body>\n" +
                "</html>";
        return html;
    }
}
