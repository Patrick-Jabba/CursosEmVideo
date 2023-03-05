//array
let array = ['Patrick', 12, true, '33']


// criação de objeto
let amigo = {
        nome: 'José',
        sexo: 'M',
        peso: 76.4,
        engordar(p){
            console.log('Engordou')
            this.peso += p
        }

}
amigo.engordar(4)
console.log(`${amigo.nome} pesa ${amigo.peso}Kg`)
