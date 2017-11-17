public class MailSender {
    MailInfo mailInfo ;

    public MailInfo getMailInfo() {
        return mailInfo;
    }
    public void setMailInfo(MailInfo mailInfo){
        this.mailInfo = mailInfo;
    }

    public void sendMail(MailInfo mailInfo){
        mailInfo.toStr();
    }
}