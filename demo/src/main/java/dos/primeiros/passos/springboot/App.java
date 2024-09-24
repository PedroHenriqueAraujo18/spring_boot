package dos.primeiros.passos.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class App implements CommandLineRunner {
    @Autowired
    private Calculadora calculadora;

    @Override
    public void run(String... args) throws Exception {
    System.out.print("Res:" + calculadora.soma(1,2));
    }
}
