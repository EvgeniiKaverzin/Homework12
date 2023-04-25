public class Main {
    public static void main(String[] args) {

        Author APushkin = new Author("Александр Пушкин ");
        Author Hugo = new Author("Виктор Гюго ");
        Author Hugo1 = new Author("Виктор Гюго ");
        System.out.println(Hugo.equals(Hugo1));
        System.out.println(Hugo.hashCode());
        System.out.println(Hugo1.hashCode());

        Book Dubrovskiy = new Book("Дубрровский ", APushkin, 1841);
        Book Otvergennie = new Book("Отверженные ", Hugo, 1862);

        Dubrovskiy.setYearOfPublishing(1880);
        System.out.println(Dubrovskiy.getAuthor());
        System.out.println(Dubrovskiy.getTitle() + Dubrovskiy.getYearOfPublishing());
        System.out.println();

        Otvergennie.setYearOfPublishing(1881);
        System.out.println(Otvergennie.getAuthor());
        System.out.println(Otvergennie.getTitle() + Otvergennie.getYearOfPublishing());

        System.out.println(Dubrovskiy);
        System.out.println(Dubrovskiy.hashCode());
        System.out.println(Dubrovskiy.equals(Otvergennie));
    }
}
