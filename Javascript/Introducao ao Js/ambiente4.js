let valores = [8, 1, 7, 4, 2, 9]

for (let i = 0; i < valores.length; i++){
    console.log(`A posição ${i} tem o valor ${valores[i]}`)
}

valores.sort()
console.log(`Usando o sort para ordernar e o for in para correr o array meus valores ficam: `)
for(i in valores ){
    console.log(valores[i])
}

valores.indexOf()
