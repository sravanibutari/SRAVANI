interface Dimension{
    a:Number
    b:Number
}
function draw(dimension:Dimension){
    console.log(this.a)
}


draw({
    a:50,
    b:40
})
