package AppointmentApp;
//3: Randevu islemleri
/*
 2-Randevu alma/oluşturma
            -Randevu için uygun tarihler gösterilir.
            -Randevu alınmak istenen tarihin seçilmesi istenir.
            -en yakın 7 günlük takvim dolmuşsa daha sonra denenmesi istenir.
            -Geçerli bir tarih seçilmişse randevu oluşturulur ve bu tarih tarihler listesinden silinir.
 */

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AppointmentService {
    Scanner inp = new Scanner(System.in);
    //4-randevu listesi
    List<Appointment> appointments = new ArrayList<>();
    //5:tarih Listesi
    List<LocalDate> dates = new ArrayList<>();

    //6: Uygulama basladigin ertesi gunden itibaren 7 gunluk takvim olsun
    public AppointmentService() {
        LocalDate day = LocalDate.now();  //bugun icin 17.02

        for (int i = 0; i < 7; i++) {
            day = day.plusDays(1);    //18.02 (bir gun ekledik)
//            if (day.getDayOfWeek().equals(DayOfWeek.SATURDAY)){
//
//            }
            dates.add(day);     //Tarih listine yarindan itibaren ekliyoruz
        }
    }

    //7:Randevu olusturma
    public void getAppointMent() {
        //8:Randevu takvimi dolu mu?
        if (this.dates.isEmpty()) {  //isEmpty()==>bos mu?
            System.out.println("Bu hafta tum randevular dolmustur daha sonra tekrar deneyiniz!");
        } else {
            System.out.println("Lutfen isminizi giriniz");
            String name = inp.nextLine();
            System.out.println("Sayin" + name + ", randevu alabileceginiz tarihler: ");
            for (int i = 0; i < this.dates.size(); i++) {
                System.out.println((i + 1) + " - " + this.dates.get(i));
            }
            System.out.println("Randevu almak isdetiginiz tarihin numarasini giriniz:");
            int numberOfDate = inp.nextInt();
            inp.nextLine();
            //9:secilen tarih no gecerli mi?
            if (numberOfDate > 0 && numberOfDate <= this.dates.size()) {
                Appointment appointment = new Appointment(name, this.dates.get(numberOfDate - 1));
                this.appointments.add(appointment);
                System.out.println("Sayin " + name + ", Randevu tarihiniz: " + appointment.getDate());
                System.out.println("Randevu no :" + appointment.getId() + " ile randevunuzu goruntuleyebilirsiniz.");
                this.dates.remove(numberOfDate - 1);
            } else {
                System.out.println("Hatali giris!!!");
            }
        }
    }

    //10-randevu goruntuleme
    public void printAppointment() {
        System.out.println("Randevu no giriniz:");
        boolean isExist = true;
        int appNo = inp.nextInt();
        for (Appointment app : this.appointments) {
            if (app.getId() == appNo) {
                System.out.println(appNo + " nolu Randevu Bilgileri");
                System.out.println("Isim             :" + app.getName());
                System.out.println("Randevu Tarihi   :" + app.getDate());
                System.out.println("------------------------");
                isExist = true;
                break;
            } else {
                isExist = false;
            }
        }
        if (!isExist) {
            System.out.println("Randevu bulunamasi.");
        }


    }

    //11-randevu iptal etme
    public void cancelAppointment() {
        boolean isExist=true;
        System.out.println("Randevu no giriniz");
        int appNo = inp.nextInt();
        for (Appointment app : this.appointments) {
            if (app.getId() == appNo) {

                isExist = true;
                this.dates.add(app.getDate());
                this.appointments.remove(app);

                System.out.println(app.getDate()+ " tarihli randevunuz iptal edildi.");
                break;
            } else {
                isExist = false;
            }
            if (!isExist) {
                System.out.println("Randevu bulunamasi.");

            }
        }
    }
}
