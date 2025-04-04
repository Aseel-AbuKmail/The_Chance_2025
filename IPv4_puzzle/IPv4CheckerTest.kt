import kotlin.test.assertFalse
import kotlin.test.assertTrue

class IPv4CheckerTest {

    fun testValidIPv4Addresses() {
        assertTrue(isValidIPv4("192.168.1.1"))
        assertTrue(isValidIPv4("0.0.0.0"))
        assertTrue(isValidIPv4("255.255.255.255"))
        assertTrue(isValidIPv4("1.2.3.4"))
    }

    fun testInvalidIPv4Addresses() {
        assertFalse(isValidIPv4("256.256.256.256")) // Out of range
        assertFalse(isValidIPv4("192.168.1.01")) // Leading zero
        assertFalse(isValidIPv4("192.168.1.")) // Missing segment
        assertFalse(isValidIPv4("192.168.1")) // Not enough segments
        assertFalse(isValidIPv4("192.168.1.1.1")) // Too many segments
        assertFalse(isValidIPv4("abc.def.ghi.jkl")) // Non-numeric values
        assertFalse(isValidIPv4("192.168.-1.1")) // Negative numbers
        assertFalse(isValidIPv4("192.168.1.1a")) // Extra characters
        assertFalse(isValidIPv4("")) // Empty string
    }
}
