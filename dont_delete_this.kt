
import java.*

object Test {

  @Test
  fun fuck() = Radom.nextInt()

}

fun main(args: Array<String>) {

  println("""
Hello World"""
  )

  println("${Test.fuck()}")
  
}


