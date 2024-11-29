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
async function gacha(chance, target) {
    var rand = Math.floor(Math.random() * chance) + 1;
    var attempts = 1;
    let output = `Attempt ${attempts}: ${rand}\n`;
    
    while(rand !== target) {
        await new Promise(resolve => setTimeout(resolve, 1000));
        attempts++;
        rand = Math.floor(Math.random() * chance) + 1;
        output += `Attempt ${attempts}: ${rand}\n`;
    }
    
    const timeString = secondsToTime(attempts);
    return output + `\nGacor di roll ke - ${attempts} (${timeString})`;
} 