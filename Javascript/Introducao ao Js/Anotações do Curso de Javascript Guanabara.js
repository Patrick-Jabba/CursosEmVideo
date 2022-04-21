

n.toString()
ou 
String()

> n1
1545.5
> n1.toFixed(2)
'1545.50'
> n1.toFixed(2).replace('.',',')
'1545,50'
> n1.toLocaleString('pt-BR', {style:'currency', currency: 'BRL'})
'R$ 1.545,50'
> n1.toLocaleString('pt-BR', {style:'currency', currency: 'USD'})
'US$ 1.545,50'
> n1.toLocaleString('pt-BR', {style:'currency', currency: 'EUR'})
'€ 1.545,50'

> 5 == '5'
true
> 5 === '5'
false
> 5 === 5
true
> var y = '5'
undefined
> var x = 5
undefined
> typeof x
'number'
> typeof y
'string'
> x == y
true
> x === y
false
> x != y
false
> x !== y
true
>
> var a = 5
undefined
> var b = 8
undefined
> true && false
false
> true && true
true
> false || false
false
> true || false
true
> a > b && b % 2 == 0
false
> a <= b || b / 2 == 2
true
>

DOM 
window:  location document history

document: html => head body

head => meta title

body => h1 p div etc