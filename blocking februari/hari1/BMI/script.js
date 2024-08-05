function hasil(){
    var tinggi = parseFloat(document.getElementById("berat").value);
    var berat = parseFloat(document.getElementById("tinggi").value);
    var bmi = tinggi*tinggi/berat;
    var hasilHitung = document.getElementById("hasilhitung");
    if (bmi < 18.5) {
        hasilHitung.innerHTML = "<p>BMI anda : </p>" + bmi + "<p>Anda dalam status KURUS</p>";
    } else if (bmi >= 18.5 && bmi <= 24.9) {
        hasilHitung.innerHTML = "<p>BMI anda : </p>" + bmi + "<p>Anda dalam status NORMAL</p>";
    } else if (bmi >= 25 && bmi <= 29.9) {
        hasilHitung.innerHTML = "<p>BMI anda : </p>" + bmi + "<p>Anda dalam status OVERWEIGHT</p>";
    } else if (bmi >= 30) {
        hasilHitung.innerHTML = "<p>BMI anda : </p>" + bmi + "<p>Anda dalam status OBESITAS</p>";
    }
}