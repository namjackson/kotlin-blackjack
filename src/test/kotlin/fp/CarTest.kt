package fp

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class CarTest {
    @Test
    fun 이동() {
        val car = Car("Namjackson", 0)
        val actual: Car = car.move { true }
        assertThat(actual).isEqualTo(Car("Namjackson", 1))
    }

    @Test
    fun 정지() {
        val car = Car("Namjackson", 0)
        val actual: Car = car.move { false }
        assertThat(actual).isEqualTo(Car("Namjackson", 0))
    }
}
