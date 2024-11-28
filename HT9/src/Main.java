public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("---test1---");
        System.out.println(f1("advvda"));
        System.out.println("---test2---");
        System.out.println(f2("edavuvda"));
        System.out.println("---test3---");
        System.out.println(f3("adv da"));
        System.out.println("---test4---");
        System.out.println(f4("advva"));
        System.out.println("---test5---");
        System.out.println(f5("adnvda"));
        System.out.println("---test6---");
        System.out.println(f6( "Hi",3));
        System.out.println("---test7---");
        System.out.println(f7("Hello",'h','e'));
        System.out.println("---test8---");
        System.out.println(f8("Hello World !" ));
        System.out.println("---test9---");
        System.out.println(f9("World!" ));
        System.out.println("---test10---");
        System.out.println(f10("Hello123" ));
        System.out.println("---test11---");
        System.out.println(f11("listen", "silent" ));
        System.out.println("---test12---");
        System.out.println(f12("abc" ));
        System.out.println("---test13---");
        System.out.println(f13("abcdef", "zbcdf" ));
    }
    public static boolean f1(String s){
        for (int i = 0; i < (s.length()-1)/2; i++) {
            if(Character.compare(s.charAt(i), s.charAt(s.length()-1-i))==0){
                return false;
            }
        }
        return true;
    }
    public static int f2(String s){
        char[] litters = {'a','e','i','o','u'};
        int count = 0;
        for (int i = 0; i <s.length() ; i++) {
            for (int j = 0; j < litters.length; j++) {
                if(Character.compare(s.charAt(i),litters[j])==0){
                    count++;
                }
            }
        }
        return count;
    }
    public static String f3(String s){
    StringBuilder s1= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            s1.append(s.charAt(s.length() -1- i));
        }
        return s1.toString();
    }
    public static boolean f4(String s){
    return (s.isBlank()||s.isEmpty());
    }
    public static int f5(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)))
                count++;
        }
        return count;
    }
    public static String f6(String s,int n){
        StringBuilder s1= new StringBuilder();
        for (int j = 0; j < n; j++) {


        for (int i = 0; i < s.length(); i++) {
            s1.append(s.charAt( i));
        }}
        return s1.toString();
    }

    public static boolean f7(String s,char b,char e){
    return (Character.compare(s.charAt(0),b)==0)&&(Character.compare(s.charAt(s.length()-1),e)==0);
    }
    public static String f8(String s){
    StringBuilder s1= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
           if(Character.compare(s.charAt(i),' ')!=0)
            s1.append(s.charAt( i));
        }
        return s1.toString();
}
    public static String f9(String s){
        StringBuilder s1= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            s1.append(s.charAt( i));
            s1.append(s.charAt( i));
        }
        return s1.toString();
    }
    public static String f10(String s){
        StringBuilder s1= new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if(Character.isDigit(s.charAt(i)))
            s1.append('*');
            else  s1.append(s.charAt( i));
        }
        return s1.toString();
    }
    public static boolean f11(String s,String s1){
        for (int i = 0; i < s.length(); i++) {
           boolean f = false;
            for (int j = 0; j < s1.length(); j++) {
               if (Character.compare(s.charAt(i),s1.charAt(j))==0)
                   f = true;
            }
            if(f == false )
                return false;
        }
        return true;
    }
    public static String f12(String s){
        if (s == null || s.isEmpty()) {
            return s;
        }
        StringBuilder compressed = new StringBuilder();
        int count = 1;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                count++;
            } else {
                compressed.append(s.charAt(i - 1));
                if (count > 1) {
                    compressed.append(count);
                }
                count = 1;
            }
        }
        compressed.append(s.charAt(s.length() - 1));
            compressed.append(count);
        return compressed.length() < s.length() ? compressed.toString() : s;
    }
    public static String f13(String s,String s1){
        int m = s.length();
        int n = s1.length();
        int[][] dp = new int[m + 1][n + 1];
        int maxLength = 0;
        int endIndex = 0;
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s.charAt(i - 1) == s1.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                    if (dp[i][j] > maxLength) {
                        maxLength = dp[i][j];
                        endIndex = i - 1;
                    }
                }
            }
        }
        if (maxLength > 0) {
            return s.substring(endIndex - maxLength + 1, endIndex + 1);
        } else {
            return ""; 
        }
    }
}
