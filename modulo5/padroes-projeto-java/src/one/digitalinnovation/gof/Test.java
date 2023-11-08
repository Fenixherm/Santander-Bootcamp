package one.digitalinnovation.gof;

import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.*;

public class Test {
    public static void main(String[] args) {
        //Singleton
        /*
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
        */
        //Strategy
        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);

        robo.mover();
    }
}
