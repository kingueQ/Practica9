package mx.edu.itson.potros.practica9

data class User(
    var firstName:String?=null,
    var lastaName:String?=null,
    var age:String?=null
){
    override fun toString()=firstName+"\t"+lastaName+"\t"+age
}
