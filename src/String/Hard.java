//package String;
//
////T5h6is i4s first t2es3t
//
//// 11-this
////4-is
////1-first
////5-test
////public class Hard {
////    public static void main(String[] args) {
//////        String s="56";
//////        System.out.println(Integer.parseInt(s));
////
////    }
////}
//public class StringProgram {
//    public static void main(String[] args) {
//        String input = "T5h6is i4s first t2es3t";
//        String[] words = input.split(" ");
//        int sum=0;
//
//        for (String word : words) {
//            StringBuilder numPart = new StringBuilder();
//            StringBuilder charPart = new StringBuilder();
//
//            for (char c : word.toCharArray()) {
//                if (Character.isDigit(c))
//                {
//                    numPart.append(sum+c);
//
//                }
//                else
//                {
//                    charPart.append(c);
//                }
//            }
//
//            if (numPart.length() > 0 && charPart.length() > 0) {
//                int num = Integer.parseInt(numPart.toString());
//                System.out.print(num + "-" + charPart + " ");
//            }
//        }
//    }
//}