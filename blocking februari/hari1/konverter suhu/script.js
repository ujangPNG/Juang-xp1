function konv(){
    var a=parseFloat(document.getElementById("masuk").value);
    var f=32;
    a= 9/5*a+f;
    document.getElementById("hasilkonversi").innerHTML=a + "<sup>o</sup>F";
}
function konve(){
    var b=parseFloat(document.getElementById("masuk1").value);
    var f=32;
    b= 5/9*(b-f);
    document.getElementById("hasilkonversi1").innerHTML=b + "<sup>o</sup>C";
}

