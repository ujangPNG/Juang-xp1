// Convert seconds to readable time string
function secondsToTime(seconds) {
    const hours = Math.floor(seconds / 3600);
    const minutes = Math.floor((seconds % 3600) / 60);
    const remainingSeconds = seconds % 60;
    
    let timeString = '';
    if (hours > 0) timeString += `${hours} hours `;
    if (minutes > 0) timeString += `${minutes} minutes `;
    if (remainingSeconds > 0) timeString += `${remainingSeconds} seconds`;
    
    return timeString.trim();
}

function gacha(chance,target) {
    var rand = Math.floor(Math.random() * chance) + 1;
    var ro = 1;
    while(rand !== target) {
        ro++;
        rand = Math.floor(Math.random() * chance) + 1;
        console.log(`ke - ${ro}: ${rand}`);
    }
    
    const timeString = secondsToTime(ro);
    return `gacor di roll ke - ${ro} (${timeString})`;
}
const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

// First ask for chance
readline.question('Enter max range (e.g. 1000): ', chance => {
    // Then ask for target
    readline.question('Enter target number: ', target => {
        // Convert inputs to numbers and run gacha
        console.log(gacha(parseInt(chance), parseInt(target)));
        readline.close();
    });
});
