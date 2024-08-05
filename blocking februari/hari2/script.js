function total(){
    var totharga=0;
    var totjumlah=0;
    var diskon=0;

    //document.getElementsByName("m1")

    var inputs=document.querySelectorAll('input[type="number"]');
    inputs.forEach(function(input) {
        var harga=parseFloat(input.parentNode.previousElementSibling.querySelector('span').textContent);
        var jumlah=parseFloat(input.value);

        if (!isNaN(harga) && !isNaN(jumlah)) {
            totharga += harga * jumlah;
            totjumlah += jumlah;
        }
    });

    var djumlah=document.getElementById("jumlah");
    var ddiskon=document.getElementById("diskon");
    var dtotal=document.getElementById("total");

    djumlah.innerHTML="Rp "+totharga.toFixed(2);

    if (totharga>50000){
        diskon=totharga*5/100;
        ddiskon.innerHTML= "Rp "+diskon.toFixed(2);
        dtotal.innerHTML="Rp "+(totharga - diskon).toFixed(2);
    } else {
        ddiskon.innerHTML= "    -    ";
        dtotal.innerHTML="Rp "+totharga.toFixed(2);
    }

}
function struk(){
    var totharga=0;
    var totjumlah=0;
    var diskon=0;

    var m1=document.getElementsByName("m1");
    var m2=document.getElementsByName("m2");
    var m3=document.getElementsByName("m3");
    var m4=document.getElementsByName("m4");
    var m5=document.getElementsByName("m5");

    //document.getElementsByName("m1").innerHTML=m1

    var inputs=document.querySelectorAll('input[type="number"]');
    inputs.forEach(function(input) {
        var harga=parseFloat(input.parentNode.previousElementSibling.querySelector('span').textContent);
        var jumlah=parseFloat(input.value);

        if (!isNaN(harga) && !isNaN(jumlah)) {
            totharga += harga * jumlah;
            totjumlah += jumlah;
        }
    });

    var djumlah=document.getElementById("jumlah");
    var ddiskon=document.getElementById("diskon");
    var dtotal=document.getElementById("total");

    djumlah.innerHTML="Rp "+totharga.toFixed(2);

    if (totharga>50000){
        diskon=totharga*5/100;
        ddiskon.innerHTML= "Rp "+diskon.toFixed(2);
        dtotal.innerHTML="Rp "+(totharga - diskon).toFixed(2);

        print("===========================\n                           S T R U K\n"
        +(document.innerHTML=jumlah+" = ")
        +"\n\nHarga = "
        +(djumlah.innerHTML="Rp "+totharga.toFixed(2))
        +"\n\nDiskon = "
        +(ddiskon.innerHTML= "Rp "+diskon.toFixed(2))
        +"\n\nSubtotal = "
        +(dtotal.innerHTML="Rp "+(totharga - diskon).toFixed(2))
        +"\n\n===========================")
    } else {
        dtotal.innerHTML="Rp "+totharga.toFixed(2);
        print("===========================\n                           S T R U K"
        +"\n\nHarga = "
        +(djumlah.innerHTML="Rp "+totharga.toFixed(2))
        +"\n\nDiskon =   -"
        
        +"\n\nSubtotal = "
        +(dtotal.innerHTML="Rp "+(totharga - diskon).toFixed(2))
        +"\n\n===========================")
    }
}

function reset() {
    var inputs=document.querySelectorAll('input[type="number"]');
    inputs.forEach(function(input) {
        input.value="";
    });

    document.getElementById("jumlah").innerHTML="";
    document.getElementById("diskon").innerHTML="";
    document.getElementById("total").innerHTML="";
}

const pre = document.querySelector("pre");

document.addEventListener("mousemove", (e) => {
  rotateElement(e, pre);
});

function rotateElement(event, element) {
  const x = event.clientX;
  const y = event.clientY;

  const middleX = window.innerWidth / 2;
  const middleY = window.innerHeight / 2;

  const offsetX = ((x - middleX) / middleX) * 100;
  const offsetY = ((y - middleY) / middleY) * 100;

  element.style.setProperty("--rotateX", offsetX + "deg");
  element.style.setProperty("--rotateY", -1 * offsetY + "deg");
}