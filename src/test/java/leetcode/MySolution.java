package leetcode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Iterator;

public class MySolution {
    public static void main(String[] args) {
        // 数组操作
        ArrayList<String> sites = new ArrayList<String>();
        sites.add("Taobao");
        sites.add("Runoob");
        sites.add("Google");
        sites.add("bye");
//        sites.set(1, "Wiki"); // 第一个参数为索引位置，第二个为要修改的值
        sites.remove(2);
        System.out.println(sites.get(1));  // 访问第二个元素
        System.out.println(sites);
        System.out.println(sites.size());  // 数组大小
        for (int i = 0; i < sites.size(); i++) {
            System.out.println(sites.get(i));
        }
        // 推荐for-each遍历方法
        System.out.println("===排序前：");
        for (String i : sites) {
            System.out.println(i);
        }
        Collections.sort(sites);  // 数字排序
        System.out.println("===排序后：");
        for (String i : sites) {
            System.out.println(i);
        }
        // int是基本数据类型 Integer是对象的引用
        ArrayList<Integer> al = new ArrayList<Integer>();
        int n = 40;
        Integer nI = new Integer(40);
        al.add(n);//不可以
        al.add(nI);//可以
        System.out.println(al.get(0));
        System.out.println(al.get(1));

        // 链表
        LinkedList<String> lsites = new LinkedList<String>();
        lsites.add("Google");
        lsites.add("Runoob");
        lsites.add("Taobao");
        lsites.add("Weibo");
        // 使用 removeLast() 移除尾部元素
        lsites.removeLast();
        System.out.println(lsites);

        // 哈希集合
        HashSet<String> hsites = new HashSet<String>();
        hsites.add("Google");
        hsites.add("Runoob");
        hsites.add("Taobao");
        hsites.add("Zhihu");
        hsites.add("Runoob");  // 重复的元素不会被添加
        for(String i: hsites){
            System.out.println(i);
        }
        System.out.println(hsites);

        //
        HashMap<String, String> hmSites = new HashMap<String, String>();
        // 添加键值对
        hmSites.put("one", "Google");
        hmSites.put("two", "Runoob");
        System.out.println(hmSites);
        System.out.println(hmSites.get("one"));
        for (String i:hmSites.keySet()){
            System.out.println(i);
        }

        // 迭代器
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(8);
        numbers.add(2);
        numbers.add(23);
        // 删除小于 10 的元素
//        numbers.removeIf(i -> i < 10);
        Iterator<Integer> it = numbers.iterator();
        while(it.hasNext()) {
            Integer i = it.next();
            if(i < 10) {
                it.remove();  // 删除小于 10 的元素
                System.out.println("delete:" + i);
            }
        }
        System.out.println(numbers);
    }
}
