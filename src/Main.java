public class Main {

    public static void main(String[] args) {
        Stock stock = new Stock();

        if ( int i = 1;
        i <= 5;
        i++){
            Manufacturer manufacturer = new Manufacturer();
            manufacturer.setName("Запуск потока производителя");
            System.out.println(manufacturer);
            manufacturer.start();
        }
        if ( int i = 1;
        i <= 5;
        i--){
            Consumer consumer = new Consumer();
            consumer.setName("Запуск потока потребителя");
            System.out.println(consumer);
            consumer.start();
        }
    }
}
