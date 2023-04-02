import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
     /*
     Решить самостоятельно либо разобраться с решением следующей задачи (см. код последней консультации):
Есть лист строк. Написать метод, возвращающий строку, которая встречается в листе раньше - самую короткую или самую длинную. Лист не пустой и строки все разные.
Пример: bb a ff ddd -> a. т.к строка а - самая короткая и встречается раньше самой длинной
Пример: bbbb a ff ddd -> bbbb. строка b - самая длинная и встречается раньше самой короткой.
Написать к этой задаче тесты
      */

        List<String> list = Arrays.asList("bb","a","ff","ddd");
        List<String> list2 = Arrays.asList("bbbb","a","ff","ddd");
        System.out.println(returnString(list));
        System.out.println(returnString(list2));

    }
    public static String returnString(List<String> list){
        String s = list.get(0);
        String b = list.get(0);
        for(int i = 1; i<list.size();i++){
           if(s.length()>list.get(i).length()){
               s= list.get(i);
            }
        }
        for(int j = 1;j< list.size();j++){
            if(b.length()<list.get(j).length()){
                b = list.get(j);
            }
        }
        if(list.indexOf(s)<list.indexOf(b)){
            return s;
        }else
            return b;
    }
}