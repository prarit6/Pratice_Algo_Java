import java.util.Scanner;
import java.util.Arrays;
public class Main {
    static{
        System.out.println("Static block is invoked");
    }
    public static void main(String[] args) {
        NumOcc();
        Vote();
        Comp();
        loop1();
        stringLeng();
        palindrome();

    }
    public static void NumOcc(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];

        for(int i = 0;i<n;i++){
            a[i] = sc.nextInt();
        }
        System.out.println("\n");
        System.out.println(Arrays.toString(a));
        Scanner sc2 = new Scanner(System.in);
        int c = sc.nextInt();
        int count = 0;
        System.out.println("\n");
        for(int i = 0;i<n;i++){
            if(a[i] == c){
                count = count + 1;
            }
        }
        System.out.println(count);
    }

    public static void Vote(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N+1];

        Scanner sc2 = new Scanner(System.in);
        Scanner sc3 = new Scanner(System.in);
        int K = sc.nextInt();
        int count = 0;
        for(int i = 0;i<K;i++){
            int input = sc3.nextInt();
            a[input] = a[input] + 1;
        }
        System.out.println("\n");
        System.out.println(Arrays.toString(a));
    }

    public static void Comp(){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] a = new int[N+1];
        int[] b = new int[N+1];
        Scanner sc2 = new Scanner(System.in);
        for(int i = 0;i<N;i++){
            int input = sc2.nextInt();
            a[i+1] = a[i+1] + input;
        }
        System.out.println("\n");

        Scanner sc3 = new Scanner(System.in);
        for(int i = 0;i<N;i++){
            int input2 = sc3.nextInt();
            b[i+1] = b[i+1] + input2;
        }
        System.out.println("Team A:"+Arrays.toString(a));
        System.out.println("Team B:"+Arrays.toString(b));
        int countA = 0;
        int countB = 0;
        for(int i = 1;i<N+1;i++){
           if(a[i] > b[i] ){
            countA = countA + 2;
           }
           else if(b[i] > a[i]){
            countB = countB + 2;
           }
           else{
            countA = countA + 1;
            countB = countB + 1;
           }
        }
        if(countA < countB){
            System.out.println("Team 2 wins");
            System.out.printf("Score %d to %d",countB,countA);
        }
        else if(countB < countA){
            System.out.println("Team 1 wins");
            System.out.printf("Score %d to %d",countA,countB);
        }
        else{
            System.out.println("Draw game");
            System.out.printf("Score %d to %d",countA,countB);
        }
        
    }

    public static void Surface(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Height : ");
        double h = sc.nextDouble();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Width : ");
        double w = sc.nextDouble();
        double result = Math.sqrt(w*h/3600);
        System.out.println(result);

    }

    public static void loop1(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter height: ");
        int height=sc.nextInt();
        System.out.print("Enter width: ");
        int width=sc.nextInt();

       for(int i = 1;i<=height;i++){
            for(int j = 1;j<=width;j++){
            System.out.println(j + " ");
            }
            System.out.println("\n");
    }
    
    }

    public static void stringLeng(){
        Scanner sc = new Scanner(System.in);
        String str[] = new String[5];
        for(int i = 0;i<5;i++){
            str[i] = sc.nextLine();
        }
       
        String longestStr = "";
        int maxLength = 0;
        
        for(int i =0;i<5;i++){
            if(str[i].length() > maxLength){
                maxLength = str[i].length();
                longestStr = str[i];
            }
            else if(str[i].length() == maxLength){
                maxLength = str[i].length();
                longestStr = str[i];
            }
        }
        System.out.println("\n" + longestStr);
        
    }

    public static void palindrome(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String : ");
        String input = sc.nextLine();
        int x = 0, y = input.length() - 1;

        while (x<y) {
            if(input.charAt(x) != input.charAt(y)){
                System.out.println("Is not Palindrome");
                System.exit(0);
            }
            x++;
            y--;
        }
        System.out.println("Is Palindrome");

    }
}
    
