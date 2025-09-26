package practice;


// 함수형 인터페이스 : 내부의 하나의 추상메소드만 선언 된 인터페이스. 이 인터페이스만이 람다식의 타깃이 될 수 있다.
@FunctionalInterface
public interface Calculator {
    int sum(int a, int b);
}
