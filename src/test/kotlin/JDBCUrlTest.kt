import org.example.JDBCUrl
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

class JDBCUrlTest {

    @Test
    fun hidePasswordFromConnection() {
        val foo = JDBCUrl()
        val hidePasswordFromConnection =  foo::hidePasswordFromConnection

        assertEquals( "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=*****", hidePasswordFromConnection("jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?user=root&password=12345"))
        assertEquals( "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?password=*****&user=root", hidePasswordFromConnection( "jdbc:mysql://sdasdasdasd:szdasdasd:dfsdfsdfsdf/sdfsdfsdf?password=12345&user=root" ) )
        assertEquals( "jdbc:as400://14.4.5.54:2021/mydatabase:eu?password=**********&user=adminadmin", hidePasswordFromConnection( "jdbc:as400://14.4.5.54:2021/mydatabase:eu?password=qwertyuiop&user=adminadmin" ) )
    }
}