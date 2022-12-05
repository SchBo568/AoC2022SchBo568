const fs = require('fs')

fs.readFile('input.txt', (err, data) => {
    if (err) throw err;

    bigResult = 0

    // Make -96 to get the priority of the input
    text = data.toString();
    lines = text.split('\n');

    lines.forEach(line => {
        temp = returnArrayWithSameStuff(line)
        //console.log(temp);
        temp.forEach(char => {
            if(char.charAt(0) == char.charAt(0).toLowerCase()){
                prio = char.charCodeAt(0) - 96
            }
            else{
                prio = char.charCodeAt(0) - 38
            }
            bigResult = bigResult + prio
        });
    });

    console.log("Part 1 = " + bigResult);
})

function returnArrayWithSameStuff(line){
    result = []

    comp1 = line.substring(0, line.length / 2);
    comp2 = line.substring(line.length / 2, line.length)

    for (var i = 0; i < comp1.length; i++) {
        for(var j = 0; j < comp2.length; j++) {
            if(comp1.charAt(i) == comp2.charAt(j)){
                if(!result.includes(comp2.charAt(j))){
                    result.push(comp1.charAt(i))
                }            
            }
        }
    }

    return result;
}
// Part 2
fs.readFile('input.txt', (err, data) => {
    if (err) throw err;

    bigResult = 0

    // Make -96 to get the priority of the input
    text = data.toString();
    lines = text.split('\n');
    counter = 0
    temp = ""

    lines.forEach(line => {
        console.log(line);
        if(counter != 3){
            //console.log(typeof line)
            //console.log("line = "+ line);
            temp = temp + line

            console.log("temp = " + temp);
            counter++
        }
        else{
            console.log("else")
            console.log("else" + temp)
            console.log(">>>>>>>>>>>>>>>>>>>>>>>>".concat(temp));
            counter = 0
            temp = "ödjkfhljsdf"
        }

        console.log("--");
    });

    console.log(bigResult);
})