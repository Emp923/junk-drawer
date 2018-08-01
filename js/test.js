// this is a test

var person = {
    firstName: "Eric",
    lastName: "Penrod",
    fullName: function() {
        return this.firstName + " " + this.lastName;
    }
}

console.log("This is a test.");
console.log(person.fullName());
