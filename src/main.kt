fun main(){
    string()
    modulus()
    stmt()
    sentence()
}
fun string(){
    var name = "codeHive"
    println(name[5].toString()+name[6]+name[7]+name[8])
}
fun modulus(){
    var a = 32
    var b = 7
    var remainder = a%b
    println(remainder)
}
fun stmt(){
    var name = "Ashly Ochwada"
    var age = 20
    println("Hi, my name is $name and I am $age years old")
}
fun sentence(){
    var name = "codeHive"
    println(name.length)
}