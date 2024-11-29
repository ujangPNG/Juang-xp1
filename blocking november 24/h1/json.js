var tesJson={
    jimel : '@gmail.com',
    umur : 2,
    rumah : 3,
}
console.log(tesJson);
console.log(`hasOwnProperty jimel :${tesJson.hasOwnProperty('jimel')}`);
console.log(`hasOwnProperty alamat : ${tesJson.hasOwnProperty('alamat')}`);

tesJson.jimel='siregoego@gmail.com';
console.log(`Sekarang jimelnya : ${tesJson.jimel}`)


