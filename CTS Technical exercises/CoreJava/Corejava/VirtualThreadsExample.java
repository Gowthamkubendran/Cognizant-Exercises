public class VirtualThreadsExample 
{
    public static void main(String[] args) 
    {
        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++)
	  {
            Thread.startVirtualThread(() -> 
		{
                System.out.println("Hello from virtual thread: " + Thread.currentThread().threadId());
            });
        }
        long endTime = System.currentTimeMillis();
        System.out.println("All virtual threads launched in " + (endTime - startTime) + " ms");
    }
}
