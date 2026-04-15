package array;

import java.util.Arrays;
import java.util.Comparator; // Comparator 클래스를 불러온다

public class Array_03 {
    public static void main(String[] args) {

        class User {
            String name;
            int age;

            User(String name, int age) {
                this.name = name;
                this.age = age;
            }
        }

        User[] users = {
                new User("홍길동", 32),
                new User("김춘추", 64),
                new User("임꺽정", 48),
                new User("박혁거세", 14),
        };

        // Arrays.sort(배열, new Comparator<>() { ... });
        Arrays.sort(users, new Comparator<User>() {
            @Override
            public int compare(User u1, User u2) {
                return u1.name.compareTo(u2.name);
            }
        });

        // java8 람다식으로 다음과 같이 축약이 가능
        Arrays.sort(users, (u1, u2) -> u1.name.compareTo(u2.name)); // 이름순 정렬

        // 출력
        for (User u : users) {
            System.out.println(u.name + " " + u.age + "세");
        }

    }
}