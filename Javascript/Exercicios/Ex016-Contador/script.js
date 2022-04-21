function contar(){
    let count = document.getElementById('count')
    let numFim = document.getElementById('numFim')
    let passo = document.getElementById('passo')
    let resultado = document.getElementById('resultado')
    
    if(count.value.length == 0 || numFim.value.length == 0 || passo.value.length == 0){
        resultado.innerHTML = 'Impossível contar!'
        alert('[ERRO] Faltam dados!')
    } 
    else {
        resultado.innerHTML = 'Contando: <br>'
        let ini = Number(count.value)
        let fim = Number(numFim.value)
        let p = Number(passo.value)
        if (p <= 0){
            alert('Passo invalido! Considerando PASSO 1')
            p = 1
        }

        if ( ini < fim){
            //Contagem crescente
            for (let c = ini; c <= fim; c += p){
                resultado.innerHTML += `${c} \u{1F449}`
            }
            
        } 
        else {
            //Contagem Regressiva
            for (let c = ini; c >= fim; c -= p){
                resultado.innerHTML += `${c} \u{1F449}`
            }
        }
        resultado.innerHTML += `\u{1F3C1}`
    }
}


