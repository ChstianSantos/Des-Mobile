fun main(){
    val valor = arrayListOf(1,2,3,4,5,6,7,8,9,10).sum()

    val media = valor / 10

    println("A media dos valores -> $media" )

    if(media <= 5){
        println("media é menor ou igual a 5")
    }else{
        println("media é maior que 5")
    }
}