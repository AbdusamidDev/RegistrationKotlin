import java.util.*

class UserService {
    private var input = Scanner(System.`in`)
    private var userName: String? = null
    private var parol: String? = null
    private var ism: String? = null
    private var familya: String? = null
    private var yosh: String? = null
    private var kasbi: String? = null

    fun edit(arrayList: ArrayList<User>, index: Int) {
        println("\nData Is Saving\n")
        println("Enter e-mail: ")
        userName = input.next()
        println("Enter password: ")
        parol = input.next()
        println("\nAdditional Informations About You\n")
        println("Enter your name: ")
        ism = input.next()
        println("Enter your surname: ")
        familya = input.next()
        println("Enter your age: ")
        yosh = input.next()
        println("Enter your job: ")
        kasbi = input.next()
    }

    fun delete(arrayList: ArrayList<User>, index: Int) {
        arrayList.removeAt(index)
        println(arrayList)
        println("Data Deleted")
    }

    fun back(): Int {
        return 1
    }
}