let numeros = [5, 8, 2, 9, 3]

numeros[3]=6

//Adiciona valor ao vetor
numeros.push(7)

//Length não é um método é um atributo em Javascript entao nao leva ()
numeros.length

console.log(`Nosso vetor é o ${numeros}`)
console.log(`Nosso vetor tem a capacidade de ${numeros.length} elementos ou posições ou índices.`)
console.log(`O segundo valor do vetor é ${numeros[1]}.`)

//Coloca o vetor em ordem
numeros.sort()

console.log(`Em ordem os valores do vetor ficam: ${numeros}`)

let pos = numeros.indexOf(4)
if (pos == -1){
    console.log('O valor não foi encontrado!')
} else {
    console.log(pos)

}

