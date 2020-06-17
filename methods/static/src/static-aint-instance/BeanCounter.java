public class BeanCounter {
    private static int beanCount;
    public BeanCounter() { beanCount++; }
    public static void main (String[]args) {
	    BeanCounter a = new BeanCounter();
	    BeanCounter b = new BeanCounter();
	    BeanCounter c = new BeanCounter();
	    System.out.println(beanCount);
    }

}
