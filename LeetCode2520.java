// 2520. Count the Digits That Divide a Number
public class LeetCode2520 {
    public int countDigits(int num) {
        int count =0;
        int orginalNum =num;
        while(num>0){
            int rem = num%10;
            num/=10;
            if(rem!=0 && orginalNum % rem==0){
                count++;
            }
            
        }
        //divide number 
        return count;
}
public static void main(String[] args) {
    LeetCode2520 obj = new LeetCode2520();
    int num = 121;
    int result = obj.countDigits(num);
    System.out.println(result); 
}
}
