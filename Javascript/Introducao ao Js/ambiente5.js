// function parImp(n){
//     if (n % 2 == 0){
//         console.log(`O número ${n} é PAR`)
//     } else {
//         console.log(`O número ${n} é IMPAR`)

//     }
// }

// parImp(2)
// parImp(3)

function parImpar(n){
    if (n % 2 == 0){
        return 'Par!'
    } else {
        return 'Impar!'
    }
}

console.log(parImpar(4))
console.log(parImpar(233))

