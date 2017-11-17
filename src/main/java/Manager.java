public class Manager {
    public static void main(String[] args) {
        Client client = new Client("Pavlo", "Kachmar", 23, "male");
        Client client1 = new Client("Rose", "Kak", 23, "male");
        MailInfo mailInfo = new MailInfo(client, MailCode.COMMERCIAL.getTemplate());
        MailSender mailmen = new MailSender();
        MailBox mailBox = new MailBox();
        mailBox.addMailInfo(mailInfo);
        mailBox.addMailInfo(mailInfo);
        mailmen.sendMail(mailInfo);
    }
}
