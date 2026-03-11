// 2114. Maximum Number of Words Found in Sentences
public class LeetCode2114 {
    public static void main(String[] args) {
        String s[]= {"alice and bob love leetcode", "i think so too", "this is great thanks very much thiru"};
        int max=0;
        for(String str: s){
            int wordCount = str.split(" ").length;
            if(wordCount>max){
                 max = wordCount;
            }
           
        }
        System.out.println(max);
    }
}
