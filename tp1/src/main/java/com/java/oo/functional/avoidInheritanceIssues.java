package com.java.oo.functional;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class avoidInheritanceIssues {


    private static Map<Class, Consumer<AbstractType>> consumerResourceMap = new HashMap<>();

    public static void main(String[] args) {

        consumerResourceMap.put(Type1.class, aClass -> System.out.println("Suppose to call external system for Type1 rather than system.out... "));
        consumerResourceMap.put(Type2.class, aClass -> System.out.println("Suppose to call external system for Type2 rather than system.out... "));

        List<AbstractType> superListList = Arrays.asList(new Type1(), new Type2());

        // that avoid boilerplate , InstanceOf.. and if else logic ...

        superListList.forEach(e-> consumerResourceMap.get(e.getClass()).accept(e));


    }


}
