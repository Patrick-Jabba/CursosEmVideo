function load(){

    var msg = document.getElementById('msg')
    var img = document.getElementById('image')
    var date = new Date()
    var hour = date.getHours()
    
    msg.innerHTML = `Now it's ${hour} o'clock.`
    if (hour >= 0 && hour < 12){
        //Morning
        img.src = "manha250.png"
        document.body.style.background = '#f1b43b'
        
    } else if (hour >= 12 && hour < 18){
        //Afternoon
        img.src = "tarde250.png"
        document.body.style.background = '#BF2D02'
    } else {
        //Night time
        img.src= "noite250.png"
        document.body.style.background = '#11151E'
    }
}