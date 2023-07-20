function palindromo (texto){
    let invertido = texto.
                    split(""). //separa los elemtos de un string en un array mediante la separacion de cadenas en suocadenas 
                    reverse(). // le da buelta a la una cadena de caracteres de atras acia delante
                    join("");  // este metodo une una cadena de carteres  //El método join() une todos los elementos de una matriz (o un objeto similar a una matriz) en una cadena y devuelve esta cadena.
    
        return (invertido===texto)
}

console.log( "¿Es un palindromo? " + palindromo("ot-to"))
