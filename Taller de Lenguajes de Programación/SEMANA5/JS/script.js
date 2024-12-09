function saludar(){
    // alert("holaaa")
    var miH1 = document.getElementById("miH1")
    var cajadetexto = document.getElementById("txt.nombre")

    miH1.className = "saludo"
    // inner HTML permite ingresar al interior de un HTML para sobreescribir su contenido
    miH1.innerHTML = "Hola, "+cajadetexto.value+" :)"
}

function despedir(){
    var miH1 = document.getElementById("miH1")
    var cajadetexto = document.getElementById("txt.nombre")
    miH1.className = "despedida"
    miH1.innerHTML = "Adiós, "+cajadetexto.value+" <3"
}

function cambiar(){
    var ojo_abierto = document.getElementById(ojo_abierto)
    ojo_abierto.innerHTML = "Imágenes/ojo_cerrado"
}