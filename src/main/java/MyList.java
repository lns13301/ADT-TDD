import java.util.*;

public class MyList<String> implements List<String> {

    private String[] array;
    private int size;

    public MyList(){
        this.array = (String[]) new Object[1];
        this.size = 0;
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
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {

            private int index = 0;

            @Override
            public boolean hasNext() {
                if(index == size){
                    return false;
                }
                return true;
            }

            @Override
            public String next() {
                index++;
                return get(index - 1);
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T> T[] toArray(T[] a) {
        return null;
    }

    @Override
    public boolean add(String element) {
        if(size >= array.length){
            String[] bigger = (String[]) new Object[array.length * 2];
            System.arraycopy(array, 0, bigger, 0, array.length);
            array = bigger;
        }
        array[size] = element;
        size++;
        return true;
    }

    @Override
    public void add(int index, String element) {
        if(index < 0 || index > size){
            throw new IndexOutOfBoundsException();
        }
        if(size >= array.length){
            String[] bigger = (String[]) new Object[array.length * 2];
            System.arraycopy(array, 0, bigger, 0, array.length);
            array = bigger;
        }
        for(int i = size; i > index ; i--){
            array[i] = array[i-1];
        }
        size++;
        array[index] = element;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for(Object element : c){
            if(!contains(element))
                return false;
        }
        return false;
    }

    @Override
    public boolean addAll(Collection<? extends String> c) {
        boolean flag = true;

        for(String element : c) {
            flag &= add(element);
        }
        return flag;
    }

    @Override
    public boolean addAll(int index, Collection<? extends String> c) {
        for(String element : c){
            add(index++, element);
        }
        return false;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        size = 0;
    }

    public boolean equals(Object target, Object element) {
        if (target == null)
            return element == null;
        else
            return target.equals(element);
    }

    @Override
    public int hashCode() {
        return 0;
    }

    @Override
    public String get(int index) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index];
    }

    @Override
    public String set(int index, String element) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        return array[index] = element;
    }

    @Override
    public String remove(int index) {
        if(index < 0 || index > size) {
            throw new IndexOutOfBoundsException();
        }
        String element = array[index];
        for(int i = index ; i < size - 1 ; i++){
            array[i] = array[i+1];
        }
        size--;
        return element;
    }

    @Override
    public boolean remove(Object o) {
        remove(indexOf(o));
        return false;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        /*Object[] objects = c.toArray();
        for(int i = 0 ; i < c.size() ; i++){
            for(int j = 0 ; j < size ; j++){
                if(objects[i].equals(array[j])){
                    remove(j);
                }
            }
        }*/
        for(Object element : c){
            remove(element);
        }
        return false;
    }

    @Override
    public int indexOf(Object o) {
        for(int i = 0 ; i < size ; i++){
            if(o.equals(array[i])){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public ListIterator<String> listIterator() {
        return null;
    }

    @Override
    public ListIterator<String> listIterator(int index) {
        return null;
    }

    @Override
    public List<String> subList(int fromIndex, int toIndex) {
        return null;
    }
}
