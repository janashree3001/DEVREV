import java.util.Scanner;
public class view_place_book {
    int delhi=0;
    int chennai=0;
    int trichi=0;
public void booking(String location){
    Scanner scan = new Scanner (System.in);
    booking_count_for_each_location books = new booking_count_for_each_location();
    if(location=="chennai"){
        System.out.println("delhi has"+" "+delhi+" "+"bookings");
        System.out.println("wanna book??");
        String choice = scan.nextLine();
        if(choice.equals("yes")){
            System.out.println("booked..... thank you");
        delhi++;
            books.datas(location, delhi);
        }
        if(choice.equals("other")){
            System.out.println("enter other location");
            location = scan.nextLine();
        }
        if(choice.equals("no")){
            System.out.println("Thank you...!!!");
        }
    }
    if(location=="cochi"){
        System.out.println("chennai has"+" "+chennai+" "+"bookings");
        System.out.println("wanna book??");
        String choice = scan.nextLine();
        if(choice.equals("yes")){
            System.out.println("booked.....thank you");
        chennai++;
        books.datas(location, chennai);
        }
        if(choice.equals("other")){
            System.out.println("enter other location");
            location = scan.nextLine();
        }
        if(choice.equals("no")){
            System.out.println("Thank you...!!!");
        }
        //chennai++;
    }
    if(location=="chennai"){
        System.out.println("chennai has"+" "+chennai+" "+"bookings");
        System.out.println("wanna book??");
        String choice = scan.nextLine();
        if(choice.equals("yes")){
            System.out.println("booked..... thank you");
        chennai++;
        books.datas(location, chennai);
        }
        if(choice.equals("other")){
            System.out.println("enter other location");
            location = scan.nextLine();
        }
        if(choice.equals("no")){
            System.out.println("Thank you...!!!");
        }
        //cudalore++;
    }
    if(delhi>5||chennai>5||chennai>5){
        System.out.println("booking closed at"+" "+location);
    }
   

}
}
