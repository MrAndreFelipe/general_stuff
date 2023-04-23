import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PilhaListaTest {

    @Test
    void test(){
        PilhaLista <Integer> c1 = new PilhaLista<Integer>();
        assertTrue(c1.estaVazia());
        c1.push(10);
        assertFalse(c1.estaVazia());
        c1.push(20);
        c1.push(30);
        Assertions.assertEquals(30, c1.pop());
        Assertions.assertEquals(20, c1.pop());
        Assertions.assertEquals(10, c1.pop());
        assertTrue(c1.estaVazia());
        c1.push(10);
        c1.push(20);
        c1.push(30);
        c1.liberar();
        assertTrue(c1.estaVazia());

    }
}