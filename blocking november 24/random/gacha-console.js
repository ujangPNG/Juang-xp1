const readline = require('readline').createInterface({
    input: process.stdin,
    output: process.stdout
});

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

// Main gacha function
async function gacha(chance,target) {
    var rand = Math.floor(Math.random() * chance) + 1;
    var attempts = 1;
    console.log(`Attempt ${attempts}: ${rand}`);
    
    while(rand !== target) {
        await new Promise(resolve => setTimeout(resolve, 1000));//delaynya di sini
        attempts++;
        rand = Math.floor(Math.random() * chance) + 1;
        console.log(`Attempt ${attempts}: ${rand}`);
    }
    
    const timeString = secondsToTime(attempts);
    return `gacor di roll ke - ${attempts} (${timeString})`;
}

// First ask for chance
readline.question('Enter max range (e.g. 1000): ', chance => {
    // Then ask for target
    readline.question('Enter target number: ', target => {
        // Convert inputs to numbers and run gacha
        gacha(parseInt(chance), parseInt(target)).then(result => {
            console.log(result);
            readline.close();
        });
    });
});
