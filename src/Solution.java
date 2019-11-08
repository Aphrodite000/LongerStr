import java.util.*;

//读入一个字符串，输出字符串中最长的数字串；
//例：输入 abcd12345ed125ss123456789     输出123456789
public class Solution {
    //合法括号
    public boolean chkParenthesis(String A, int n) {
        // write code here
        Stack stack=new Stack();
        for(int i=0;i<n;i++){
            if(A.charAt(i)=='('){
                stack.push(A.charAt(i));
            }
            if(A.charAt(i)==')'){
                if(!stack.isEmpty()){
                stack.pop();
                }else {
                    return false;
                }
            }
        }
        if(stack.isEmpty()){
            return true;
        }
        return false;
    }
}
