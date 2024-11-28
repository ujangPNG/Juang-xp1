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

function gacha(chance, target) {
    var rand = Math.floor(Math.random() * chance) + 1;
    var ro = 1;
    let output = `Roll ${ro}: ${rand}\n`;
    
    while(rand !== target) {
        ro++;
        rand = Math.floor(Math.random() * chance) + 1;
        output += `Roll ${ro}: ${rand}\n`;
    }
    
    const timeString = secondsToTime(ro);
    return output + `\nGacor di roll ke - ${ro} (${timeString})`;
} 