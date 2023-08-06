package in.verma.app10.main;
import in.verma.app10.model.Account;
import in.verma.app10.exception.WrongLoginException;

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите Ваш логин: ");
            String loginUser = scanner.nextLine();

            Account account = new Account();
            try{
                account.checkLogin(loginUser);
                System.out.println(account.getLogin());
            } catch (WrongLoginException exception){
                exception.printStackTrace();
            }

        }
}
