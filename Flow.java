//keira 
//flow control assignment 
//for mr gross
public class Flow {
    public static void main(String[] args){
       int sum=0;
        for(int x=1;x<101;x++){//this is a loop that count 1-100
           sum=sum+x;
            System.out.print(x);
            if ((x%2)==1) {// this checks for even and odd numbers
              System.out.println(" odd");
            }else{
                System.out.println(" even"); 
            }


        }
        System.out.print("the sum is "+sum);



    }
}
