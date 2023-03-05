let numero = document.getElementById('txtnumber')
let lista = document.getElementById('lista-valores')
let resultado = document.querySelector('#res')
let arrayNumeros = []

function isNumero(numero){
    if(Number(numero) >= 1 && Number(numero) <= 100){
        return true
    } else {
        return false
    }
}

function inLista(numero, lista){
    if(lista.indexOf(Number(numero))!= -1){
        return true
    } else {
        return false
    }
}

function adicionar(){
    if (isNumero(numero.value) && !inLista(numero.value, arrayNumeros)){
        arrayNumeros.push(Number(numero.value))
        let valorAdicionado = document.createElement('option')
        valorAdicionado.text = `Valor ${numero.value} adicionado`
        lista.appendChild(valorAdicionado)
        

    } else {
        alert('Valor inválido ou já inserido na lista')
    }
    numero.value = ''
    numero.focus()
     
}

function finalizar() {
    if(arrayNumeros.length == 0){
        alert('Adicione valores antes de finalizar')
    } else {
        let total = arrayNumeros.length
        let maior = arrayNumeros[0]
        let menor = arrayNumeros[0]
        let soma = 0
        let media = 0

        for (let pos in arrayNumeros){
            soma += arrayNumeros[pos]
            if(arrayNumeros[pos] > maior)
            maior = arrayNumeros[pos]
            if(arrayNumeros[pos] < menor)
            menor = arrayNumeros[pos]
        }

        media = soma / total
        
        resultado.innerHTML = ''
        resultado.innerHTML += `<p>Ao todo, temos ${total} números cadastrados</p>`
        resultado.innerHTML += `<p>O maior valor informado foi ${maior}</p>`
        resultado.innerHTML += `<p>O menor valor informado foi ${menor}</p>`
        resultado.innerHTML += `<p>A soma dos valores informados é ${soma}</p>`
        resultado.innerHTML += `<p>A média dos valores informados é ${media}</p>`
        
    }
    lista.innerHTML = ''
    
}




