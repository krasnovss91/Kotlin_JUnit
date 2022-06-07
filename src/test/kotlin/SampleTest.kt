import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SampleTest {
    private val testSample = Sample()

    @Test
    fun testSum(){
        val expected = 42
        assertEquals(expected,testSample.sum(40,2))
    }

    @Test
    fun testSubstract(){
        val expected = 13
        assertEquals(expected,testSample.substract(20,7))
    }

    @Test
    fun testMul(){
        val expected = 56
        assertEquals(expected,testSample.mul(7,8))
    }

    @Test
    fun testDiv(){
        val expected = 3
        assertEquals(expected,testSample.div(15,5))
    }
}