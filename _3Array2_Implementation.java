package Stack;
import java.util.*;
public class _3Array2_Implementation {
    public static final int max = 5;
    static Scanner sc = new Scanner(System.in);
    public static int push(int S[],int top){
        int item = sc.nextInt();
        if(isFull(top)){
            System.out.println("Stack is Full");
            return top;
        }
        S[++top] = item;
        return top;
    }
    public static int pop(int S[],int top){
        if(isEmpty(top)){
            System.out.println("Stack is empty");
            return -1;
        }
        return S[top--];
        
    }
    public static void display(int S[],int top){
        for(int i = 0 ; i<=top ;i++){
            System.out.print(S[i] + " ");
        }
        System.out.println();
    }
    public static boolean isEmpty(int top){
        return top == -1;
    }
    public static boolean isFull(int top){
        return top == max-1;
    }
    public static void main(String[] args) {
        int S[] = new int[max];
        int top = -1;
        while(true){
            System.out.println("***MENU***");
            System.out.println("0: Exit");
            System.out.println("1: Push");
            System.out.println("2: Pop");
            System.out.println("3: Display");
            System.out.println("Enter your choice");
            int choice=sc.nextInt();
            switch(choice){
                case 0 : System.exit(0);
                case 1 : top = push(S, top); break;
                case 2 : pop(S, top);break;
                case 3 : display(S, top); break;
                default:
                System.out.println("Invalid choice");
            }

        }
    }
}
