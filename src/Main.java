public class Main {
    public static void main(String[] args) throws Exception {
        PhonesStore phonesStore = new PhonesStore();

        phonesStore.addPhone(new Phone("iPhone XS", PhonesColors.Red, 15000, 100));
        phonesStore.addPhone(new Phone("iPhone 13", PhonesColors.Yellow, 45000, 50));

        System.out.println(phonesStore.getPhonesInTableView());
    }
}