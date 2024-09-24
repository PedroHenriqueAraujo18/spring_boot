package dos.primeiros.passos.springboot;

import org.springframework.stereotype.Component;

@Component
public class Calculadora {

    public int soma(int a, int b) {
        return a + b;
    }
}
