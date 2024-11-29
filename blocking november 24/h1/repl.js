let str="BOOOM!!";
for (i=10; i>=0;i--){
    console.log(`${i} detik sebelum ledakan`);
    var nol=i+0.01
    if(i===0){
        console.log(str);
        console.log("Bom meledak pada detik ke - "+parseInt(nol)+`. \n Sedangkan para penumpang baru menyadarinya pada ${parseFloat(nol)} detik sebelum ledakan`);
    }
}