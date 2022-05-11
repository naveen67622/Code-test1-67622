package base;

import javax.lang.model.util.ElementScanner6;

// import java.util.Arrays;

// public class SortStringDemo {
// public static void main(String[] args) {
//     String st = "Paramesh";
// char ch[] =st.toCharArray();
// Arrays.sort(ch);
// String sortedStr= new String(ch);
// System.out.println(sortedStr);
// }
    
// public static void main(String[] args) {
// String str ="ZENSAR";
// String[] words = str.split(" ");
// String revString ="";
// for (int i = 0; i<words.length;i ++){
// String word = words[i];
// String revWord  =" ";

// for (int j = word.length()-1;j>=0; j--){
// revWord =revWord + word.charAt(j);
// }
// revString = revString +revWord + " ";
// }
// System.out.println(revString);

public class revString{
public static void removeChar(String s, char c) {
int j, count = 0, n= s.length();
char [] t =s.toCharArray();
for (int i = j= 0; i< n;i++){
if (t[i] != c)
t[j++] = t[i];
else 
count ++;
}
while(count > 0){
t[j++]= '\0';
count --;
}
System.out.println(t);

    
}
public static void main(String[] args) {
    String s = "String reverse";
removeChar(s, 'e');
}
    }



}
}
