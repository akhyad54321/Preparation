package com.ganeshaa.leetcode.stringg;

public class S2_2109 {
    public static void main(String[] args) {
        S2_2109 app = new S2_2109();
        String addedSpaces = app.addSpaces("icodeinpython", new int[]{1, 5, 7, 9});
        System.out.println("addedSpaces = " + addedSpaces);
    }

    public String addSpaces(String str, int[] spaces) {
        int index = spaces[0];
        int j=0;
        StringBuilder value = new StringBuilder("");
        for (int i=0; i<str.length(); i++){
            if (index == i){
                 value.append(" ");
                j++;
                if (j <= spaces.length-1)
                index = spaces[j];
            }
             value.append(str.charAt(i));
        }
        return value.toString();
    }

//    public String addSpaces(String str, int[] spaces) {
//        int index = spaces[0];
//        int j = 0;
//        StringBuilder value = new StringBuilder("");
//        for (int i = 0; i < str.length(); i++) {
//            if (index == i) {
//                value.append(" ");
//                j++;
//                if (spaces.length != j)
//                    index = spaces[j];
//            }
//            value.append(str.charAt(i));
//        }
//        return value.toString();
//    }

//    public String addSpaces(String str, int[] spaces) {
//        char[] charArray = str.toCharArray();
//
//        Set<Integer> spaceIndexSet = new HashSet<>();
//        for (int spaceIndex : spaces) {
//            spaceIndexSet.add(spaceIndex);
//        }
//
//        StringBuilder resultBuilder = new StringBuilder();
//
//        for (int i = 0; i < charArray.length; i++) {
//            resultBuilder.append(charArray[i]);
//
//            if (spaceIndexSet.contains(i)) {
//                resultBuilder.append(' ');
//            }
//        }
//        return resultBuilder.toString();
//
//    }


    public String addSpaces2(String str, int[] spaces) {
        StringBuilder value = new StringBuilder("");
        int k = 0;
        for (int i = 0; i < spaces.length; i++) {
            value.append(str.substring(k, spaces[i])).append(" ");
            k = value.length() - i - 1;
        }
        value.append(str.substring(k, str.length()));
        return value.toString();
    }


//    public String addSpaces(String str, int[] spaces) {
//        List<Integer> list = new ArrayList();
//        for (int pos : spaces)-{
//            list.add(pos);
//        }
//        String target = "";
//        target = str.substring(0, list.get(0)) + " " + str.substring(list.get(0), list.get(1)) + " "+ str.substring(list.get(1), list.get(2)) + " " + str.substring(list.get(2), str.length())+ str.sub;
//        System.out.println("target = " + target);
//        return target;
//    }
//    public String addSpaces(String str, int[] spaces) {
//        List<Integer> list = new ArrayList();
//        for (int pos : spaces) {
//            list.add(pos);
//        }
//
//        String target = "";
//        for (int i = 0; i < str.length(); i++) {
//            target = target + str.charAt(i);
//            if (list.contains(i)){
//                target = target.replace(str.charAt(i), (char) 32);
//            }
//        }
//        System.out.println((char)65);
//        return target;
//
//    }

}
