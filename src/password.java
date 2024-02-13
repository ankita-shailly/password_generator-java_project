import java.util.Scanner;
import java.util.Random ;
public class password {
    public static void main(String[] args) {
        Random random=new Random();
        int rn=random.nextInt(100)+1;
        int rs=random.nextInt(94)+33;
        char crs=(char)rs;
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the gender m/f");
        String gender=sc.next();
        System.out.println("enter the age,");
        int age= sc.nextInt();
        System.out.println("enter the city");
        String city= sc.next();
        System.out.println("enter the name");
        String name= sc.next();
        if(age<18 && gender.equals("f")){
            System.out.println("password is "+"#"+rn+name.substring(0,3)+"^"+crs+age+"&"+city.substring(city.length()-3));
        }
        else if (gender.equals("f")&& age>18) {
            System.out.println("password is "+crs+name.substring(name.length()-3)+"*"+rn+city.substring(0,3)+";"+age);
        } else{
            System.out.print(rn+"*");
            for(int i=0;i<name.length() || i<city.length();i++){
                if(i<name.length()){
                    System.out.print(name.charAt(i));
                }
                if(i<city.length()){
                    System.out.print(city.charAt(i));
                }
            }
            if(age%2==0){
                System.out.print("#"+age);
            }
            else {
                System.out.print("<"+age);
            }
            System.out.println(":"+crs);
        }
    }
}

