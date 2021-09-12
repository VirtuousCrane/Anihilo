package cmdVersion;

import java.util.*;

public class FooCompare implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Foo foo1 = (Foo)o1;
        Foo foo2 = (Foo)o2;

        if(foo1.getData() > foo2.getData()){
            return 1;
        } else if (foo1.getData() == foo2.getData()){
            return 0;
        } else {
            return -1;
        }

        //return foo1.getData()-foo2.getData();
    }
}

