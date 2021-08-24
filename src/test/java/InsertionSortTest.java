import org.junit.jupiter.api.Test;

import java.util.Comparator;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class InsertionSortTest {

    @Test
    void objectsInsertionSort1() {
        String[] expected = {"AA", "AAA", "AB", "ABC", "CF", "PR"};
        String[] actual = {"ABC", "PR", "AA", "AAA", "CF", "AB"};

        InsertionSort.objectsInsertionSort(actual, String::compareTo);

        assertArrayEquals(expected, actual, "Array is not sorted as expected");
    }

    @Test
    void objectsInsertionSort2() {
        User user1 = new User();
        user1.setName("Ivan");
        user1.setAge(10);

        User user2 = new User();
        user2.setName("Stepan");
        user2.setAge(15);

        User user3 = new User();
        user3.setName("Ivan");
        user3.setAge(20);

        User[] expected = {user1, user3, user2};
        User[] actual = {user3, user2, user1};

        InsertionSort.objectsInsertionSort(actual, Comparator.comparing(User::getName).thenComparing(User::getAge));

        assertArrayEquals(expected, actual, "Array is not sorted as expected");
    }

    @Test
    void intInsertionSort() {
        int[] expected = {1, 2, 3, 4, 5, 6, 7};
        int[] actual = {3, 7, 1, 5, 2, 6, 4};

        InsertionSort.intInsertionSort(actual);

        assertArrayEquals(expected, actual, "Array is not sorted as expected");
    }

    private static class User {
        String name;
        Integer age;

        public String getName() {
            return name;
        }

        public Integer getAge() {
            return age;
        }

        public void setName(String name) {
            this.name = name;
        }

        public void setAge(Integer age) {
            this.age = age;
        }

        public String toString() {
            return String.format("User: name %s, age %d", name, age);
        }
    }
}