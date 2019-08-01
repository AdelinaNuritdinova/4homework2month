public class Consumer extends Thread {

    Stock stock = new Stock() {

        public void productDecrease() {
            product--;
        }
    };
}
