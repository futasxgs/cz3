public class Main {
    public static void main(String[] args) {

        SklepKomputerowy sklep = new SklepKomputerowy();


        Produkt laptop = new Produkt();
        laptop.setId(1);
        laptop.setNazwa("Laptop Lenovo");
        laptop.setKategoria("Laptop");
        laptop.setCena(3299.99);
        laptop.setIloscWMagazynie(5);

        Produkt myszka = new Produkt();
        myszka.setId(2);
        myszka.setNazwa("Mysz Logitech");
        myszka.setKategoria("Mysz");
        myszka.setCena(149.99);
        myszka.setIloscWMagazynie(10);

        sklep.dodajProdukt(laptop);
        sklep.dodajProdukt(myszka);


        Klient klient = new Klient();
        klient.setId(1);
        klient.setImie("Jan");
        klient.setNazwisko("Kowalski");
        klient.setEmail("jan@example.com");
        klient.setCzyStaly(true);

        sklep.dodajKlienta(klient);


        Produkt[] produktyZamowienia = {laptop, myszka};
        int[] ilosciZamowienia = {1, 2};

        Zamowienie zamowienie = sklep.utworzZamowienie(klient, produktyZamowienia, ilosciZamowienia);


        System.out.println("=== ZAMÓWIENIE ===");
        zamowienie.wyswietlSzczegoly();


        sklep.aktualizujStanMagazynowy(zamowienie);


        sklep.zmienStatusZamowienia(zamowienie.getId(), "Zrealizowane");


        System.out.println("\n=== STATUS PO ZMIANIE ===");
        zamowienie.wyswietlSzczegoly();


        System.out.println("\n=== PRODUKTY W KATEGORII: Laptop ===");
        sklep.wyswietlProduktyWKategorii("Laptop");

        System.out.println("\n=== PRODUKTY W KATEGORII: Mysz ===");
        sklep.wyswietlProduktyWKategorii("Mysz");


        System.out.println("\n=== ZAMÓWIENIA KLIENTA ===");
        sklep.wyswietlZamowieniaKlienta(1);
    }
}
