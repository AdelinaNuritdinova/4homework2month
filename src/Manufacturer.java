public class Manufacturer extends Thread {

    Stock stock = new Stock() {

        public void productIncrease() {
            product++;
        }

    };
}
