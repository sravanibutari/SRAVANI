var a;
var b;
var c;
var d;
var e = [1, "hello", true];
var f = [1, 2, 3];
var firstName = "a";
firstName = "b";
var lastName = "c";
var colorRed = 1;
var colorGreen = 2;
var coloryellow = 3;
var Color;
(function (Color) {
    Color[Color["Red"] = 0] = "Red";
    Color[Color["Green"] = 1] = "Green";
    Color[Color["Yellow"] = 2] = "Yellow";
})(Color || (Color = {}));
console.log(Color.Red);
console.log(Color.Green);
console.log(Color.Yellow);
