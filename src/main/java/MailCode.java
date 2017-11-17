import java.text.MessageFormat;

public enum MailCode {
    SPAM, COMMERCIAL, WORK;


    public String getTemplate() {

        switch (this) {
            case SPAM:
                return  "please click.";
            case COMMERCIAL:
                return " please buy.";
            case WORK:
                return "please work.";
        }
        return "Error";
    }
}
