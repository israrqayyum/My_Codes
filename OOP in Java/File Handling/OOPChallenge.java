class MyBaseClass {
    private int value = 100;
    public int getValue(){
        return value;
    }
    @Override
    public String toString(){
        return "MyBaseClass: value=" + value;
    }
}
//--------------------------------------------------------------------------------------------------
class MyDerivedClass extends MyBaseClass {
    private int value = 200;
    @Override
    public int getValue(){
        return value;
    }
    @Override
    public String toString(){
        return "MyDerivedClass: value=" + value;
    }
}
//---------------------------------------------------------------------------------------------------
class MyClass {
    private int value;
    public void setValue(int value){
        this.value = value;
    }
    public int getValue() {
        return value;
    }
    @Override
    public String toString() {
        return "MyClass: value=" + value;
    }
}
//---------------------------------------------------------------------------------------------------
public class OOPChallenge {
    public static void main(String[] args){
        MyClass obj1 = new MyClass();
        MyClass obj2 = new MyClass();
        obj1.setValue(10);
        obj2.setValue(20);

        // Demonstrate inheritance and polymorphism
        MyBaseClass baseObj1 = new MyBaseClass();
        MyBaseClass baseObj2 = new MyBaseClass();
        MyBaseClass derivedObj = new MyDerivedClass();

        MyBaseClass[] baseArray = new MyBaseClass[3];
        baseArray[0] = baseObj1;
        baseArray[1] = baseObj2;
        baseArray[2] = derivedObj;

        System.out.println("Values of obj1 and obj2:");
        System.out.println(obj1);
        System.out.println(obj2);

        System.out.println("\nValues of baseArray elements:");
        for (int i = 0; i < baseArray.length; i++) {
            MyBaseClass baseObj = baseArray[i];
            System.out.println(baseObj.getValue());
        }

    }
}
