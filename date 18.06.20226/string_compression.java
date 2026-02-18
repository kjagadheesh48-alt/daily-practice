import java.util.Arrays;
class string_compression {
    static boolean iscompressible(char[] s1, char[] s2)
    {
        int n1=s1.length;
        int n2=s2.length;
        if(n1!=n2)
        {
            return false;
        }
        Arrays.sort(s1);
        Arrays.sort(s2);
        for(int i=0;i<n1;i++)
        {
            if(s1[i]!=s2[i])
            {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args){
        char[] s1={'a','b','c','d'};
        char[] s2={'e','c','b','a'};
        if(iscompressible(s1,s2)){
            System.out.println("The strings are compressible");
        }
        else{
            System.out.println("The strings are not compressible");
        }
    }
}