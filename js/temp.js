function changeYourVariable(yourVariable, theChange) {
    return theChange(yourVariable);
}

function squareIt(x) {
    return x * x;
}

function doubleIt(y) {
    return y + y;
}

changeYourVariable(3, squareIt);    // 9
changeYourVariable(3, doubleIt);    // 6