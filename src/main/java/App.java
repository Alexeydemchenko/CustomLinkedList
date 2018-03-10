public class App {

    public static void main(String[] args) {
        NodeContainer<Integer> ls = new NodeContainer<Integer>();
        ls.add(1);
        ls.add(2);
        ls.add(3);
        ls.add(4);
        ls.add(5);
        ls.add(6);
        ls.add(7);

        for(Integer i : ls){
            System.out.println(i);
        }
    }

}
