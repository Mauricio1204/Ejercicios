
function concidencias (frace ,busqueda){
    
    let texto_limpio = frace.toLowerCase().replace(/[!¡¿?.,-]/gi,'');
    let resultado = 0;
    if (texto_limpio.includes(busqueda)){
        
        let palabras = texto_limpio.split(" ");
        let mapa ={};
        for (let palabra of palabras ) {
            
            if (mapa[palabra]){
                mapa[palabra] ++;
            }else{
                mapa[palabra] = 1;
            }
        }
        resultado = mapa[busqueda];

    }else{
        resultado = 0;
    }
    return resultado;
}
console.log(
    "Numero de considiencias",
    concidencias("Hola, que tal, soy  victor victor victor robles","victor")    
    );
