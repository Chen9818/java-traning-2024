class Test{
    public static void main(String[] args){
        //程式進入點
        Test.talk("hi");//呼叫類別方法
        Test.talk("hello");
        BasicMath.add(3,4);
        BasicMath.minus(3,4);
    }
    // 定義更多自己的類別方法
    static void talk(String content){
        System.out.println(content);
    }
}

class BasicMath{
    static void add(int n1,int n2){
        int result=n1+n2;
        System.out.println(result);
    }
    static void minus(int n1,int n2){
        int result=n1-n2;
        System.out.println(result);
    }
}