function verificar(){
    var data = new Date()
    var ano = data.getFullYear()
    var fAno = document.getElementById('txtAno')
    var resultado = document.querySelector('#res')
    if (fAno.value.length == 0 || Number(fAno.value) > ano){
        alert('[ERRO] Verifique os dados e tente novamente!')
    } else {
       var fsex = document.getElementsByName('radsex') 
       var idade = ano - Number(fAno.value)
       var genero = ''
       var img = document.createElement('img')
       img.setAttribute('id', 'foto')
       if(fsex[0].checked){
           genero ='Homem'
           if (idade >= 0 && idade < 10){
              //Criança
              img.setAttribute('src', './images/kidboy.png')
           } else if(idade < 21){
               //Jovem
               img.setAttribute('src', './images/youngman.png')
           } else if (idade < 50){
               //Adulto
               img.setAttribute('src', './images/man.png')
           } else {
               //Idoso
               img.setAttribute('src', './images/oldman.png')
           }
       } else if (fsex[1].checked){
           genero = 'Mulher'
           if (idade >= 0 && idade < 10){
            //Criança
            img.setAttribute('src', './images/kidgirl.png')
         } else if(idade < 21){
             //Jovem
             img.setAttribute('src', './images/younggirl.png')
         } else if (idade < 50){
             //Adulto
             img.setAttribute('src', './images/woman.png')
         } else {
             //Idoso
             img.setAttribute('src', './images/oldlady.png')
         }
       }
       resultado.style.textAlign = 'center'
       resultado.innerHTML = `Detectamos ${genero} com ${idade} anos.`
       resultado.appendChild(img)

       //resultado.innerHTML = `idade calculada ${idade}`
    }
}

