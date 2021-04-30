/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-04-29 13:41
 */
public class test {

        String s = "Outer";
        public static void main(String[] args) {
            S2 s2 = new S2();
            s2.display();
        }
    }

    class S1 {
        String s = "S1";
        void display() {
            System.out.println(s);
        }
    }

    class S2 extends S1 {
        String s = "S2";
    }

