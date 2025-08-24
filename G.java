import java.util.Scanner;
class G{
    static Scanner sc = new Scanner(System.in);
    static int[] inputVal(){
        System.out.println("How many values you want to add : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter "+(i+1)+" :");
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    static int sum(int... a){
        int sum = 0;
        for(int next : a){
            sum+=next;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("#################");
        int[] a = inputVal();
        int sum = sum(a);
        System.out.println("Sum is : "+ sum);
    }
}