//5! = 5 x 4 x 3 x 2 x 1

function fatorial(n){
    let fatorial = 1
    for(let c = n; c > 1; c--){
        fatorial *= c
        console.log(fatorial)
    }
    return fatorial
}

console.log(fatorial(5))