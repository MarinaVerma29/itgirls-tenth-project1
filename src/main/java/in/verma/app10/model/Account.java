package in.verma.app10.model;
import in.verma.app10.exception.WrongLoginException;


public class Account {
    private String login;

    public void checkLogin(String login) throws WrongLoginException{
        if (login == null) throw new WrongLoginException("Пароль не указан");
        if (login.length() > 5 && login.length() < 20) throw new WrongLoginException("Не верная длина пароля");

        this.login = login;
    }

    public String getLogin() {
        return login; }
}
