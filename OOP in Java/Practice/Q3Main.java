class Q3Main {
    public static void main(String[] args) {
        QuestionThree q3;
        q3 = new QuestionThree();
        q3.init();
        q3.count = q3.increment() + q3.increment();
        System.out.println(q3.increment());
    }
}

class QuestionThree {
    public int count;
    
    public void init() {
        count = 1;
    }
    
    public int increment() {
        count = count + 1;
        return count;
    }
}
