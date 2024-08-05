function sec(nomre){
    bil=document.getElementById("angkatotal").innerHTML;
    bil=bil+nomre;
    document.getElementById("angkatotal").innerHTML=bil;
}
function minus(){
    bil=document.getElementById("angkatotal").innerHTML;
    bil="-"+bil;
    document.getElementById("angkatotal").innerHTML=bil;
}
function persen(){
    bil=document.getElementById("angkatotal").innerHTML;
    bil=bil*1/100;
    document.getElementById("angkatotal").innerHTML=bil;
}
function desimal(){
    bil=document.getElementById("angkatotal").innerHTML;
    bil=bil+".";
    document.getElementById("angkatotal").innerHTML=bil;
}
function resetiphone(){
    reset=document.getElementById("angkatotal").innerHTML;
    reset="";
    document.getElementById("angkatotal").innerHTML=reset;
}
function azaltibili(){
    bil=document.getElementById("angkatotal").innerHTML;
    document.getElementById("angkatotal").innerHTML=bil.substring(0,bil.length-1);    
}
function kali(){
    bil=document.getElementById("angkatotal").innerHTML;
    bil=bil+"*";
    document.getElementById("angkatotal").innerHTML=bil;
}
function bagi(){
    bil=document.getElementById("angkatotal").innerHTML;
    bil=bil+"/";
    document.getElementById("angkatotal").innerHTML=bil;
}
function kurang(){
    bil=document.getElementById("angkatotal").innerHTML;
    bil=bil+"-";
    document.getElementById("angkatotal").innerHTML=bil;
}
function tambah(){
    bil=document.getElementById("angkatotal").innerHTML;
    bil=bil+"+";
    document.getElementById("angkatotal").innerHTML=bil;
}
function inspeksi(){
    if (isNaN(eval(hasil))!== false){
        alert("Berhasil")
    }
}
function neticeiphone(){
    hasil=document.getElementById("angkatotal").innerHTML
    inspeksi();
    document.getElementById("angkatotal").innerHTML=eval(hasil)
}