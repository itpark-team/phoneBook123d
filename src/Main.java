import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        PhonesStore phonesStore = new PhonesStore();

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println(phonesStore.getPhonesInTableView());

            System.out.println("--------");
            System.out.println("Меню");
            System.out.println("1.Загрузить телефоны из файла");
            System.out.println("2.Сохранить телефоны в файл");
            System.out.println("3.Добавить новый телефон");
            System.out.println("4.Удалить существующий телефон");
            System.out.println("5.Изменить существующий телефон");
            System.out.println("0.Выйти");

            System.out.println("Выберите действие");
            int action = scanner.nextInt();

            switch (action) {
                case 0: {
                    System.exit(0);
                }
                break;
                case 1: {
                    phonesStore.loadPhonesFromFile();
                }
                break;
                case 2: {
                    phonesStore.savePhonesToFile();
                }
                break;
                case 3: {
                    System.out.println("Ввведите модель телефона");
                    scanner.nextLine();
                    String model = scanner.nextLine();

                    System.out.println("Ввведите цвет телефона (1,2)");
                    String color = PhonesColors.getColorByNumber(scanner.nextInt());

                    System.out.println("Ввведите цену телефона");
                    int price = scanner.nextInt();

                    System.out.println("Ввведите кол-во таких телефонов на складе");
                    int balance = scanner.nextInt();

                    Phone phone = new Phone(model, color, price, balance);

                    phonesStore.addPhone(phone);
                }
                break;
                case 4: {
                    System.out.println("Ввведите номер телефона для удаления");
                    int numberDelete = scanner.nextInt();

                    phonesStore.deletePhoneByNumber(numberDelete);
                }
                break;
                case 5: {

                }
                break;
            }

        }

    }
}