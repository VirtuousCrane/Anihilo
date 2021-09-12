package cmdVersion;



public class Foo {
    public int data;

    public Foo(int inData){
        this.data = inData;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Foo{" +
                "data=" + data +
                '}';
    }
}
