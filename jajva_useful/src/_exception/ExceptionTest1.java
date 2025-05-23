package _exception;

public class ExceptionTest1 {

    public static void main(String[] args) {

        // 사용자 정의 예외 클래스 사용해 보기
        int result = 0;
        Calc2 calc2 = new Calc2();

        try {
            calc2.divide(10, 0);
        } catch (DivideByZeroException e) {
            throw new RuntimeException();
        }


    }

}

class Calc2 {

    public int divide(int n1, int n2) throws DivideByZeroException {
        int result = 0;
        try {
            result = n1 / n2;
        } catch (Exception e) {
            //사용자 정의 예외 클래스를 사용

            throw new DivideByZeroException("0을 입력하지 마세요!");
        }
        return result;
    }

}