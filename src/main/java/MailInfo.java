import java.text.MessageFormat;

public class MailInfo {
    private Client client;
    private String mailCode;

    public MailInfo(Client client, String mailCode) {
        this.client = client;
        this.mailCode = mailCode.toString();
    }

    public Client getClient() {
        return client;
    }

    public String getMailCode() {
        return mailCode;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public void setMailCode(String mailCode) {
        this.mailCode = mailCode;
    }


    public void toStr() {
        System.out.printf("Dear %s %s , of age %s and of sex %s.\n Please ...", client.getName(), client.getSurname(), client.getAge(), client.getSex(), mailCode);
    }
}

