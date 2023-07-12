package pro.sky.stringlist3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class StringListTest {
    StringList out = new StringListImpl();


        @Test
        public void add() {
            String[] arrays = new String[]{"1"};
            String[] results = new String[]{out.add("1")};
            assertArrayEquals(arrays,results);

        }

        @Test
        public void addElse() {
            String[] arrays = new String[]{"1"};
            String[] results = new String[]{out.add(0,"1")};
            assertArrayEquals(arrays,results);
//
//        @Test
//        public void set(int index, String item) {
//            validateIndex(index);
//            validateItem(item);
//            storage[index] = item;
//            return item;
//        }
//
//        @Test
//        public void remove(String item) {
//            validateItem(item);
//            int index = indexOF(item);;
//            return remove(index);
//        }
//
//        @Test
//        public void remove(int index) {
//            validateIndex(index);
//            String item = storage[index];
//            if (index != size) {
//                System.arraycopy(storage, index + 1, storage, index, size - index);
//            }
//            size--;
//            return item;
//        }
//
//        @Test
//        public void contains(String item) {
//            return indexOF(item)!=-1;
//        }
//
//        @Test
//        public void indexOF(String item) {
//            for (int i = 0; i < size; i++) {
//                String s = storage[i];
//                if (s.equals(item)) {
//                    return i;
//                }
//            }
//            return -1;
//        }
//
//        @Test
//        public void lastIndexOF(String item) {
//            for (int i = size - 1; i >= 0; i--) {
//                String s = storage[i];
//                if (s.equals(item)) {
//                    return i;
//                }
//            }
//            return -1;
//        }
//
//        @Test
//        public void get(int index) {
//            validateIndex(index);
//            return storage[index];
//        }
//
//        @Test
//        public void equals(StringList otherList) {
//            return Arrays.equals(this.toArray(), otherList.toArray());
//        }
//
//        @Test
//        public void size() {
//            return size;
//        }
//
//        @Test
//        public void isEmpty() {
//            return size == 0;
//        }
//
//        @Test
//        public void clear() {
//            size = 0;
//        }
//
//        @Test
//        public void[] toArray() {
//            return Arrays.copyOf(storage,size);
//        }
    }

