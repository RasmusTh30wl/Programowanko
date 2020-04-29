
/*
Zadanie 1.
Napisz klasę User posiadającą prywatne pola login i password typu string. Napisz konstruktor przyjmujący obie wartości. 
Napisz metodę authorize, która przyjmie w argumentach dwa napisy i sprawdzi, czy zgadzają się z polami w klasie. 
Napisz metodę print wypisującą login i password użytkownika.
*/

package com.company;

public class User {
    protected String  login;
    protected String password;
    public User(String login, String password){
        this.login=login;
        this.password=password;

    }
    public boolean authorize(String login, String password){
        return this.login.equals(login) && this.password.equals(password);
    }
    public void print(){
        System.out.println(login+" "+password);
    }

    public String getLogin() {
        return login;
    }


    public String getPassword() {
        return password;
    }

}
