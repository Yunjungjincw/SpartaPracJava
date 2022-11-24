package Generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class GenericsEx {
    public static void main(String[] args) {

    	// 인터페이스인 List 타입의 변수 list를 만듬.
        List<String> list = new ArrayList();
        list.add("string");
        // 만든 list 변수를 가지고 더 상위에 있는 인터페이스인 collection에 할당해줌.
        Collection<String> collection = list;
        
        
        List<Exception> exceptionList =new ArrayList<>();
        Collection<Exception> exceptionCollection = exceptionList;
        
        List<IllegalArgumentException> exceptions = new ArrayList<>();
        //IllegalArgumentException 은 Exception의 자식 클래스 임
        exceptionCollection.addAll(exceptions);
    }
}