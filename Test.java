class MultiThread extends Thread
{
    public void run() {
        System.out.print(Thread.currentThread().getId()+" ");
    }

    @Override
    public void start() {
        System.out.print(Thread.currentThread().getName()+" ");
    }

    public static void main(String[] args) {
        MultiThread nit = new MultiThread();
        for(int i=0;i<10;i++)
        {
            nit.run();
        }
    }
}