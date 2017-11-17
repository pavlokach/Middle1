import java.util.ArrayList;
import java.util.List;

public class MailBox{
    private List<MailInfo> infos = new ArrayList<MailInfo>();

    public List<MailInfo> getInfos() {
        return infos;
    }

    void addMailInfo(MailInfo inputMailInfo) {
        infos.add(inputMailInfo);
    }

    void sendAll(){
        for (MailInfo currentMailInfo: infos
             ) {
            new MailSender().sendMail(currentMailInfo);
        }
    }

}
