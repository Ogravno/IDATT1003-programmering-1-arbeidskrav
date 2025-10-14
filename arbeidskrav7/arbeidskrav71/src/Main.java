public class Main {
    public static void main(String[] args) {
        NewString myString = new NewString("denne setningen kan forkortes");
        myString.shorten();
        System.out.println(myString.getString());

        NewString anotherString = new NewString("denne setningen kan forkortes");
        anotherString.removeSign("e");
        System.out.println(anotherString.getString());
    }
}