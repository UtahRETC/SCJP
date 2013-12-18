package com.paniclater.threads;

public class Test {

    static class SafeDeposit {

        private static SafeDeposit sd;

        public static SafeDeposit getInstance() {
            if (sd == null) {
                sd = new SafeDeposit();
            }
            return sd;
        }

        private SafeDeposit() {
        }
    }

    static final Set<SafeDeposit> deposits = Collections.newSetFromMap(new ConcurrentHashMap<SafeDeposit,Boolean>());

    static class Gun implements Runnable {
        private final CountDownLatch wait;

        public Gun  (CountDownLatch wait) {
            this.wait = wait;
        }

        @Override
        public void run() {
            try {
                // One more thread here and ready.
                wait.countDown();
                // Wait for the starting pistol.
                wait.await();
                // Grab an instance - nnnnnnnnow!!!.
                SafeDeposit safe = SafeDeposit.getInstance();
                // Store it in the Set.
                deposits.add(safe);
            } catch (InterruptedException ex) {
                Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }

    // Use that many Threads
    private static final int ArmySize = 1000;

    public static void main(String[] args) throws InterruptedException {
        // The Latch will wait for all threads to be ready.
        CountDownLatch latch = new CountDownLatch(ArmySize);
        Thread[] threads = new Thread[ArmySize];
        for ( int i = 0; i < ArmySize; i++ ) {
            // Make all threads and start them.
            threads[i] = new Thread(new Gun(latch));
            threads[i].start();
        }
        // Wait for all to complete.
        for ( int i = 0; i < ArmySize; i++ ) {
            threads[i].join();
        }
        // How many unique Safes did we et?
        System.out.println(deposits.size());
    }
}
