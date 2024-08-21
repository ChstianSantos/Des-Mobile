import java.util.*

fun main(){
    cont()
}

    fun cont(){

        var maior = 0
        var num : Int

        for (i in 1..5){

            val scanner = Scanner(System.`in`).useLocale(Locale.US)
            print("Insira um numero: ")
            num = scanner.nextInt()

            if (num > maior){
                maior = num
                print("O maoir numero é $maior")
            }

        }
    }