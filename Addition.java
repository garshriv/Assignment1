public class Addition {
  
  public static void main(String args[]) {
 
       int x=10;
       
       int y=50;

        
       System.out.println("Sum of x+y = " + add(x,y));
    
  }
    
  public static int add(int a, int b){

        if(b == 0) return a;

        int sum = a ^ b; //SUM of two integer is A XOR B

        int carry = (a & b) << 1;  //CARRY of two integer is A AND B

        return add(sum, carry);

    }



}
