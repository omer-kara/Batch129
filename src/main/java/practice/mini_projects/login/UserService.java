package practice.mini_projects.login;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserService {

    List<String> usernameList = new ArrayList<>();
    List<String> emailList = new ArrayList<>();
    List<String> passwordList = new ArrayList<>();

    public void showMunu(){//menu gorseli olusturduk
        System.out.println("==TECHPROEDUCATION==");
        System.out.println("1-Uye ol");
        System.out.println("2-Giris Yap");
        System.out.println("3-Cikis Yap");
        System.out.println("Seciminizi giriniz");
    }
    public void register(){

        Scanner scanner = new Scanner(System.in);//kullanicidan isim aldik
        System.out.println("Ad -soyad giriniz");
        String name = scanner.nextLine();


        String username;

        boolean existUsername;//daha once boyle bir kullanici adi varmi diye sormak icin yazdik

        do {
            System.out.println("Kullanici adini giriniz");
            username=scanner.nextLine();
            existUsername = usernameList.contains(username);//burasi daha once yazilmis bir kullanici adi varsa true doner
            //boyle olursa tekrar kullanici adi girilmasei gerekirse tekrar yazmasi istenecek

            if (existUsername){
                System.out.println("Bu username daha once kullanilmistir. Yeniden giris yapiniz");
            }


        }while (existUsername);

        String email;
        boolean existEmail;
        boolean isValid;//uygun mu demek

        do {
            System.out.println("Email giriniz");
            email = scanner.nextLine();
            isValid = validateEmail(email);

            existEmail = emailList.contains(email);//exist ==> var mi?
            if (existEmail){
                System.out.println("Bu Email daha once kullanilmistir. Yeniden giris yapiniz");
                isValid=false;
            }

        }while (!isValid);

        String password;
        boolean isValidPsw;

        do {
            System.out.println("Sifre giriniz");
            password = scanner.nextLine();
            isValidPsw=validatePassword(password);

        }while (!isValidPsw);

        User user = new User(name,username,email,password);
        System.out.println(user);

        usernameList.add(username);
        emailList.add(email);
        passwordList.add(password);
        System.out.println("Tebrikler kayit islemi gerceklesti");
        System.out.println("Kullanici adi veya sifre ile giris yapabilirsiniz");



    }
    public void login(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Email yada kullanici adi giriniz");
        String usernameOrEmail = scanner.nextLine();

        boolean isEmail = emailList.contains(usernameOrEmail);
        boolean isUsername = usernameList.contains(usernameOrEmail);

        if (isEmail || isUsername){

            while (true){
                System.out.println("Sifre giriniz");
                String password = scanner.nextLine();
                int idx;

                if (isUsername){
                    idx = usernameList.indexOf(usernameOrEmail);

                }else {
                    idx = emailList.indexOf(usernameOrEmail);
                }

                if (passwordList.get(idx).equals(password)){
                    System.out.println("Sisteme giris yaptiniz!!!");
                    break;
                }else {
                    System.out.println("Sifre yanlis. Tekrar deneyiniz");
                }
            }

        }else {
            System.out.println("Sisteme kayitli kullanici bulunmadi");
            System.out.println("Bilgilerinizi kontrol ediniz veya uye olunuz");
        }

    }
    public  static  boolean validateEmail(String email){
        boolean isValid;
        boolean space = email.contains(" ");
        boolean isContainAt = email.contains("@");

        if (space){
            System.out.println("Email bosluk icermemeli");
            isValid=false;
        } else if (!isContainAt) {
            System.out.println("Email @ icermelidir");
            isValid=false;
        }else {
            String firstPart = email.split("@")[0];//Ali
            String secondPart = email.split("@")[1];//gmail.com

            boolean checkFirst = firstPart.replaceAll("[A-Za-z0-9-._]","").length()==0;
            boolean checkSecond = secondPart.equals("gmail.com")||
                                    secondPart.equals("yahoo.com")||
                                    secondPart.equals("hotmail.com");
            if (!checkFirst){
                System.out.println("sadece büyük-küçük harf,rakam yada -._ sembolleri disinda karakter icermez");
            } else if (!checkSecond) {
                System.out.println("gmail.com,hotmail.com veya yahoo.com ile bitmeli");
            }

            isValid = checkFirst && checkSecond;
        }

        return isValid;
    }
    public static boolean validatePassword(String password){

        boolean isValid;
        boolean space = password.contains(" ");
        boolean lengthGt6 = password.length()>=6;
        boolean existUpper = password.replaceAll("[^A-Z]", "").length()>0;
        boolean existLower = password.replaceAll("[^a-z]", "").length()>0;
        boolean existDigit = password.replaceAll("[^0-9]", "").length()>0;
        boolean existSymbol = password.replaceAll("[\\P{Punct}]", "").length()>0;//\P{Punct} semboller disindakiler demek

        if (space){
            System.out.println("Sifre bosluk iceremez");
        } else if (!lengthGt6) {
            System.out.println("Sifre en az 6 karakter icermelidir");
        } else if (!existUpper) {
            System.out.println("Sifre en az 1 buyuk harf icermelidir");
        } else if (!existLower) {
            System.out.println("Sifre en az 1 kucuk harf icermelidir");
        } else if (!existDigit) {
            System.out.println("Sifre en az 1 rakam icermelidir");
        } else if (!existSymbol) {
            System.out.println("Sifre en az 1 sembol icermelidir");
        }
            isValid = !space && lengthGt6 && existUpper && existLower && existDigit && existSymbol;

        return isValid;
    }


}
