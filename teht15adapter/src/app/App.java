package app;

public class App {
    public static void main(String[] args) throws Exception {
        Data d = new Data("Person", "Matti");
        System.out.println(d.getData()); 
        IDataFormat idf = new XMLFormat(d);
        System.out.println(idf.data().getFormattedData());

    }
}