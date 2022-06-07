import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class SampleTest {
    private val testSample = Sample()

    @Test
    fun testSum(){
        val expected = 42
        assertEquals(expected,testSample.sum(40,2))
    }
}