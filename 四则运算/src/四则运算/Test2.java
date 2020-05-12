package 四则运算;

import java.util.Random;
import java.util.Scanner;
public class Test2 {
    public static void main(String[] args) {
        System.out.println("输入测试题数目：");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        double right = 0;
        double wrong = 0;
        for (int i = 0; i < number; i++) {
            System.out.println("第"+(i+1)+"道题,请在下方输入答案：");
            double op1=(int)(Math.random()*10);
            double op2=(int)(Math.random()*10);
            Random r3 = new Random();
            int m = r3.nextInt(4);
            char[] chs = {'+','-','*','/'};
            String Operator = String.valueOf(chs[m]);
            //生成题目
            if(Operator.equals("+")){
                System.out.println(op1+"+"+op2+"=");
                boolean b = add(op1,op2);
                if(b == true){
                    right++;System.out.println("right! ");
                }
                else{
                    wrong++;System.out.println("no ");
                    System.out.println("right answer: "+(op1+op2));
                }
            }
            else if(Operator.equals("-")){
                System.out.println(op1+"-"+op2+"=");
                boolean b =minus(op1,op2);
                if(b == true){
                    right++;System.out.println("right! ");
                }
                else{
                    wrong++;System.out.println("no ");
                    System.out.println("right answer: "+(op1-op2));
                }
            }
            else if(Operator.equals("*")){
                System.out.println(op1+"×"+op2+"=");
                boolean b =times(op1,op2);
                if(b == true){
                    right++;System.out.println("right! ");
                }
                else{
                    wrong++;System.out.println("no ");
                    System.out.println("right answer: "+(op1*op2));
                }
            }
            else{
                System.out.println(op1+"÷"+op2+"=");
                boolean b =Div(op1,op2);
                if(b == true){
                    right++;System.out.println("right! ");
                }else{
                    wrong++;System.out.println("no ");
                    System.out.println("right answer: "+op1/op2);
                }
            }
        }
        System.out.println("做对了"+right+"道题.");
        System.out.println("做错了"+wrong+"道题.");
        System.out.println("正确率为"+(right/(wrong+right))*100+"%");
    }
    private static boolean add(double x,double y) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double result = x + y;
        if(num1 == result){
            return true;
        }else{
            return false;
        }
    }
    private static boolean minus(double x,double y) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double result = x - y;
        if(num1 == result){
            return true;
        }else{
            return false;
        }
    }
    private static boolean times (double x,double y) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double result = x * y;
        if(num1 == result){
            return true;
        }else{
            return false;
        }
    }
    private static boolean Div(double x,double y) {
        Scanner sc = new Scanner(System.in);
        double num1 = sc.nextDouble();
        double result =x/y;
        if(num1 == result){
            return true;
        }else{
            return false;
        }
    }
}
