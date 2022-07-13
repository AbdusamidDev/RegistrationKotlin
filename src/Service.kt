import java.io.File
import java.io.FileNotFoundException
import java.io.FileWriter
import java.io.IOException
import java.util.*

class Service : Rejalashtirish {
    private var input = Scanner(System.`in`)
    private var raqam = 0
    private var foydalanuvchiniMalumotlari: UserService = UserService()
    private var arrayList: ArrayList<User> = ArrayList<User>()

    init {
        val file = File("User Data.txt")
        var myReader: Scanner? = null
        try {
            myReader = Scanner(file)
        } catch (e: FileNotFoundException) {
            e.printStackTrace()
        }
        while (myReader!!.hasNextLine()) {
            val data = myReader.nextLine()
            val userName = data[0].toString()
            val parol = data[2].toString()
            val ism = data[4].toString()
            val familya = data[6].toString()
            val yosh = data[8].code.toByte()
            val kasbi = data[10].toString()
            arrayList.add(User(userName, parol, ism, familya, yosh, kasbi))
        }
    }


    override fun kirish() {
        println("Enter E-mail: ")
        val userName = input.next()
        println("Enter Password: ")
        val parol = input.next()
        var index = -1
        for (user: User in arrayList) {
            if (user.userName == userName && (user.parol == parol)) {
                index = arrayList.indexOf(user)
                break
            }
        }
        if (index != -1) {
            println("\nYour Data\n")
            println(arrayList[index])
            println()
            raqam = 0
            while (raqam == 0) {
                println(
                    """
                    1.Edit
                    2.Delete
                    0.Exit
                    Qaysi malumotdan foydalanmoqchisiz:
                """.trimIndent()
                )
                when (input.nextInt()) {
                    1 -> foydalanuvchiniMalumotlari.edit(arrayList, index)
                    2 -> foydalanuvchiniMalumotlari.delete(arrayList, index)
                    0 -> raqam = foydalanuvchiniMalumotlari.back()
                    else -> println("Error")
                }
            }
        } else println("Error")
    }

    override fun royhatdanOtish() {
        println("Enter your name: ")
        val ism = input.next()
        println("Enter your surname: ")
        val familya = input.next()
        println("Create E-mail: ")
        val userName = input.next()
        println("Create password: ")
        val parol = input.next()
        println("Enter your age: ")
        val yosh = input.nextByte()
        println("Enter your job: ")
        val kasbi = input.next()
        arrayList.add(User(userName, parol, ism, familya, yosh, kasbi))
        try {
            val fileWriter = FileWriter("User Data.txt", true)
            fileWriter.write(
                " Name: $ism  Surname: $familya  E-mail: $userName  Password: $parol  Age: $yosh  Job: $kasbi\n"
            )
            fileWriter.close()
        } catch (e: IOException) {
            e.printStackTrace()
        }
    }

    override fun royhatniKorish() {
        for (user in arrayList) {
            println(user)
        }
    }

    override fun chiqish(): Int {
        return 1
    }
}