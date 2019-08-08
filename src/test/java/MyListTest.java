import org.junit.Test;

import java.util.ArrayList;
import java.util.Iterator;

import static org.junit.Assert.*;

public class MyListTest {

    @Test
    public void testMyList(){
        MyList<String> myList = new MyList<>();
        assertNotNull(myList);
    }

    @Test
    public void testListAdd(){
        MyList<String> myList = new MyList<>();
        myList.add("Hello");
        myList.add("World");
        assertEquals(myList.size(), 2);
    }

    @Test
    public void testMyListIndex(){
        MyList<String> myList = new MyList<String>();
        myList.add("Hello");
        myList.add("World");
        myList.set(1, "Java");
        assertEquals(myList.get(1), "Java");
    }

    @Test
    public void testMyListAdd() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");
        MyList<String> myList = new MyList<String>();
        myList.addAll(arrayList);
        assertEquals(myList.get(1), "World");
        assertEquals(myList.size(), 2);
    }

    @Test
    public void testMyListAddAll() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("World");

        MyList<String> myList = new MyList<>();
        myList.add("Num0");
        myList.add("Num1");
        myList.add("Num2");
        myList.add("Num3");

        assertNotNull(arrayList);

        myList.addAll(1, arrayList);
        assertEquals(myList.get(1), "Hello");
        assertEquals(myList.size(), 6);
        for(int i = 0 ; i < myList.size() ; i++){
            System.out.printf(myList.get(i));
        }
    }

    @Test
    public void testMyListRemove() {
        MyList<String> myList = new MyList<>();
        myList.add("Hello");
        myList.add("World");
        myList.add("Good");
        myList.add("Morning");
        myList.remove(1);
        myList.remove(3);
        assertEquals(myList.size(), 2);
        assertEquals(myList.get(0),"Hello");
    }

    @Test
    public void testMyListRemoveAll() {
        ArrayList<String> removeList = new ArrayList<>();
        removeList.add("World");
        removeList.add("Morning");
        MyList<String> myList = new MyList<>();
        myList.add("Hello");
        myList.add("World");
        myList.add("Good");
        myList.add("Morning");
        myList.removeAll(removeList);
        assertEquals(myList.size(), 2);
        assertEquals(myList.get(0),"Hello");
    }

    @Test
    public void testMyListAddIndex() {
        MyList<String> myList = new MyList<>();
        myList.add("Have");
        myList.add("Nice");
        myList.add("Day!");
        myList.add(1,"a");
        assertEquals(myList.get(1), "a");
        assertEquals(myList.size(), 4);
    }

    @Test
    public void testMyListAddAllIndex() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("it");
        arrayList.add("is!");

        MyList<String> myList = new MyList<>();
        myList.add("Have");
        myList.add("a");
        myList.add("Nice");
        myList.add("Day");
        myList.add(">.<");
        myList.addAll(4, arrayList);
        assertEquals(myList.get(5), "is!");
        assertEquals(myList.get(6), ">.<");
    }

    @Test
    public void test(){
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Hello");
        arrayList.add("Bye");

        Iterator itr = arrayList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }

    @Test
    public void testMyListIterator(){
        MyList<String> myList = new MyList<>();
        myList.add("Hello");
        myList.add("Bye");

        Iterator itr = myList.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
    @Test
    public void testGitPush(){
        System.out.println("TestGitPush");
    }
}
