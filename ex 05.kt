import java.util.*

fun main(){
    nota()

fun nota(){
    var scan = Scanner(System.`in`).useLocale(Locale.US)
    println("Insira uma nota: ")
    var nota = scan.nextDouble()

    do{
        var notaValida = false
        if(nota in 0.0..10.0){
            notaValida = true
            println("Nota valida: $nota")
        }else{
            println("Nota $nota inválida, tente novemente")
            println("Insira uma nota:")
            nota = scan.nextDouble()
        }

    }while(!notaValida)
}