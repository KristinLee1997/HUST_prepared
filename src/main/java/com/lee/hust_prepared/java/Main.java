package com.lee.hust_prepared.java;

import java.util.*;

/**
 * @author 李航
 * @school 哈尔滨理工大学
 * @date 2018/1/26 22:15
 * @desc
 **/
public class Main {
    public static void demoRandom() {
        Random random = new Random();
        System.out.println(random.nextInt(100));
        System.out.println(random.nextFloat());
        random.setSeed(1);
        System.out.println(random.nextInt(100));
        System.out.println(random.nextFloat());
    }

    public static void demoMath() {
        System.out.println(Math.abs(-1));
        System.out.println(Math.ceil(2.5));
        System.out.println(Math.floor(2.5));
        System.out.println(Math.log(10));
        System.out.println(Math.max(2, 10));
        System.out.println(Math.min(11, 2));
        System.out.println(Math.round(2.46));
    }

    public static void demoString() {
        String str = "hello world";
        System.out.println(str.equals("hi world"));
        System.out.println(str.charAt(2));
        System.out.println(str.codePointAt(1));
        System.out.println(str.concat("~"));
        System.out.println(str.endsWith("world"));
        System.out.println(str.contains("ello"));
        System.out.println(str.indexOf("w"));
        System.out.println(str.intern());
        System.out.println(str.lastIndexOf(3));
        System.out.println(str.replace("ello", "i"));
        System.out.println(str.replaceAll("e|o|l", "i"));
    }

    public static void demoarraylist() {
        List<String> list = new ArrayList<String>();
        for (int i = 1; i < 5; i++) {
            list.add(String.valueOf(i * i));
        }
        System.out.println(list.get(2));
        System.out.println(list.isEmpty());
        list.add("99");
        System.out.println(list);
        System.out.println(list.contains("4"));
        System.out.println(list.indexOf("9"));
        list.remove("9");
        System.out.println(list);
    }

    public static void demoSet() {
        Set<String> sset = new HashSet<String>();
        sset.add("a");
        sset.add("e");
        sset.add("i");
        sset.add("o");
        sset.add("u");
        System.out.println(sset);
        System.out.println(sset.contains("o"));
        System.out.println(sset.isEmpty());
        sset.remove("o");
        System.out.println(sset);
        System.out.println(sset.size());
    }

    public static void demoHashMap() {
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "a");
        map.put(2, "b");
        map.put(3, "c");
        map.put(4, "d");
        System.out.println(map.containsKey(3));
        System.out.println(map.size());
        System.out.println(map.isEmpty());
        System.out.println(map);
        System.out.println(map.containsValue("c"));
        System.out.println(map.keySet());
        System.out.println(map.values());
        for (Map.Entry e : map.entrySet()) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        demoRandom();
        demoMath();
        demoString();
        demoarraylist();
        demoSet();
        demoHashMap();
    }
}
