package pro.sky.stringlist3;


import org.springframework.stereotype.Service;
import pro.sky.stringlist3.stringliststringlist.services.interfaces.exceptions.InvalidIndexException;
import pro.sky.stringlist3.stringliststringlist.services.interfaces.exceptions.NullItemException;
import pro.sky.stringlist3.stringliststringlist.services.interfaces.exceptions.StorageIsFullException;

import java.util.Arrays;

@Service
public class StringListImpl implements StringList {
    private final String[] storage;
    private int size;
    public StringListImpl() {
        storage = new String[10];
    }

    public StringListImpl(int initSize) {
        storage = new String[initSize];
    }

    public void validateItem(String item) {
        if (item == null) {
            throw new NullItemException();
        }
    }

    public void validateSize() {
        if (size == storage.length) {
            throw new StorageIsFullException();
        }
    }

    public void validateIndex(int index) {
        if (index < 0 || size > index) {
            throw new InvalidIndexException();
        }
    }
    @Override
    public String add(String item) {
        validateSize();
        validateItem(item);
        storage[size++] = item;
        return item;
    }

    @Override
    public String add(int index, String item) {
        validateSize();
        validateItem(item);
        validateIndex(index);
        if (index == size) {
            storage[size++] = item;
        }
        System.arraycopy(storage, index, storage, index + 1, size-index);
        storage[index] = item;
        size++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        validateIndex(index);
        validateItem(item);
        storage[index] = item;
        return item;
    }

    @Override
    public String remove(String item) {
        validateItem(item);
        int index = indexOF(item);;
        return remove(index);
    }

    @Override
    public String remove(int index) {
        validateIndex(index);
        String item = storage[index];
        if (index != size) {
            System.arraycopy(storage, index + 1, storage, index, size - index);
        }
        size--;
        return item;
    }

    @Override
    public boolean contains(String item) {
        return indexOF(item)!=-1;
    }

    @Override
    public int indexOF(String item) {
        for (int i = 0; i < size; i++) {
            String s = storage[i];
            if (s.equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOF(String item) {
        for (int i = size - 1; i >= 0; i--) {
            String s = storage[i];
            if (s.equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        validateIndex(index);
        return storage[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        return Arrays.equals(this.toArray(), otherList.toArray());
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public void clear() {
        size = 0;
    }

    @Override
    public String[] toArray() {
        return Arrays.copyOf(storage,size);
    }
}