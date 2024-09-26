import java.util.*;

public class Main{
    public static void main(String[] args){

        var sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder s1 = new StringBuilder(sc.next());
        StringBuilder s2 = new StringBuilder(sc.next());
        //입력

        //조건 1 시작 끝 같은지 확인
        if( s1.charAt(0) != s2.charAt(0) || s1.charAt(n-1) != s2.charAt(n-1) )
        { System.out.println("NO"); return; }

        //조건2 애너그램 확인
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        //초기화
        for( int i=0; i<26; i++ ){ arr1.add(0); arr2.add(0); }
        //카운팅
        for( int i=0; i<s1.length(); i++ ){
            arr1.set(s1.charAt(i)-'a', arr1.get(s1.charAt(i)-'a')+1);
            arr2.set(s2.charAt(i)-'a', arr2.get(s2.charAt(i)-'a')+1);
        }
        for( int i=0; i<26; i++ ){
            if( arr1.get(i).equals(arr2.get(i)) )
            { System.out.println("NO"); return; }
        }

        //조건 3 모음 빼고 다르면 NO
        if( !s1.toString().replaceAll("[aeiou]","").equals(s2.toString().replaceAll("[aeiou]","")) )
        { System.out.println("NO"); return; }

        System.out.println("YES");
        return;
    }
}