public class ArrayProgram{
        public static void main(String[] args){
    int[] counter=new int[100];
    for(int x=0;x<100;x++){
        counter[x]=x+1;
    }
    int sum=0;
     for(int x=0;x<counter.length;x++){//counter count 0-100
        sum=sum+counter[x];
         System.out.print(counter[x]);
         if ((counter[x]%2)==1) {// this checks for even and odd numbers
           System.out.println(" odd");
         }else{
             System.out.println(" even"); 
         }


     }
     System.out.print("the sum is "+sum);
    
}
}