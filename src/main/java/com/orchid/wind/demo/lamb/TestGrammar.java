package com.orchid.wind.demo.lamb;

import com.orchid.wind.demo.dao.People;

import java.util.function.Predicate;

public class TestGrammar {

    public static void main(String[] args) {

        Predicate<Object> malePeople = x -> {
            if(x instanceof People) {
                People xPeople = (People) x;
                if("male".equals(xPeople.getSex())) {
                    return true;
                }
            }
            return false;
        };

        Predicate<Object> malePeople2 = x -> {
            if(x instanceof People) {
                People xPeople = (People) x;
                if("male1".equals(xPeople.getSex())) {
                    return true;
                }
            }
            return false;
        };

        People p = new People();
        p.setName("zly");
        p.setSex("male");
        System.out.println(malePeople.test(p));
        System.out.println(malePeople.and(malePeople2));
        System.out.println(malePeople.negate().test(p));

        System.out.println(malePeople.and(malePeople2).test(p));
        System.out.println(malePeople.test(1));

        System.out.println("Aa".hashCode());
        System.out.println("BB".hashCode());
    }
}
