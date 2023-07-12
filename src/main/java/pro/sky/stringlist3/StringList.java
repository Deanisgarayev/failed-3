package pro.sky.stringlist3;

public interface StringList {

    String add(String item);

    String add(int index, String item);

    String set(int index, String item);

    String remove(String item);

    String remove(int index);

    boolean contains(String item);

    int indexOF(String item);

    int lastIndexOF(String item);

    String get(int index);

    boolean equals(StringList otherList);

    int size();

    boolean isEmpty();

    void clear();

    String[] toArray();
}
