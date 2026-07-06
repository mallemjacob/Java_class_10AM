
// Given a string, return a new string where the first and last chars have been exchanged.


// public String frontBack(String str) {
//     String myStr = str;
//     // char result1 = myStr.charAt(0);
//     // char result2 = myStr.charAt(myStr.length() - 1);
//     // System.out.println(result1);
//     // System.out.println(result2);
    
//     // System.out.println(myStr.substring(1, myStr.length()-1));
    
//     // System.out.println(myStr.charAt(myStr.length() - 1) + myStr.substring(1, myStr.length()-1) + myStr.charAt(0));
    
//     if (myStr.length() > 1){
//       return myStr.charAt(myStr.length() - 1) + myStr.substring(1, myStr.length()-1) + myStr.charAt(0);    
//     } else {
//       return myStr;
//     }
// }


// frontBack("code") → "eodc"
// frontBack("a") → "a"
// frontBack("ab") → "ba"