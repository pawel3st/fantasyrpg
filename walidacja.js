function nazwaCzaru(input) {
    var string = input.value;
    var dlugosc = string.length;
    if ( dlugosc > 50) {
        alert('Nazwa czaru moze miec maksymalnie 50 znakow!');
    }
    else if (dlugosc == 0) {
        alert('Wypelnij pole Nazwa!');
    }
}

function klasyPostaci(selObj) {
    var count = 0;
    for (i = 0; i < selObj.options.length; i++) {
        if (selObj.options[i].selected) {
        count++;
        }
    }
    if(count == 0) {
        alert("Wybierz przynajmniej jedna klase");
    }
    
}

function blokuj() {
    document.getElementById('zasieg_m').disabled=true;
}

function odblokuj() {
    document.getElementById('zasieg_m').disabled=false;
    document.getElementById('zasieg_m').focus();
}