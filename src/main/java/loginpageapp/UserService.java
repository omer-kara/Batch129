package loginpageapp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//5-user objesi ilgili islemleri gerceklestiriyoruz
public class UserService {
    //6- kullanici bilgilerini tutmak icin list olusturalim.
        List<User> userList = new ArrayList<>();
        //tum metodlarda kullanicidan bilgi almak icin Scanner objesini olusturduk
        Scanner input = new Scanner(System.in);

        //7-username veya email ile kayitli useri getirme
    private User getUser(String userNameOrEmail){
        for (User user : userList             ) {
            if (user.getUsername().equals(userNameOrEmail)){
                return user;
            } else if (user.getEmail().equals(userNameOrEmail)) {
                return user;
            }
        }
        return null;        //boyle bir kullanici bulunamazsa null donderdik

    }
    //8-email validation(gecerlilik)
    private static boolean validateEmail(String email){
        boolean isValid;
        boolean isExistsSpace = email.contains(" ");    //boslukgu kontrol ettik
        boolean isContainsAt=email.contains("@");
        if (isExistsSpace==true){
            System.out.println("Email bosluk iceremez!");
            isValid=false;
        } else if (!isContainsAt) {
            System.out.println("Email @ sembolunu icermelidir");
            isValid=false;
        }else { //asd@@gmail.com00> [asd, @gmail.com]
            String firstPart=email.split("@")[0];        //@ sembolunden ikiye bolduk
            String secondPart=email.split("@")[1];        //@ sembolunden ikiye bolduk

            boolean valid = firstPart.replaceAll("[a-zA-Z0-9_.-]", "").isEmpty(); //hala gecersiz karakter var mi diye soruyoruz
            boolean checkStart = valid && firstPart.length()>0;

            boolean checkEnd = secondPart.equals("gmail.com") ||
                    secondPart.equals("hotmail.com") ||
                    secondPart.equals("yahoo.com");
            if (!checkStart){
                System.out.println("Mailin kullanici adi bolumu en az bir karakter icermelidir ve sadece kucuk-buyuk harf veya -._ icermelidir");
            }
            if (!checkEnd){
                System.out.println("email gmail.com, hotmail.com veya yahoo.com ile bitmelidir!");

            }
            isValid=checkStart && checkEnd;
        }
        if (!isValid){
            System.out.println("Tekrar deneyiniz");
        }
        return isValid;
    }
    //9-password validation
    /*password validation: boşluk içermemeli
                            : en az 6 karakter olmalı
                            : en az bir tane küçük harf içermeli
                            : en az bir tane büyük harf içermeli
                            : en az bir tane rakam içermeli
                            : en az bir tane sembol içermeli

     */
    private static boolean validatePassword(String password){//ASdf12*-
        boolean isValid;
        boolean isExistsSpace = password.contains(" ");
        boolean isLenghtGtSix = password.length()>=6;
        boolean isExistUpperLetter=password.replaceAll("[^A-Z]", "").length()>0;//AS
        boolean isExistLowerLetter=password.replaceAll("[^a-z]", "").length()>0;//df
        boolean isExistDigit=password.replaceAll("[\\D]", "").length()>0;//12       [\\D]==> rakamlar disindakini
        boolean isExistSymbol=password.replaceAll("[\\P{Punct}]", "").length()>0;   //*-       [\\P{Punct}]==> sembol disindakini
        if(isExistsSpace){
            System.out.println("Sifre bosluk iceremez");
        } else if (!isLenghtGtSix) {
            System.out.println("Sifre en az 6 karakter icermelidir");
        } else if (!isExistUpperLetter) {
            System.out.println("Sifre en az bir tane buyuk harf icermelidir");
        } else if (!isExistLowerLetter) {
            System.out.println("Sifre en az bir tane kucuk harf icermelidir");
        }else if (!isExistDigit){
            System.out.println("Sifre en az bir tane rakam icermelidir");
        } else if (!isExistSymbol) {
            System.out.println("Sifre en az bir tane sembol icermelidir");
        }
        isValid=!isExistsSpace && isLenghtGtSix && isExistUpperLetter && isExistLowerLetter && isExistDigit && isExistSymbol;
        if (!isValid){
            System.out.println("Gecersiz sifre tekrar deneyiniz");
        }

        return isValid;
    }
    public void register(){     //register==> kayit
        System.out.println("Ad ve Soyad: ");
        String name= input.nextLine();

        //10-username unique/essiz olmali
        String username = getUserName();

        //11- email unique, gecerli olmali
        String email = getEmail();

        //12-password : gecerli olmali
        String password = getPassword();

        //13-user objesi olusturalim
        User user = new User(name, username, email, password);

        //14-user'i listeye kaydetme
        this.userList.add(user);
        System.out.println("Tebrikler isleminiz basariyla gerceklestirildi");
        System.out.println("Kullanici di veya Email ve sifrenizle sisteme giris yapabilirsiniz.");

    }
    //10-a-kullanicidan username alma
    private String getUserName(){
        String username;
        boolean existsUsername;
        do {
            System.out.println("Kullanici adi giriniz");
            username=input.nextLine();
            existsUsername=getUser(username)!=null;
            if (existsUsername){
                System.out.println("Bu username kullanilmistir, farkli bir username deneyiniz.");
            }
        }while (existsUsername);

        return username;
    }
    //11-a kullanicidan email alma
    private String getEmail(){
        String email;
        boolean isValid;
        boolean existsEmail;

        do {
            System.out.println("Email giriniz");
            email=input.nextLine(); //email gecerli mi? ==> validation
            isValid = validateEmail(email); //gecerli ise unique mi?
            existsEmail = getUser(email)!=null;
            if (existsEmail){
                System.out.println("Bu Email zaten kayitli, farkli bir Email deneyiniz");
                isValid=false;
            }


        }while (!isValid);

        return email;

    }
    //12-a password olusturma
    private String getPassword(){
        String passw;
        boolean isValidPass;
        do {
            System.out.println("Sifrenizi giriniz" );
            passw=input.nextLine();
            isValidPass=validatePassword(passw);
        }while (!isValidPass);
        return passw;
    }
    //15-email veya username ile giris yapma
    public void login(){
        System.out.println("Kullanici adi veya Email giriniz:");
        String userNameOrEmail = input.nextLine();

        //16-Girilen deger ile user'i bulma
        if (getUser(userNameOrEmail)!=null){
            User user = getUser(userNameOrEmail);
            //17-user bulundu ise sifre kontrolu
            boolean isWrong=true;   //Wrong==> sifre

            System.out.println("Sifrenizi giriniz");
            String password = input.nextLine();

            //18- girilen sifre buldugumuz userin sifresi ile ayni mi?
            if (user.getPassword().equals(password)){
                System.out.println("Sisteme giris yaptiniz.");
                isWrong=false;

            }else {
                System.out.println("Sifreniz yanlis, tekrar deneyiniz");
            }
        }else {
            System.out.println("Sisteme kayitli kulanici adi veya email bulunamadi");
            System.out.println("Uyeyseniz bilgilerinizi kontrol ederk tekrar deneyiniz, uye degilseniz lutfen uye olun");
        }

    }

    public void lagin() {
    }
}
