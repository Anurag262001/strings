class StringPalindrome{
    public static void main(String[] args) {
        String str = "mom";
        String str2 = str;
        String rev  = "";
        for(int i=str.length()-1;i>=0;i--){
            rev = rev+str.charAt(i);
        }
        System.out.println(rev);
        if(str2.equals(rev)){
            System.out.println("palindorme");
        }else{
            System.out.println("not the palindorme");
        }
    }
}