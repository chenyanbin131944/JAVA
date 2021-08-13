import java.util.Scanner;


public class scanner {
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);//从键盘输入
System.out.println("plese enter num1:");
    int num=sc.nextInt();
    System.out.println("plese enter num2:");
    int num1=sc.nextInt();
    System.out.println("plese enter num3:");
    int num2=sc.nextInt();
     //String str=sc.next();
    System.out.println("输入数字:"+"num1:"+num+"num2:"+num1+"num3:"+num2);
    int temp=num>num1?num:num1;
    int max=temp>num2?temp:num2;
    System.out.println("maax:"+max);

    //System.out.println("输入字符串"+str);
  }
}
