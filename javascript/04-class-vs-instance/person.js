class Person {
    constructor(initialAge) {
        if(initialAge<0){
            console.log("Age is not valid, setting age to 0.");
            initialAge = 0;
        }
        this.age = initialAge;
    }

    yearPasses(){
        this.age+=1;
    }

    amIOld(){
        if(this.age<13){
            console.log("You are young.")
        } else if (this.age<18){
            console.log("You are a teenager.")
        } else{
            console.log("You are old.")
        }
    }
}

let ages = [-1,10,16,18];

ages.forEach( age => {
    let person = new Person(age);

    person.amIOld();
    for(let i=0;i<3;i++){
        person.yearPasses();
    }
    person.amIOld();
    console.log("\n")
});