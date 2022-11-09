import ba.unsa.etf.rpr.FiksniBroj;
import ba.unsa.etf.rpr.Grad;
import ba.unsa.etf.rpr.Imenik;

public class Main {
    public static void main(String[] args) {
        Imenik i = new Imenik();
        i.dodaj("Hana", new FiksniBroj("222-333", Grad.SARAJEVO));
        i.dodaj("Lea", new FiksniBroj("444-555", Grad.SARAJEVO));
        i.dodaj("Sara", new FiksniBroj("666-777", Grad.SARAJEVO));
        i.dodaj("Selma", new FiksniBroj("888-999", Grad.ZENICA));
        i.dodaj("Edin", new FiksniBroj("999-101", Grad.BIHAC));

       // var skup = i.izGradaBrojevi(Grad.ZENICA); //ispise 1 - Selma
    //   var skup = i.izGradaBrojevi(Grad.SARAJEVO);//ispise prva 3 za Hanu Leu i Saru
        var skup = i.izGradaBrojevi(Grad.BIHAC); //ispise 1-Edin
        skup.forEach(System.out::println);
    }
}