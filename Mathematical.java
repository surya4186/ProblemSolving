
public class Mathematical
{
    public static boolean mathematicalExpression(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='('){
                count++;
            }else if(str.charAt(i)==')'){
                count--;
            }else if(str.charAt(i)=='+'||str.charAt(i)=='-'||str.charAt(i)=='*'||str.charAt(i)=='/'){
                if(!((str.charAt(i-1)>96 && str.charAt(i-1)<122) && (str.charAt(i+1)>96 && str.charAt(i+1)<122))){
                    return false;
                }
            }
        }
        if(count==0){
            return true;
        }
        return false;
        
        
    }
	public static void main(String[] args) {
		String str="((a+b)";
		
		if(mathematical(str)){
		    System.out.println("Valid");
		}else{
		    System.out.println("Invalid");
		}
	}
}
