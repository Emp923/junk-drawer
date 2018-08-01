// this is a test

var person = {
    firstName: "Eric",
    lastName: "Penrod",
    fullName: function() {
        return this.firstName + " " + this.lastName;
    },
    hello: function() {
        return "Hello World!";
    }
}

console.log("This is a test.");
console.log(person.fullName());
console.log(person.hello());
