package proje.AppointmentApp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//3=randevu islemleri
public class AppointmentService {
    Scanner input = new Scanner(System.in);
    //4=Randevu listesi
    List<Appointment> appointments = new ArrayList<>();
    //5-Tarih listesi
    List<LocalDate> dates = new ArrayList<>();

    //6- 7 gunluk takvim olusturduk
    public AppointmentService() {
        LocalDate day = LocalDate.now();//17/02
        for (int i = 0; i < 7; i++) {
            day = day.plusDays(1);//18/02
            dates.add(day);
        }
    }

    //7-randevu olusturma
    public void getAppointment(){
        //8-randevu takvimi dolu mu
        if(this.dates.isEmpty()){
            System.out.println("Bu hafta tüm randevular dolmuştur, daha sonra tekrar deneyiniz!");
        }else{
            System.out.println("Lütfen isminizi giriniz:");
            String name=input.nextLine();
            System.out.println("Sayın "+name+", randevu alabileceğiniz tarihler: ");
            for (int i=0;i<this.dates.size();i++){
                System.out.println((i+1)+" - "+this.dates.get(i));
            }
            System.out.println("Randevu almak istediğiniz tarihin numarasını giriniz:");
            int numberOfDate=input.nextInt();
            input.nextLine();
            //9-seçilen tarih no geçerli
            if(numberOfDate>0 && numberOfDate<=this.dates.size()){
                Appointment appointment=new Appointment(name,this.dates.get(numberOfDate-1));
                this.appointments.add(appointment);
                System.out.println("------------------------------------------------------------------------------");
                System.out.println("Sayın "+name+", Randevu tarihiniz: "+appointment.getDate());
                System.out.println("Randevu no  :"+appointment.getId()+" ile randevunuzu görüntüleyebilirsiniz.");
                System.out.println("------------------------------------------------------------------------------");
                this.dates.remove(numberOfDate-1);
            }else {
                System.out.println("Hatalı giriş!!!");
            }

        }
    }

    //10-randevu goruntuleme
    public void printAppointment() {
        System.out.println("Randevu no giriniz:");
        boolean isExist=true;
        int appNo=input.nextInt();
        input.nextLine();
        for (Appointment app:this.appointments){
            if(app.getId()==appNo){
                System.out.println("---------------------------------");
                System.out.println(appNo+" nolu Randevu Bilgileri");
                System.out.println("İsim           :"+app.getName());
                System.out.println("Randevu tarihi :"+app.getDate());
                System.out.println("---------------------------------");
                isExist=true;
                break;
            }else {
                isExist=false;
            }
        }
        if(!isExist){
            System.out.println("Randevu bulunamadı.");
        }
    }

    //11=randevu iptal etme
    public void cancelAppointment() {
        System.out.println("Randevu no giriniz");
        boolean isExist = true;
        int appNo = input.nextInt();
        input.nextLine();
        for (Appointment app : this.appointments) {
            if (app.getId() == appNo) {
                isExist = true;
                this.appointments.remove(app);
                System.out.println(app.getDate() + " tarihli randevunuz iptal edildi");
                this.dates.add(app.getDate());
                break;

            } else {
                isExist = false;
            }
        }
        if (!isExist) {
            System.out.println("Randevu bulunamadi");
        }
    }


}
