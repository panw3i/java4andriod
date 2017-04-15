/**
 * Created by pan on 2017/4/12.
 */
class Outer {

    class Inner{
        public void fun(){
            System.out.println("hello world");
        }

    }

    public void fun(){
        new Inner().fun();
    }
}

