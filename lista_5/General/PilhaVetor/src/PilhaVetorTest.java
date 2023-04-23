import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


class PilhaVetorTest {
    @Test
    void teste() {
        PilhaVetor<Integer> c1 = new PilhaVetor<>(3);
        Assertions.assertEquals(true, c1.estaVazia());
        c1.push(10);
        Assertions.assertEquals(false, c1.estaVazia());
        c1.push(20);
        c1.push(30);
        Assertions.assertEquals(30, c1.pop());
        Assertions.assertEquals(20, c1.pop());
        Assertions.assertEquals(10, c1.pop());
        c1.estaVazia();
        c1.push(10);
        c1.push(20);
        c1.push(30);
        assertThrows(PilhaCheiaException.class,  () -> c1.push(40));
        c1.liberar();
        assertThrows(PilhaVaziaException.class, c1::pop);
        PilhaVetor <Integer> c2 = new PilhaVetor<>(5);
        c1.push(10);
        c1.push(20);
        c1.push(30);
        Assertions.assertEquals(30, c1.peek());
        Assertions.assertEquals(30, c1.pop());
        c2.liberar();
        c2.push(10);
        c2.push(20);
        c2.push(30);
        c2.liberar();
        assertTrue(c2.estaVazia());
        PilhaVetor<Integer> c3 = new PilhaVetor<>(5);
        c2.liberar();
        c3.push(10);
        c3.push(20);
        c3.push(30);
        c2.push(40);
        c2.push(50);
        c3.concatenar(c2);
        Assertions.assertEquals("50, 40, 30, 20, 10", c3.toString());


    }
}