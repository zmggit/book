package com.zmg.baseTest;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.time.DayOfWeek;
import java.util.*;

// 测试类
@ExtendWith(MockitoExtension.class)
class BaseTest {

    @Test
    void ConnMybase(){
//        String driver = "com.sybase.jdbc4.jdbc.SybDriver"
//        String url = "jdbc:sybase:Tds:172.16.45.3:5000";
//        String username = "test";
//        String password = " password";
//        try {
//        Class.forName(driver);
//            DriverManager.getConnection(url, username, password);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            System.out.println();
//        }

        String driver = "com.mysql.cj.jdbc.Driver";
        String url = "jdbc:mysql://127.0.0.1:3232/test";
        String user = "root";
        String password = "123456";
           try{
                 Class.forName(driver);
                 Connection conn = DriverManager.getConnection(url, user, password);
                 if(conn != null)
                    {
                        System.out.println("get Connection SUCCESS !");
                    }
           }
           catch(Exception e)
           {
               e.printStackTrace();
           }

    }


    @Test
    void List() { //获取用户详情
        String[] names = {"ABC", "XYZ", "zoo"};
        String s = names[1];
        names[1] = "cat";
        System.out.println(s); // s是"XYZ"还是"cat"?
    }

    @Test
    void Static() { //获取用户详情
        Person ming = new Person("Xiao Ming", 12);
        Person hong = new Person("Xiao Hong", 15);
        ming.number = 88;
        System.out.println(hong.number);
        hong.number = 99;
        System.out.println(ming.number);
    }

    @Test
    void ListT() { //泛型数组
        List<String> list = new ArrayList<>();
        list.add("Hello");
        list.add("World");
        String first =  list.get(0);
        String second =  list.get(1);
        System.out.println(first);
        System.out.println(second);
    }

    @Test
    void  Collection() {
        String[] ss = new String[10]; // 可以持有10个String对象
        ss[0] = "Hello"; // 可以放入String对象
        String first = ss[0]; // 可以获取String对象
        for (String s : ss) {
            System.out.println(s);
        }
    }
    @Test
    void Map() {
        Person pr = new Person("张三",22);
        Map<String, Person> map = new HashMap<>();
        map.put("aka-1",pr);
        Person res  = map.get("aka-1");
        System.out.println(res.name);

    }
    @Test
    void EnumMap(){
        Map<DayOfWeek, String> map = new EnumMap<>(DayOfWeek.class);
        map.put(DayOfWeek.MONDAY, "星期一");
        map.put(DayOfWeek.TUESDAY, "星期二");
        map.put(DayOfWeek.WEDNESDAY, "星期三");
        map.put(DayOfWeek.THURSDAY, "星期四");
        map.put(DayOfWeek.FRIDAY, "星期五");
        map.put(DayOfWeek.SATURDAY, "星期六");
        map.put(DayOfWeek.SUNDAY, "星期日");
        System.out.println(map);
        System.out.println(map.get(DayOfWeek.MONDAY));
    }



    @Test
    void TreeMap(){
        //       使用TreeMap时，放入的Key必须实现Comparable接口。String、Integer这些类已经实现了Comparable接口，因此可以直接作为Key使用。作为Value的对象则没有任何要求。
//        Map<String, Integer> map = new TreeMap<>();
//        map.put("orange", 1);
//        map.put("apple", 2);
//        map.put("pear", 3);
//        for (String key : map.keySet()) {
//            System.out.println(key);
//        }
        //实现了Comparable接口
        Map<Person, Integer> mapS = new TreeMap<>(new Comparator<Person>() {
            public int compare(Person p1, Person p2) {
                if (p1.age == p2.age) {
                    return 0;
                }
                return p1.age > p2.age ? -1 : 1;
            }
        });
        mapS.put(new Person("Tom1",1), 1);
        mapS.put(new Person("Tom9",9), 9);
        mapS.put(new Person("Tom4",4), 4);
        mapS.put(new Person("Bob3",3), 3);
        mapS.put(new Person("Tom6",6), 6);
        mapS.put(new Person("Lily2",2), 2);
        for (Person key : mapS.keySet()) {
            System.out.println(key.name);
        }
        // {Person: Bob}, {Person: Lily}, {Person: Tom}
        System.out.println(mapS.get(new Person("Bob",2))); // 2
    }
}


class Person {
    public String name;
    public int age;

    public static int number;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
}


