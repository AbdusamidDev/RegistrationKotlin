import java.io.File
import java.util.*

fun main() {
    var malumotRaqami = 0
    val service = Service()
    val filename = File("User Data.txt")
    if (filename.exists()) {

        do {
            println(
                """
           1.Sing in
           2.Sign up
           3.View Signs
           0.Exit 
          Which fun do you want to use:
        """.trimIndent()
            )
            when (Scanner(System.`in`).nextInt()) {
                1 -> service.kirish()
                2 -> service.royhatdanOtish()
                3 -> service.royhatniKorish()
                0 -> malumotRaqami = -1
            }

        } while (malumotRaqami == 0)
    }
}