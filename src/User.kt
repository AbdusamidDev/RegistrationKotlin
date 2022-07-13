class User {
    var userName = "-"
    var parol = "-"
    private var ism: String = "-"
    private var familya: String = "-"
    private var yosh: Byte = 0
    private var kasbi: String = "-"

    constructor(userName: String, parol: String, ism: String, familya: String, yosh: Byte, kasbi: String) {
        this.userName = userName
        this.parol = parol
        this.ism = ism
        this.familya = familya
        this.yosh = yosh
        this.kasbi = kasbi
    }

    override fun toString(): String {
        return "`Home#22`.Task5.`Home#21`.User(E-mail='$userName', Password = '$parol', Name = '$ism', Surname = '$familya', Age = '$yosh', Job = '$kasbi')"
    }
}