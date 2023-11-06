package one.digitalinnovation.gof;

public class Test {
    public static void main(String[] args) {
        //Lazy
        SingletonLazy lazy= SingletonLazy.getInstancia();
        System.out.println("Lazy: " + lazy);

        lazy= SingletonLazy.getInstancia();
        System.out.println("Lazy: " + lazy);
        //eager
        SingletonEager eager= SingletonEager.getInstancia();
        System.out.println("Eager: " + eager);

        eager = SingletonEager.getInstancia();
        System.out.println("Eager: " + eager);
        //lazy holder
        SingletonLazyHolder lazyh = SingletonLazyHolder.getInstancia();
        System.out.println("Lazy Holder: " + lazyh);

        lazyh = SingletonLazyHolder.getInstancia();
        System.out.println("Lazy Holder: " + lazyh);
    }
}
