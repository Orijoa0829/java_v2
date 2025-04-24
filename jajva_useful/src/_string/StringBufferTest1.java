package _string;

public class StringBufferTest1 {

    // StringBuffer <<-- 클래스를 이해하기 위해 String 의 특징을 알아보았ㄷ

    public static void main(String[] args) {

        String str1 = new String ("Hello");
        String str2 = new String ("World");

        //새로 배우는
        StringBuffer buffer1 = new StringBuffer(str1);

        System.out.println("수정 전 :" + System.identityHashCode(buffer1));
        // buffer1 의 값을 수정해 보자. 문자열 변경
        buffer1.append(str2);

        System.out.println("수정 후 :" + System.identityHashCode(buffer1));


    } // end of main
} // end of class
